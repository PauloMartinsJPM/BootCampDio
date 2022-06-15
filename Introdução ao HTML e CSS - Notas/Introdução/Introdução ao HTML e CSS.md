## Essas são anotações do curso HTML5 e CSS3 da DIO

### HTML

###### Estrutura Básica

![](C:\Users\jpaul\Desktop\Estrutura%20Basica%203.jpg)

Coloquei uma imagem aqui pra mostras a estrutura básica de uma página HTML mas no GitHub não aparece. Já tentei mudar a extenção do arquivo mas também não funcionou. Tentei colocar direto pelo GitHub mas não entendi como faz isso. Vou verificar de existe uma maneira depois.

#### Obs: Todos os elementos possuem um sinal de menor-maior para abrir a semântica e para fechar possuem o sinal de menor-barra normal-maior. Não os coloco aqui porque o editor de markdown vai entrar em modo de edição.

Em 2014 com a versão 5 do HTML foram criados novos elementos relacionados a semântica a saber:

<section... Representa uma seção genérica de conteúdo

<header...Cabeçalho de página ou de parte de uma página

<article...Conteúdo relevante

<aside...Conteúdo relacionado ao conteúdo relevante

<footer...Rodapé de pagina , ou de artigo, ou de uma section

<h1<h6...Não foram criados na versão 5 mas trazem consigos elementos de semântica. São utilizados para marcar a importância dos títulos, sendo <h1 o mais importante e <h6 o menos.

<section - Representa uma seção genérica de conteúdo

<header - Cabeçalho de página ou de parte da página

<article - Conteúdo relevante

<aside - Conteúdo relacionado ao conteúdo principal da página

<footer - Rodapé de página, ou de um article, ou de uma section

<h1 até h6 - Não foram criados na versão 5 mas trazem semântica a pagina

<p...Texto maiores que podem conter imagens , códigos, vídeos..

<a ...Ancora que interliga vários conteúdos na WEB. Possui diversos atributos mas vamos focar em apenas dois por hora:

<a href = estará entre aspas e apontará para sites, emails, telefones e etc

<a target = __blank , indica como esse link vai ser aberto, blank fara a página ser aberta em uma nova aba.

Esse href fica na parte de um texto , ou seja, entre os as das ancoras fica o texto original. Esse texto fica em destaque mostrando que ali tem um link. O href e o target vem logo depois do primeiro a dessa maneira <a href ...target. Ver esse detalhe no exercicio de exemplo. Para o email e tel o procedimento é o mesmo.

Para postar imagens, a primeira coisa a se fazer é escolher as imagens. E elas podem estar no seu computador ao na internet. Se a imagem estiver no seu computador precisaremos do nome dela e se estiver na rede precisaremos do camimho até ela. 

O comando sera <img src =''por exemplo.jpeg , fecha aspas alt abre aspas Explicação da foto fecha aspas.

Uma dica muit boa dada pelo professor que vale a pena conferir é o site de imagens gratuitas que fica no seguinte endereço:[Imagens gratuitas] ( [Beautiful Free Images & Pictures | Unsplash](https://unsplash.com/))

O ultimo elemento mostrado é a lista. Elas servem para agrupar coleções de itens .

Lista UL - Listagem onde as ordens dos itens não são importantes.

Lista OL - A ordem dos items são importantes

Lista LI - É um item dessas  listas.

## CSS

Basicamente foi criado um arquivo a parte chamado style.css como se fosse uma nova classe. Em seguida é editado no head da nossa página um link com esse arquivo criado dessa maneira:

link rel = stylesheet href stylecss

<link rel = "stylesheet" href = "style.css">

Nesse arquivo são criadas regras que alteram diretamente a página html. Essas alterações são feitas :

- diretamente pelos elementos da página, 

- através de um ID que vai alterar a parte mais importante da página que no nosso caso é o primeiro header que sera configurado dessa maneira < h1 id = "title">, e é representado pelo simbolo hash # no arquivo style.css, no caso #title. 

- E por diversas classes que são espalhadas em pontos estratégicos da página e são representados  por ponto como por exemplo .subtitle que foi inserido na pagina dessa maneira, <h2  class = "subtitle" . 

As configurações no arquivo style.css tem essa notação:

seletor(es) {

    propriedade x valor x ;

    propriedade y valor ;

}

Onde :

- Seletores podem ser elementos html (body, a, p, h1, ...etc) ou o ID ou as classes.

- Propriedades diz respeito as caracteristicas do seletor como tamanho, cores, etc

- Valores como o nome ja sugere são os valores configurados 

O conjunto formado pelas propriedades e valores são chamados de declarações

#### As declarações usadas no curso foram:

background-color - definição de cor de fundo

font-family - definição da fonte

width - define largura da página

max-width - definição de largura mas com ajuste automático ao tamanho de tela disponível

margin - Diversas opções para definir margem e tem opção auto para ajuste automatico de espaçamentos

color : definição de cor

font - diversas opções como tamanho, estilo entre outras para configurar fonte escolhida

padding - Define espaçamento de conteúdo. É diferente de margem .  Pode-se definir um padding para cada lado mas caso todos forem iguais basta definir somente um .

border- Define tamanho, estilo e cor da borda

border-radius - Define raio da borda. 100% deixa um quadrado redondo.

text - configura etexto

list - Diversas opções para configuração de lista 




