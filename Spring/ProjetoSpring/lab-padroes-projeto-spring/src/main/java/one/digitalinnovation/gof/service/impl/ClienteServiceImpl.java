package one.digitalinnovation.gof.service.impl;

import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.model.ClienteRepository;
import one.digitalinnovation.gof.model.Endereco;
import one.digitalinnovation.gof.model.EnderecoRepository;
import one.digitalinnovation.gof.service.ClienteService;
import one.digitalinnovation.gof.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Implementação da <b>Strategy</b> {@link one.digitalinnovation.gof.service.ClienteService}, a qual
 * pode ser injetada pelo Spring (via {@link org.springframework.beans.factory.annotation.Autowired})
 * Com isso , como essa classe é um {@link org.springframework.stereotype.Service},ela sera tratada como
 * um <b>Singleton</b>
 *
 * @author Paulo Martins
*/


@Service
public class ClienteServiceImpl implements ClienteService {
    //Singleton : Injetar os componentes do Spring com @Autowired.
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private ViaCepService viaCepService;
    //Strategy: Implementar os métodos definidos na interface.
    //Facade: Abstrair integrações com subsistemas , provendo uma interface simples.

    @Override
    public Iterable<Cliente> buscarTodos(){
        // Buscar todos os Clientes .
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id){
        // Buscar os Clientes por ID .
        Optional <Cliente> cliente = clienteRepository.findById(id);
        return cliente.get();
    }

    @Override
    public void inserir(Cliente cliente){
        salvarClienteComCep(cliente);
    }

    @Override
    public void atualizar (Long id, Cliente cliente) {
        //Buscar Cliente por ID, caso exista
        Optional<Cliente> clienteBd = clienteRepository.findById(id);
        if (clienteBd.isPresent()) {
            //Verificar se o endereço da cliente já existe(pelo CEP).
            //Caso não exista, integrar com o ViaCep e persistir o retorno.
            //Alterar Cliente, vinculando o endereço (novo ou existente).
            salvarClienteComCep(cliente);
        }
    }

    @Override
    public void deletar (Long id){
        //Deletar Cliente po ID.
        clienteRepository.deleteById(id);
    }

    private void salvarClienteComCep(Cliente cliente) {
        // Verificar se o endereço da cliente já existe(pelo CEP).
        String cep = cliente.getEndereco().getCep();
        Endereco endereco =  enderecoRepository.findById(cep).orElseGet(() ->{
            //Caso não exista, integrar com o ViaCep e persistir o retorno.
            Endereco novoEndereco = viaCepService.consultarCep(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        });
        cliente.setEndereco(endereco);
        //Inserir Cliente, vinculando o endereço (novo ou existente).
        clienteRepository.save(cliente);
    }
}
