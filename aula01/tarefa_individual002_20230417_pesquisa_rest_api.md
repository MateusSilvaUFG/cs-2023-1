## Tarefa 002 - 17/04/2022 - Pesquisa Rest API

1. Elaborar uma pesquisa sobre o tema "_Rest API_".
2. Elaborar um texto **no formato markdown** de pelo menos uma página, descrito com suas próprias palavras, destacando:
* As definições dos conceitos envolvidos;
* As principais características deste conceito (pelo menos umas cinco).

# REST API

API REST, também chamada de API RESTful, é uma interface de programação de aplicações (API ou API Web) que está seguindo o estilo de arquitetura de software REST,  que define uma série de restrições a serem seguidas na criação de serviços web.

## API

APIs (Interface de Programação de Aplicações, na sigla em inglês) são como mediadores entre usuários ou clientes e os recursos ou serviços web que eles querem obter, permitindo que ele acesse e faça uso das funcionalidades do software em questão.As APIs também servem para que organizações compartilhem recursos e informações e, ao mesmo tempo, mantenham a segurança, o controle e a obrigatoriedade de autenticação, pois permitem determinar quem tem acesso e o que pode ser acessado. 

Outra vantagem de usar APIs é que não é necessário saber todos os detalhes sobre o armazenamento em cache, como os recursos são recuperados ou qual é a origem deles.


## O Que Faz uma API ser do Tipo REST


REST (Representational State Transfer)  não é um protocolo ou padrão, mas um conjunto de restrições de arquitetura que devem ser seguidas no desenvolvimento de uma aplicação na internet Estas regras permitem o desenvolvimento de uma aplicação com interface bem definida, com rotinas padronizadas e facilmente representadas, que facilitam a comunicação entre máquinas e usuários.

Quando um cliente faz uma solicitação usando uma API RESTful, essa API transfere uma representação do estado do recurso ao solicitante ou endpoint. Essa informação (ou representação) é entregue via HTTP utilizando um dos vários formatos possíveis:
 Javascript Object Notation (JSON), HTML, XLT, Python, PHP ou texto sem formatação.

Os cabeçalhos e parâmetros são importantes nos métodos HTTP de uma solicitação HTTP de API RESTful porque contêm informações sobre o identificador, metadados, autorização, Uniform Resource Identifier (URI), cache, cookies e outras informações da solicitação. Há os cabeçalhos da solicitação e os cabeçalhos da resposta, cada um contendo as informações de suas respectivas conexões HTTP e códigos de status.

Para que uma API seja considerada do tipo RESTful, ela precisa está em conformidade com os seguintes critérios:

* Arquitetura cliente-servidor: indica uma arquitetura baseada em clientes, servidores e recursos, em que as solicitações são feitas via protocolo HTTP. Essa condição está ligada à independência entre o cliente e o servidor. Ou seja, mudanças feitas pelo usuário na aplicação em seu dispositivo não devem afetar o servidor e sua estrutura de dados. De mesmo modo, alterações feitas pelos desenvolvedores nos bancos de dados da aplicação não devem instantaneamente impactar o dispositivo do usuário.

* Comunicação stateless: Uma API RESTful é "stateless", ou seja, não guarda nenhum estado do cliente entre as solicitações GET. Todas as informações necessárias para atender a solicitação devem estar contidas nela mesma, não dependendo de informações já armazenadas em outras sessões.

* Cache: uma API REST deve ser desenvolvida de modo que consiga armazenar dados em cache. Quando uma informação fica armazenada em cache, as solicitações e respostas entre cliente e servidor são otimizadas.

* Interface uniforme:a interface uniforme  entre os componentes para que as informações sejam transferidas em um formato padronizado. Para tanto, logo é necessário que:
   * Os recursos solicitados sejam identificáveis e estejam separados das representações enviadas ao cliente;
   * Os recursos possam ser manipulados pelo cliente por meio da representação recebida com informações suficientes para tais ações;
   * As mensagens autodescritivas retornadas ao cliente contenham informações suficientes para descrever como processá-las;
   * Hipertexto e hipermídia estão disponíveis. Isso significa que após acessar um recurso, o cliente pode usar hiperlinks para encontrar as demais ações disponíveis para ele no momento.
   * A manipulação de recursos através de representações (como [JSON](https://www.hostinger.com.br/tutoriais/o-que-e-json) ou XML).
sistema em camadas: Ter um sistema em camadas que organiza os tipos de servidores com uma funcionalidade específica como (responsáveis pela segurança, pelo carregamento de carga e assim por diante) envolvidos na recuperação das informações solicitadas em hierarquias, mas apesar de serem separadas, todas interagem entre si.


## Como Funcionam as APIs RESTful

Uma API RESTful funciona através da manipulação de recursos e representações. Essas representações são trocadas entre os usuários e o servidor através de uma interface padronizada e de um protocolo de comunicação específico — geralmente o HTTP. 

Assim, quando um usuário deseja usar uma funcionalidade da aplicação, seu dispositivo envia uma solicitação via HTTP ao servidor. O servidor localiza o recurso e comunica a representação do estado dele na resposta ao usuário através do mesmo protocolo. E são essas representações que podem ser feitas em diversos formatos.
![1](https://user-images.githubusercontent.com/131163948/233358493-ba268609-9a7e-4659-8149-2fd04942d328.png)
As solicitações da aplicação requerem a execução de alguma função padrão no banco de dados do sistema. Por exemplo, a API RESTful envia ao servidor, via HTTP, uma requisição para executar uma função básica, como deletar o usuário “Mateus” da lista de usuários. A solicitação enviada nesse exemplo, seria a seguinte: 

```DELETE http://www.meusite.com.br/usuarios/Mateus```

As operações utilizadas para acessar os recursos são padronizadas e bem definidas, além do comando DELETE, existem outros, como http GET e POST que solicitam, respectivamente, a recuperação e a criação de um recurso ou usuário.

## Diferença Entre REST e RESTful

REST é um conjunto de princípios e restrições de arquitetura de softwares. 
Uma API RESTful é aquela que está em conformidade com os critérios estabelecidos pela Transferência de Estado Representacional (REST). Assim, quando uma API é do tipo RESTful, significa que esse sistema consegue aplicar os princípios propostos por Roy Fielding em sua tese REST.


## Conclusão

Uma API RESTful é uma forma de fornecer serviços web que segue um conjunto de restrições de arquitetura. Ela se comunica com um cliente por meio de solicitações HTTP para indicar as operações que serão realizadas. 

Algumas das principais características de uma API RESTful são:
* Sistema no formato cliente-servidor;
* Comunicação stateless;
* Capacidade de armazenar dados em cache;
* Interface uniforme;
* Sistema de camadas;

Por indicar uma Transferência de Estado Representacional, a arquitetura REST possibilita o acesso, a organização e conexão dos usuários aos serviços da aplicação na internet, principalmente àqueles baseados na nuvem (servidores cloud).

As restrições listadas pelo estilo REST indicam benefícios importantes para o desenvolvimento de aplicações e sistemas. Afinal, elas resultam em maior flexibilidade, menor consumo de banda, mais segurança e padronização de protocolos. 

Deste modo, o padrão REST é o método de preferência na integração de aplicações e na conexão de componentes de softwares. Grandes sites como Twitter, Amazon e Linkedin utilizam APIs do tipo RESTful. E a tendência é que a computação em nuvem confirme cada vez mais a arquitetura API REST como via de regra no desenvolvimento de aplicações no futuro.


