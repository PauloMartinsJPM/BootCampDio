## Introdução ao Git e ao GitHub

Essas são minhas anotações do curso Introdução ao Git e ao GitHub. Eu vinha fazendo essas anotações em documentos do word pois não sabia do markdown. O professor usa como exemplo um documento do word que vai tendo sucessivas melhorias para explicar a questão das versões.

 O Git é diferente do GitHub. Eu achava que era a mesma coisa.

O Git e o Git Hub serve pra ;

·         Controle de versões

·         Armazenamento em nuvem

·         Trabalho em equipe

·         Melhorar um código

·         Reconhecimento

GUI x CLI

·         GUI – Graphics User Interface

·         CLI – Command Line Interface

É claro que o curso vai ser usando o CLI

·         Mudar de Pastas

·         Listar Pastas

·         Criar Pastas / Arquivos

·         Deletar Pastas / Arquivos

Ele deu uma dica muito legal que de repente nem precisaria instalar o Linux. Trata-se do Windows Subsystem for Linux. (WSL) que é o prompt do Linux rodando no Windows. Mas por hora eu não consegui instalar.

Consegui instalar depois de muitas configurações no meu notebook. Principalmente no que diz respeito a virtualização e configurações de máquinas virtuais. Fiz vários testes e parece funcionar bem.

Tabela de comandos básicos doWindows versus Linux

| Windows       | Linux   | O que faz?                                         |
| ------------- | ------- | -------------------------------------------------- |
| DIR           | LS      | Lista os diretórios/repositórios/pastas            |
| CD            | CD      | Navega entre pastas                                |
| CD /          | CD /    | Vai para o diretório raiz. Linux exige o espaço    |
| CD ..         | CD ..   | Retrocede um nível                                 |
| CLS           | CLEAR   | Limpa a tela                                       |
| ECHO          | ECHO    | Cria um arquivo. Ex; echo hello > hello.txt        |
| MKDIR         | MKDIR   | Cria um diretório                                  |
| DEL           | RM      | Apaga arquivos                                     |
| RMDIR .. /S/Q | RM - RF | Apaga a pasta                                      |
|               | SUDO    | Modo administrador                                 |
|               | PWD     | Mostra o caminho completo nas pastas de diretórios |
|               | MV      | Move Arquivo Ex; mv arquivo destino                |
|               | Q       | sair                                               |
|               | CONFIG  | Configura diversas coisas                          |

Com relação a instalação do GITtudo ok no meu notebook. Lembrando que GIT é diferente do GitHub.

O GIT BASH é o terminal do GIT

Como o GIT funciona por debaixo dos panos

Possui as seguintes características: O SHA1, Objetos Fundamentais, Sistema distribuído e Segurança.

SHA1 – SECURE HASH ALGHORITM – É um algoritmo de encriptação que gera um conjunto de 40 dígitos que identificam um arquivo.

No desktop do Windows procure e execute o Git Bash Here, isso fara que o Git Bash já fique na pasta que se esta trabalhando, no caso o desktop. No desktop foi criado um arquivo txt e no Git Bash rodado o seguinte comando: openssl sha1 arquivo.txt. Isso gerou uma chave, um código de 40 dígitos único para esse arquivo txt. Qualquer mudança nesse arquivo, por mínima que seja , e se eu rodar o comando, openssl sha1arquivo.txt,  novamente , isso criara uma outra chave de encriptação. Só sendo possível restaurar a chave anterior se as alterações  forem desfeitas. Exemplos de chaves:

57f52e5c31a28e120df6f7fa7de3a5c5278b819a– chave para o arquivo original

2b849cf29a39683d4ec75b40b7c1030d6d32fa0c– chave do arquivo modificado

57f52e5c31a28e120df6f7fa7de3a5c5278b819a– chave do arquivo restaurado no original

Os Objetos fundamentais do git são: **Blobs, Trees, Commits**

**Blob** – é um objeto que vai ter o tipo de arquivo, o tamanho desse arquivo ou objeto, uma barra invertida com zero \0 e o conteúdo propriamente dito do arquivo seja ele texto ou binário. Essas informações são chamadas de metadados pelo professor.

**Trees** – (arvores) As trees armazenam blobs ou apontam para blobs ou outras trees. Também contém metadados,a \0 (barra invertida zero) que é uma coisa que o professor fala muito e tem seu próprio sha1. É responsável por montar toda a estrutura de onde estão localizados os arquivos. Qualquer mudança em qualquer dos blobs ou trees nessa estrutura será refletido na tree.

**COMMIT** –É o objeto mais importante de todos. É ele que vai juntar tudo. O commit aponta para uma tree, aponta para um parente, para um autor e aponta para uma mensagem dando sentido a tudo. Leva também um “carimbo” de TIMESTAMP que marca o horário e data no momento que foi criado. É claro, também possui seu próprio SHA1. Fica tudo amarrado com seus respectivos SHA1s. Qualquer alteração mínima em um blob,reflete na tree, que refletira no commit.

SISTEMA DISTRIBUIDOE SEGURANÇA – Imagina um repositório hostiado na Nuvem. E esse repositóriorepresenta o estado final do código de uma empresa. E que se tem 40 pessoascontribuindo com a manutenção desse código. Na máquina dessas 40 pessoas tambémtem essa versão desse código. Então, qualquer mudança feita por alguém na horaé refletida pelo commit e se acontecer alguma coisa com o repositório na nuvemainda terá 40 cópias com as pessoas que trabalham e mantem esse código. Entãoessa é uma foto do porque o Git é um sistema distribuído e seguro.

Há dois métodosde conexão com GitHub. Por Chave SSH e por Token

CHAVE SSH – Éuma forma de estabelecer uma conexão segura , encriptada, entre duas máquinas ,no caso entre o GitHub e o meu computador . Segue a sequencias de comandos noGit Bash para criar uma chave SSH:

$ ssh-keygen -ted25519 -C  [jorgepaulomartins@gmail.com](mailto:jorgepaulomartins@gmail.com) 

                Vai ter algumas informações mas é pra dar :  enter

                Vai pedir uma senha :  "senha" enter

                A chave é gerada e aparece algumas informações menos a chave

$ cd /c/users/jpaul/.ssh/  

    Esse é a caminho no meu computador. O ponto do (.ssh) significa que essa pasta    é oculta

$ ls

                Id_ed25519      id_ed25519.pub

                É gerado 2 chaves. Uma privada e uma pública. A pública é usada pelo processo   de conexão por chave SSH e a privada é praser usada  no seu computador .

$ cat id_ed25519.pub  

    Porque a chave compartilhada no GitHub é pública. A chave é mostrada. Ela é copiada e colada lá no SSH KEYS do GitHub. O caminho para o SSH Keys fica nas  informações do meu perfil.

$ eval$(ssh-agent -s)

                Agent pid 1382   -  é inicializado o agente ssh com o pid 1382

$ ssh-addid_ed25519

                Nesse caso e nesse processo é para inserir a chave privada. Pede a senha criada    no começo do processo "senha".

Fica estabelecido a conexão direta, sem necessidade de login e senha, entre o seu (meu)computador e o GitHub.

Para clonar um repositório no GitHub usando a Chave SSH eu vou até o repositório que eu quero clonar,no meu caso eu clonei o repositório que meu professor de Java da Udemy tinha acabado de postar, vou até a aba **code** e escolha a opção SSH, não usar ao pção HTTP. Vai aparecer um endereço, copie esse endereço. Naveguei pelo GitBash até uma pasta que eu criei pelo próprio Git Bash a saber ( c / workspace /ssh-test ) foi dado o seguinte:

...ssh-test$ gitclone (aqui é colado o endereço copiado do repositório do site Github)

                Dar enter e dar yes

Pronto, o repositório é clonado para a pasta que você determinou. Se eu der um ls os arquivos estarão lá.  

O processo de conexão com Token tem uns passos meio parecidos, mas não vou detalhar a não ser que para clonar o arquivo usa-se a opção HTTP e vai pedir o token para confirmar. Você terá que guardar esse token senão já era. Criar Chave SSH me pareceu bem melhor.

**CRIANDO UM REPOSITÓRIO**

Usaremos os comandos básicos do git : git init , git add , git commit

Navegar até a pasta que criamos workspace, faremos isso da maneira mais simples que é acionar o Git Bash pelo explorador de arquivos do Windows. Para ter graça acionaremos o git bash no C e daremos os seguintes comandos;

$ cd workspace

$ mkdir notas-dio-tqi (vou criar essa pasta porque acho melhor que o livro de receita que foi usado no exemplo da aula)

$ ls   pra confirmar a criação da pasta

$cd notas-dio-tqi

...tqi$ git init  

...tqi $ ls    ( parece que não tem nada porque os arquivos/pastas criasdos são ocultos, para vê-los use a flag -a)

...tqi $ ls -a    ( vai mostrar o que estava oculto)

...tqi $ cd .git  ( era uma pasta que estava oculta)

...tqi $ ls   ( aparece tudo)

Foi criado um arquivo .md chamado, no meu caso, Introdução à computação, dentro da pasta notas-dio-tqi. Eu só coloquei uma pequena introdução desse meu arquivo pra ver o que acontece quando for acrescentando algo nesse arquivo.

Esse arquivo .md refere-se ao tipo mais simples de edição HTML. O professor usou o app Typora. eu instalei o app Typedown por estar disponível gratuitamente na Microsoft Store.Esse app parece atender aos propósitos da aula e da pra fazer bastante coisinhas com ele. É esse tipo de arquivo, o .md, que é muito usado nos app tipo whatsapp.

Agora vamos commitar o arquivo criado

...tqi $ git add *

...tqi $ git commit  -m  “Comit Inicial”  

Tendo sucesso vai aparecer algumas informações inclusive a parte inicial do SHA1

Comigo aconteceu um pouco diferente. Acho que não deu certo. Apareceu um desktop.ini, fiz novamente o procedimento do commit e dessa vez deu certo ou ficou  igual ao do professor mas com o dektop.ini ainda  aparecendo . Deve ser por causa do git desktop que eu tenho inslado. Eu acho.

Foi ensinado um novo comando, o git status, que mostra como esta seu repositório

...tqi $ git status

Aparece:

On branch master

nothing to commit, working tree clean

Sinalizando que não houve alterações

******Atenção para esse detalhes*******

Os arquivos e pastas criadas dentro de sua workspace tem os seguintes **status** para o git.

**UNTRACKED** – São os arquivos ou pastas que acabaram de ser criados. O git não sabe do conteúdo deles, mas sabe que eles existem. Esses arquivos estão prontos para irem para o status Unmodified via comando git add.

**TRACKED** –São os arquivos ou pastas que o git monitora depois deles serem adicionados. Eles podem ser:

1.    <u>UNMODIFIED</u> – São os arquivos que não sofreram modificação alguma. Esses arquivos estão prontos para irem para o status Staged ou se sofrerem alguma modificação vão para o status Modified.

2.    <u>MODIFIED </u> – São arquivos que estavam com o status Unmodified e sofreram alguma edição. Estão prontos para irem para o status Staged.

3.    <u>STAGED </u> – Arquivos ou pastas prontos para serem commitados. Após o processo de“commit”, os arquivos ou pastas retornam para condição de Unmodified.

...tqi $ gitstatus (Esse comando retorna o status dos arquivos ou pastas de seu repositório)

Agora ele vai simular uma mudança de pasta, que no linguajar do git é repositório, para tanto foi criado uma pasta e movido o arquivo para esta pasta. Desse jeito:

...tqi $ mkdirnotas

...tqi $ mvintrodução a programação.md ./notas

Na verdade, onde tem espaço o terminal do Linux não reconhece e dará erro. Então o comando mover deverá ser assim

...tqi $ mvintrodução\a\programação ./notas

### É uma boa idéia não usar espaços, cedilha ou acentos para nomear arquivos ou pastas. Isso complica bem as coisas.

Agora se der um git status vão aparecer as seguintes mensagens:

Com relação ao arquivo Introdução a programação, como não esta mais na pasta que deveria estaro Git vai pensar que ele foi deletado. E vai sugerir para ele ser adicionado novamente. A mensagem sera resumidamente essa:

CHANGES NOT STAGED FOR COMMIT DELETED… ARQUIVOTAL

Com relação a pasta criada ele vai avisar que a pasta é Untracked e vai sugerir adicioná-la. A mensagem será resumidamente essa:

UNTRACKEDFILES... ARQUIVO TAL

Lembrando que esses arquivos agora estão com o status Modified e prontos para irem ao statusde Staged, por isso a mensagem Changes Not Staged apareceu quando eu dei o comando Git Status. No meu caso, dado os comando abaixo , os arquivos irão parao status Staged e estarão prontos para serem comitados.

...tqi $ git addIntrodução a Programação notas  

Agora os arquivos estão com o status Staged. Se eu der o comando git status vai aparecera seguinte mensagem resumidamente:

CHANGES TO BE COMMITTED

Agora é só dar o comando de commit

...tqi $ gitcommit -m “ Esse é um comit final”

Agora os arquivos mudam para status Unmodified até que alguém modifique alguma coisa e o ciclo recomeça. Se eu der um git status nesse momento terei a seguinte mensagem resumidamente.

$ git status

On branch master

nothing to commit, working tree clean

Ok, feito tudo isso é hora de transferir nossos arquivos para um repositório remoto, o GitHub,como eu já tenho uma conta no GitHub segui as instruções para criar uma novo repositório. Criei um repositório de acordo com meus arquivos e chamei de BootCampDio

No Git bash acertei meu name para PauloMartinsJPM conforme está no GitHub da seguinte maneira:

...tqi $ gitconfig  - - list

Isso listou varias configurações e mostrou que meu name era Paulo

Para sair das configurações aperte q que é um novo comando bash

...tqi $ git config  - -global - - unset user.name

Isso apaga o user name Paulo

...tqi $ git config- -global user.name “PauloMartinsJPM”

Isso configura meu name para PauloMartinsJPM

...tqi $ git remote add origin [GitHub Paulo Martins]([GitHub - PauloMartinsJPM/BootCampDio: Repositório para anotações pessoais do bootcamp da Dio TQI](https://github.com/PauloMartinsJPM/BootCampDio.git))

Isso conecta o repositório da minha máquina com o repositório remoto GitHub

...tqi $ git remote -v

Isso lista as conexões

Para mandar meus arquivos para o repositório remoto GitHub execute os seguintes comandos

...tqi $ gitpush origin master (ou main ou a branche que se escolher)

Isso deu um pau danado pois a branche Master não existe mais pelo que eu pude entender e sim a branche Main. Depois de muito apanhar eu dei o comando abaixo e tudo funcionou.

...tqi $ gitpush origin main

Isso fez meus arquivos que estavam na minha máquina irem parar no repositório do GitHub

Seu repositório remoto pode sofrer edições por alguém e você não ficar sabendo. Se você tentar fazer um commit ele sera rejeitado e o git avisara dessa situação. Teremos que acertar isso.

Pelo Github eu fiz alterações no README e também pelo Typedown eu também fiz alterações do README. Então existem duas versões desse arquivo. Executando um git status vai acusar que o README local foi modificado. Executando o git add e o git commit corre tudo bem mas ao executar o git pusk o push é rejeitado. Isso ocorre porque o arquivo que esta no Github é diferente do arquivo que esta na minha maquina. Para resolver isso executasse o seguinte comando

...tqi $ gitpull origin main

Isso fara o download do arquivo modificado. Ao abrir  README ele estará todo estranho pois aconteceu a fusão do arquivo que estava na sua maquina com o arquivo que estava no Github mostrando a parte que sofreu alterações. Devemos editar e acertar o arquivo README e fazer todo processo do push. A saber , add , commit e push. O arquivo final deverá conter a modificação que foi feita no meu note mais a modificação que foi feita por alguém no github caso se concorde com isso. Feito o processo do push o arquivo atual estará no github com as modificações devidamente registradas.

**Relação doscomandos usados no curso.**

##### Esses foram os comandos que aprendi com o curso.

$ ssh-keygen -ted25519 -C jorgepaulomartins@gmail.com  (Gera chave )

$ cd/c/users/jpaul/.ssh/     ( navega até apasta oculta .ssh)

$ catid_ed25519.pub   ( mostra a chavepublica)

$ eval$(ssh-agent -s)   ( inicializa agentepid)

$ catid_ed25519   ( mostra a chave privada)

$ mkdirworkspace ( cria diretorio workspace)

$ cd workspace  (navega até o diretório workspace)

$ mkdirnotas-dio-tqi (Cria o diretório notas-dio-tqi)

$ ls   ( lista diretórios e arquivos)

$ git init   ( inicialisa criação de repositório )

$ ls -a    ( vai mostrar o que estava oculto)

$ mv  ( move arquivo)

$ git add *  ( move os arquivos para o status Staged)

$ git commit -m“comentário” ( Deixe os arquivos prontos para o push e os move para Unmodified)

$ git pushorigin main ( empurra os arquivos para o reposirório remoto Github)

$ git pullorigin main ( faz o download dos arquivos que sofreram alterações no GitHub)

$ git status (mostra os status de seus arquivos, Modified, commit etc )

$ git remote addorigin”url de origem do github” ( conecta o git com o github)

$ git remote -v( mostra a lista de conexões)

$ gitconfig  - -global - - unsetuser.name  ( isso apaga o name que estaconfigurado)

$ git config --global user.name “PauloMartinsJPM” ( isso cria um novo name)
