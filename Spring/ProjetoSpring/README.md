## Pratica com Java e Spring Framework usando padrões de projetos

### Conteúdo do projeto:

Foram usados os seguintes padrões de projetos 

- Singleton

- Strategy

- Facade

O projeto foi feito acompanhando as aulas do curso Explorando padrões de projeto na pratica com Java da DIO.

Portanto ele é uma cópia quase que integral do projeto desenvolvido em aulas com algumas pequenas modificações.

As modificações foram no arquivo pom.xml cuja versão desenvolvida para o Swagger não carregava e também não acontecia os seguintes  Imports da classe de testes.

import org.junit.jupiter.api.Test;  
import org.springframework.boot.test.context.SpringBootTest;

Isso impedia a execução do aplicativo. A solução inutilizar essa classe.




