
# Tarefa 017 - Configuração de software em tempo de execução, Generics, Closure e Logging - 30/06/2023

  
1. Considere os seguintes links, sobre os temas **Configuração de software em tempo de execução, _Generics_, _Closure_ e _Logging_**

### Configuração de software em tempo de execução
Na visão geral os artigos apresentam a Inversão de Controle (IoC) e Injeção de Dependência (DI) e Springs Profile , bem como são implementadas em framework Spring.

Perfis no Spring são uma forma de mapear beans para diferentes ambientes (dev,test e prod) ou cenários. Eles permitem que você ative diferentes configurações de beans com base no perfil em que o aplicativo está sendo executado. Isso é útil quando possuir diferentes configurações de beans para o ambiente de desenvolvimento.

Usamos a anotação __@Profile__ — estamos mapeando o bean para aquele perfil específico ; a anotação simplesmente leva os nomes de um (ou vários) perfis.

A IoC é um princípio de engenharia de software que permite a transferência do controle de uma estrutura sobre o fluxo do programa para um contêiner ou estrutura externa, permitindo um código mais modular e menos acoplado. Para habilitar isso, os frameworks usam abstrações com comportamento adicional integrado.
  
Por sua vez, a DI é um padrão que pode ser usado para implementar (IoC), onde as dependências de uma classe são fornecidas a ela, injetando-as externamente. Conectando um objeto a outro por meio de um montador e não pelos próprios objetos.

No contexto do Spring Framework, esses conceitos são uma característica comum . O contêiner Spring IoC é responsável por instanciar, gerenciar e configurar objetos (beans) em um aplicativo, enquanto a DI permite que as dependências sejam fornecidas automaticamente aos beans pelo contêiner. Isso resulta em um código mais flexível, reutilizável e testável.

###  Closure:

Closures são uma característica da programação funcional que permite uma função (ou lambda) capturar o ambiente no qual ela é embutida, portanto tendo acesso a variáveis locais, parâmetros e membros de uma função externa, mesmo após essa função ter retornado. Closures podem ser passados ​​para outra função como um parâmetro, além disso, classes internas anônimas não são encerramentos em Java.

As closures são úteis em situações em que é necessário encapsular dados, pois ajuda na privacidade e no currying (currying significa quebrar uma função com muitos parâmetros como várias funções em um único argumento).

A sintaxe para implementar um encerramento é: (argument_list) -> {func_body}

Ambos lambda e encerramento são bastante semelhantes entre si, a diferença pode ser entendida usando a diferença entre uma classe e uma instância da classe. Uma classe existe apenas no código-fonte e não existe durante o tempo de execução. Existem apenas objetos do tipo classe durante o tempo de execução. Da mesma forma, Closures estão para lambdas assim como objetos estão para classes.

### Generics:
 Generics trouxe uma abordagem diferente para a criação de classes, interfaces e métodos que podem ser modificados de forma padrão para modificar diferentes tipos de dados, sendo capaz de poupar o desenvolvedor de códigos redundantes, como é o caso de casting excessivo.

Esse recurso foi implementado com o intuito de aprimorar a segurança no tratamento de objetos, para evitar erros durante a execução do programa, já nos deparamos com o erro em tempo de compilação, ou seja, já nos vemos o erro antes mesmo de tentar executar o projeto.

No presente artigo, o [Generics](http://www.devmedia.com.br/usando-generics-em-java/28981) é delimitado pelos caracteres “<>”, ou seja, quando houver esse par de caracteres em uma parte qualquer do código, significa que o Generics está sendo utilizado.

List<String> listaDeStrings = new ArrayList<String>();  

A adoção de Generics traz diversas vantagens. Em primeiro lugar, aumenta a segurança do código, garantindo que somente os tipos corretos sejam utilizados em coleções e evitando exceções de tipo (ClassCastExceptions). Além disso, o uso de Generics contribui para a legibilidade do código, eliminando a necessidade de conversões explícitas para manipular os objetos corretamente. Como resultado, obtém-se um código mais conciso, de fácil compreensão e menos propenso a erros.

### Logging:

O Java Logger é uma classe essencial do pacote java.util.logging que é usada para criar e gerenciar logs em aplicativos Java. Ele faz parte do framework de logging padrão do Java e permite registrar informações, mensagens de erro e outras mensagens relevantes durante a execução de um programa.

Com o Java Logger, é possível registrar eventos de log em diferentes destinos, como o console, arquivos ou bancos de dados, possibilidade de definir o nível de log para filtrar as mensagens com base na gravidade. Isso permite registrar apenas as mensagens que são realmente importantes para o desenvolvedor, também oferece suporte a filtros para controlar quais mensagens são registradas, bem como ao tratamento de exceções para lidar com erros e exceções no programa. 

A hierarquia de loggers do Java Logger permite organizar e controlar a geração de logs, fornecendo controle granar (alto nível de precisão e detalhamento ) sobre o registro de logs. Cada logger é identificado por um nome único. Para registrar eventos de log se usa métodos, como log(), info(), warning() e severe(), que correspondem a diferentes níveis de gravidade.

  

.