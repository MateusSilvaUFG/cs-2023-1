### Tarefa 007: Revisão de Código - 10/05/2023


## Resumo Descritivo do LINK 1 [APP Master](https://appmaster.io/pt/blog/revisoes-de-codigo)
  Esse link aborda a  importância das revisões de códigos, feita por quem não desenvolveu o codigo, no processo de desenvolvimento de software. Destaca-se que a revisão de código é uma prática essencial para melhorar a qualidade do código, identificar possíveis erros e bugs no início do processo de desenvolvimento, reduzindo o tempo e os custos de desenvolvimento. Além de discutir o processo de revisão de código, enfatizando de ter uma boa pré-preparação, além de fazer um teste para obter uma compreensão mais profunda de como o código funciona e ter uma visão geral dos possíveis de bugs, identificando:
  
*   Que tipo de software está sendo criado
*   Qual é o alvo
*   Qual é o contexto
*   Quais são as prioridades do autor (estética? performance?).

O artigo também mostra uma  lista de verificação para verificar e testar todos os aspectos que precisam ser verificados e testados.

**Depurar:** É a verificação de  variáveis, erros ortográficos, parâmetros na ordem errada e outros erros simples (Também pode se usar ferramentas de software de depuração), mas não invalida a análise manual.

**Segurança:** Nesta etapa, o código é executado para identificar vulnerabilidades, alguns plugins fazem isso automaticamente.

**Legibilidade do código:** Ao verificar a legibilidade do código, você está analisando se o código é auto explicativo, se é claro e conciso e se todas as convenções de linguagem e projeto são seguidas.

**Duplicação de código:**  Destaca a importância de fazer cada parte da lista de verificação, pois poderia ser feito junto a legibilidade do código.

**Nomeação:** Neste ponto da sua lista de verificação de revisão de código, você pode revisar variáveis, constantes, campos de classe, nomes de propriedades (e assim por diante...) e procurar oportunidades para melhorá-los tornando-os mais descritivos.

**Testes**
*   Se há ou não testes no código
*   A qualidade desses testes
*   A legibilidade dos testes
*   A nomenclatura dentro dos testes.

**Documentação:** Em primeiro lugar, se o projeto vier com alguma documentação, você deve verificar e revisar a documentação também. Segundo, se as alterações feitas no código incluírem a adição de um novo recurso, certifique-se de atualizar a documentação e, em seguida, revise suas atualizações.

**Possibilidade de melhoria:** se existem maneiras de melhorar o projeto para que você mesmo possa fazer as alterações ou informar o autor do código sobre as possibilidades que você identificou.

**Acompanha as alterações:**  para mostrar o seu feedback ao autor do código.

**Forneça seu feedback:** Ao final do processo de revisão de código, você pode compartilhar seus comentários com o autor do código. A lista de verificação de revisão de código também o ajudará com isso. Você pode passar por cada ponto e cada teste para mostrar o que está funcionando e o que precisa ser corrigido. Durante o processo de revisão, você também deve ter notado que havia formas de obter os mesmos resultados de forma mais eficiente ou simples.

**Ferramenta**
O artigo também lista uma ferramenta chamada [AppMaster](https://appmaster.io/pt), que uma das grandes vantragens da plataforma é que gera imediatamente um código limpo e bonito, no qual não há espaço  revisão de código, Porque tanto em projetos de código aberto quanto no AppMaster, todos os blocos e elementos já foram verificados um milhão de vezes, e a plataforma não permite código incorreto. 

## Resumo Descritivo do LINK 2 [Medium](https://medium.com/codigorefinado/code-review-revis%C3%A3o-de-c%C3%B3digo-pode-ser-automatizada-ba5f25882774)
  Neste link, é discutida a importância da revisão de código e se é possível automatizar essa prática. O artigo destaca que a revisão de código é uma atividade essencial para encontrar erros, melhorar a qualidade do código e promover a colaboração da equipe. No entanto, reconhece que a revisão manual pode ser demorada e propensa a erros humanos. O artigo sugere a possibilidade de automação , mencionando ferramentas como linters, analisadores estáticos e sistemas de integração contínua, que podem auxiliar na detecção automática de problemas no código. Além disso, o artigo aborda a importância de equilibrar a automação com a revisão humana, enfatizando que a revisão manual ainda é necessária para questões mais complexas e de contexto.
  
  Das ferramentes citadas pelo artigo temos:
  
  [ESLint](https://eslint.org/), [TSLint](https://palantir.github.io/tslint/), [Codelizer](http://codelyzer.com/),[Checkstyle](https://checkstyle.sourceforge.io/),[SonarQube](https://www.sonarsource.com/products/sonarqube/).
  
  Estas ferramentas, através de plugins podem ser integradas a sua IDE, e te avisar da não conformidade enquanto você digita o código.
  
  [Codefactor](https://github.com/marketplace/codefactor), Certifique-se de que seu código atenda aos padrões de qualidade.
  
 O [CodeFactor.io](https://github.com/marketplace/codefactor) integra-se perfeitamente ao GitHub, realiza instantaneamente o Code Review com cada GitHub Commit ou PR. Tempo de configuração zero. Receba feedback acionável em segundos para qualquer agência. Personalize regras e ignore problemas irrelevantes. Obtenha dicas de refatoração em todos os problemas

[Codacy](https://github.com/marketplace/codacy), é uma ferramenta automatizada de análise / qualidade de código que ajuda os desenvolvedores a enviar um software melhor, mais rápido. Com Codacy, você obtém alterações de análise estática, complexidade ciclomática, duplicação e cobertura de teste de unidade de código em cada solicitação de confirmação e pull.

 Você pode usar o Codacy para impor seu padrão de qualidade de código, economizar tempo em revisões de código, aplicar melhor as práticas recomendadas de segurança e os desenvolvedores onboard mais rapidamente. Integre com seus repositórios GitHub para obter uma análise de qualidade de cada solicitação pull dentro do GitHub.
***
Os objetivos da revisão de código mencionados em ambos os links incluem:
*  Identificar erros e bugs no código.
*  Melhorar a qualidade e legibilidade do código.
*  Garantir a aderência às diretrizes de codificação.
*  Promover a colaboração e o compartilhamento de conhecimento na equipe de desenvolvimento.
*  O processo de revisão de código envolve:

Selecionar um revisor qualificado.
*  Definir um conjunto de diretrizes e padrões de codificação.
*  Realizar a revisão de forma sistemática e estruturada.
*  Fornecer feedback construtivo e sugestões de melhorias.
 
Algumas ferramentas de suporte à revisão de código mencionadas nos links são:
*  Linters: Verificam automaticamente o código em busca de problemas como erros de sintaxe, estilo e possíveis bugs.
*  Analisadores estáticos: Analisam o código em busca de problemas de qualidade, como vulnerabilidades de segurança, baixa  performance, entre outros.
*  Sistemas de integração contínua: Permitem a execução automatizada de testes e análise do código em cada nova alteração,   fornecendo feedback imediato sobre possíveis problemas.

