### Tarefa 008: Prática de Revisão de Código - 12/05/2023

# SRC

1. O caminho de construção especifica o ambiente de execução JavaSE-11. Não há JREs instalados na área de trabalho que sejam compatíveis com este ambiente. [ln 1, coluna 1]
2. A conformidade do compilador especificado é 11, mas um JRE 20 é usado java(o) [ln 1, Col 1]

# Modelo

## teste.java
1. A importação org.util.DataUtils nunca é usado Java(268435844) [ln 3, Col 8]
2. A importação java.util.List nunca é usada Java(268435844) [ln 5, Col 8]

# Util

**CpfValidator.java**
1. A importação org.model.Cliente nunca é usado Java(268435844) [ln 4, Col 8]

**DataUtils.java**
O valor do resultado da variável local não é usado java(536870973) [ln 100, col 17]
PassaporteValidator.java A importação org.model.Cliente nunca é usada Java(268435844) [ln 4, Col 8] A importação java.util.Arrays nunca é usada Java(268435844) [ln 6, Col 8] A importação java.util .List nunca é usado Java(268435844) [ln 7, Col 8]

## Aluno

**alexandre_wagner**
1. ClienteTest.java A importação org.junit.Assert.assertEquals nunca é usada Java(268435844) [ln 9, Col 15]
2. A importação org.junit.Assert.assertTrue nunca é usada Java(268435844) [ln 10, Col 15]
3. PremioSeguroTest.java A importação org.util.DataUtils nunca é usada Java(268435844) [ln 5, Col 8]
4. A importação org.junit.Assert.assertEquals nunca é usada Java(268435844) [ln 10, Col 15]
5. A importação org .junit.Assert.assertTrue nunca é usado Java(268435844) [ln 11, Col 15]

**amanda**

**PremioSeguroTest.java**
1. A importação org.util.DataUtils nunca é usada Java(268435844) [ln 5, Col 8]
2. A importação org.junit.Assert nunca é usada Java(268435844) [ln 8, Col 8]
3. A importação org.junit .Antes nunca é usado Java(268435844) [ln 9, Col 8]
4. A importação org.junit.Assert.assertTrue nunca é usada Java(268435844) [ln 11, Col 15]

**andrey_dias**

**TestClient.java**
1. A importação org.junit.Assert.assertTrue nunca é usada Java(268435844) [ln 10, Col 15]
2. O valor do resultado da variável local não é usado Java(268435844) [ln 35, Col 17]
3. O valor do resultado da variável local não é usado Java(268435844) [ln 40, Col 17]
4. O valor do resultado da variável local não é usado Java(268435844) [ln 53, Col 17]
5. O valor do resultado da variável local não é usado Java(268435844) [ln 66, Col 17]
6. O valor do resultado da variável local não é usado Java(268435844) [ln 70, Col 17]
7. O valor do resultado da variável local não é usado Java(268435844) [ln 74, Col 17]
8. O valor do resultado da variável local não é usado Java(268435844) [ln 84, Col 17]

**TestPremioSeguro.java**
1. A importação org.util.DataUtils nunca é usada java(268435844) [Ln 5, Col8]
2. A importação org.junit.Before nunca é usada java(268435844) [Ln 9, Col8]
3. A importação org.junit.Assert .assertEquals nunca é usado java(268435844) [Ln 10, Col 15]
4. A importação org.junit.Assert.assertTrue nunca é usada java(268435844) [Ln 11, Col 15]

**arthur_castro**

**ClienteTest.java**
1. The import org.util is never used
2. The import org.junit.Assert.assertEquals is never used
3. The import org.junit.Assert.assertTrue is never used

**PremioSeguroTest.java**
1. The import org.util.DataUtils is never used
2. The import org.junit.Assert is never used
3. The import org.junit.Before is never used
4. The import org.junit.Assert.assertTrue is never used

**Arthur_moura**

**ClienteTest.java**
1. The import org.excecoes is never used
2. The import org.junit.Before is never used
3. The import org.junit.Assert.assertTrue is never used

**PremioSeguroTest.java**
1. The import org.util.DataUtils is never used
2. The import org.junit.Assert is never used
3. The import org.junit.Before is never used
4. The import org.junit.Assert.assertTrue is never used

**emanoel**

**ClienteTest.java**
1. The import org.util is never used
2. The import org.junit.Assert.assertEquals is never used
3. The import org.junit.Assert.assertTrue is never used

**PremioSeguroTest.java**
1. The import org.util.DataUtils is never used
2. The import org.junit.Assert is never used
3. The import org.junit.Assert.assertTrue is never used

**felipe_galvao**

**ClienteTest.java**
1. The import org.util is never used
2. The import org.junit.Assert.assertEquals is never used
3. The import org.junit.Assert.assertTrue is never used

**PremioSeguroTest.java**
1. The import org.util.DataUtils is never used
2. The import org.junit.Assert is never used
3. The import org.junit.Before is never used
4. The import org.junit.Assert.assertEquals is never used

**felipe_ramos**

**ClienteTest.java**
1. The import org.junit.Assert.assertTrue is never used
2. The value of the local variable result is not used
3. The value of the local variable result is not used
4. The value of the local variable result is not used
5. The value of the local variable result is not used
6. The value of the local variable result is not used
7. The value of the local variable result is not used
8. The value of the local variable result is not used

**PremioSeguroTest.java**
1. The import org.util.DataUtils is never used
2. The import org.junit.Before is never used
3. The import org.junit.Assert.assertEquals is never used
4. The import org.junit.Assert.assertTrue is never used

**felipe_silveira**

**ClienteTest.java**

1. The import org.junit.Assert.assertEquals is never used

**PremioSeguroTest.java**
1. The import org.util.DataUtils is never used
2. The import org.junit.Assert is never used
3. The import org.junit.Assert.assertEquals is never used

**flavimar**

**PremioSeguroTest.java**
1. The import org.util.DataUtils is never used
2. The import org.junit.Assert.assertEquals is never used
3. The import org.junit.Assert.assertTrue is never used

**gabriel_cardoso**

**ClienteTest.java**

1. The import org.junit.Assert.assertEquals is never used

**PremioSeguroTest.java**
1. The import org.util.DataUtils is never used
2. The import org.junit.Assert is never used
3. The import org.junit.Assert.assertEquals is never used

**gabriel_cardoso2 - model**

**Cliente.java**

1. The value of the field Cliente.sexo is not used
2. The value of the field Cliente.estadoCivil is not used
3. The value of the field Cliente.nacionalidade is not used
4. The value of the field Cliente.cpf is not used
5. The value of the field Cliente.passaporte is not used

1. TODO Auto-generated constructor stub
2. TODO Auto-generated method stub
3. TODO Auto-generated method stub
4. TODO Auto-generated method stub
5. TODO Auto-generated method stub
6. TODO Auto-generated method stub
7. TODO Auto-generated method stub
8. TODO Auto-generated method stub
9. TODO Auto-generated method stub
10. TODO Auto-generated method stub
11. TODO Auto-generated method stub
12. TODO Auto-generated method stub
13. TODO Auto-generated method stub
14. TODO Auto-generated method stub
15. TODO Auto-generated method stub
16. TODO Auto-generated method stub
17. TODO Auto-generated method stub
18. TODO Auto-generated method stub
19. TODO Auto-generated method stub

**Teste.java**
1. The import org.util.DataUtils is never used
2. The import java.util.List is never used

**util**

**CpfValidator.java**

1. The import org.model.Cliente is never used

**DataUtils.java**
1. The value of the local variable result is not used

**PassaporteValidator.java**

1. The import org.model.Cliente is never used
2. The import java.util.Arrays is never used
3. The import java.util.List is never used

**Gabriel_mesquita**

**ClienteTeste.java**
1. The import org.junit.Assert.assertEquals is never used

**PremioSeguroTest.java**
1. The import org.util.DataUtils is never used
2. The import org.junit.Assert is never used
3. The import org.junit.Assert.assertEquals is never used
4. The import org.junit.Assert.assertFalse is never used

**Guilherme_faleiros**

**ClienteTeste.java**
1. The import org.util is never used
2. The import org.junit.Assert.assertEquals is never used
3. The import org.junit.Assert.assertTrue is never used
4. The import org.junit.Assert.assertFalse is never used

**PremioSeguroTest.java**
1. The import org.util.DataUtils is never used
2. The import org.junit.Assert is never used
3. The import org.junit.Before is never used
4. The import org.junit.Assert.assertTrue is never used
5. The import org.junit.Assert.assertFalse is never used

**gustavo_henrique**

**ClienteTest.java**
1. The import org.junit.Assert.assertEquals is never used
2. The import org.junit.Assert.assertTrue is never used
3. The import org.junit.Assert.assertFalse is never used

1. TODO: handle exception
2. TODO: handle exception
3. TODO: handle exception
4. TODO: handle exception
5. TODO: handle exception

**PremioSeguroTest.java**
1. The import org.util.DataUtils is never used
2. The import org.junit.Assert is never used
3. The import org.junit.Before is never used
4. The import org.junit.Assert.assertTrue is never used
5. The import org.junit.Assert.assertFalse is never used
6. The import org.junit.Assert.assertEquals is never used

1. TODO: handle exception
2. TODO: handle exception
3. TODO: handle exception
4. TODO: handle exception
5. TODO: handle exception
6. TODO: handle exception
7. TODO: handle exception
8. TODO: handle exception

**joao_pedro**

**ClienteTest.java**
1. The import org.junit.Assert.assertTrue is never used
2. The import org.junit.Assert.assertFalse is never used
3. The value of the local variable result is not used
4. The value of the local variable result is not used
5. The value of the local variable result is not used
6. The value of the local variable result is not used
7. The value of the local variable result is not used
8. The value of the local variable result is not used
9. The value of the local variable result is not used

**PremioSeguroTest.java**
1. The import org.util.DataUtils is never used
2. The import org.junit.Before is never used
3. The import org.junit.Assert.assertEquals is never used
4. The import org.junit.Assert.assertTrue is never used
5. The import org.junit.Assert.assertFalse is never used

**jose_teixeira**

**ClienteTest.java**
1. The import org.util is never used
2. The import org.junit.Assert.assertEquals is never used
3. The import org.junit.Assert.assertTrue is never used
4. The import org.junit.Assert.assertFalse is never used

**PremioSeguroTest.java**
1. The import org.util.DataUtils is never used
2. The import org.junit.Assert is never used
3. The import org.junit.Assert.assertTrue is never used
4. The import org.junit.Assert.assertFalse is never used

**joyce_beatriz**

**ClienteTest.java**
1. The import org.util is never used
2. The import org.junit.Assert.assertEquals is never used
3. The import org.junit.Assert.assertTrue is never used
4. The import org.junit.Assert.assertFalse is never used

**PremioSeguroTest.java**
1. The import org.util.DataUtils is never used
2. The import org.junit.Assert is never used
3. The import org.junit.Before is never used
4. The import org.junit.Assert.assertEquals is never used
5. The import org.junit.Assert.assertFalse is never used

**kaua_jr**

**ClienteTest.java**
1. The import org.junit.Assert.assertEquals is never used

**PremioSeguroTest.java**
1. The import org.util.DataUtils is never used
2. The import org.junit.Assert.assertEquals is never used
3. The import org.junit.Assert.assertTrue is never used
4. The import org.junit.Assert.assertFalse is never used

**luca_bacheschi**

**ClienteTest.java**
1. The import org.junit.Assert.assertEquals is never used

**PremioSeguroTest.java**
1. The import org.util.DataUtils is never used
2. The import org.junit.Assert.assertEquals is never used
3. The import org.junit.Assert.assertTrue is never used
4. The import org.junit.Assert.assertFalse is never used

**lucas_oliveira**

**ClienteTest.java**
1. The import org.junit.Assert.assertEquals is never used
2. The import org.junit.Assert.assertFalse is never used
3. The import org.junit.Assert.assertTrue is never used

**PremioSeguroTest.java**
1. The import org.util.DataUtils is never used
2. The import org.junit.Before is never used
3. The import org.junit.Assert.assertTrue is never used
4. The import org.junit.Assert.assertFalse is never used
5. The import org.junit.Assert.assertEquals is never used

**luis_eduardo**

**ClienteTest.java**
1. The import org.util is never used
2. The import org.junit.Assert.assertEquals is never used
3. The import org.junit.Assert.assertTrue is never used
4. The import org.junit.Assert.assertFalse is never used

**mozaniel**

**ClienteTest.java**
1. The import org.junit.Assert.assertTrue is never used
2. The import org.junit.Assert.assertFalse is never used
3. The value of the local variable result is not used
4. The value of the local variable result is not used
5. The value of the local variable result is not used
6. The value of the local variable result is not used
7. The value of the local variable result is not used
8. The value of the local variable result is not used
9. The value of the local variable result is not used

**PremioSeguroTest.java**
1. The import org.util.DataUtils is never used
2. The import org.junit.Before is never used
3. The import org.junit.Assert.assertTrue is never used
4. The import org.junit.Assert.assertFalse is never used

**randerson**

**ClienteTest.java**
1. The import org.junit.Assert.assertEquals is never used
2. The import org.junit.Assert.assertTrue is never used
3. The import org.junit.Assert.assertFalse is never used

**PremioSeguroTest.java**
1. The import org.util.DataUtils is never used
2. The import org.junit.Before is never used
3. The import org.junit.Assert.assertTrue is never used
4. The import org.junit.Assert.assertFalse is never used

**vitor_henrique**

**ClienteTest.java**
1. The import java.util.Date is never used
2. The import org.junit.Assert.assertEquals is never used
3. The import org.junit.Assert.assertTrue is never used
4. The import org.junit.Assert.assertFalse is never used

**PremioSeguroTest.java**
1. The import org.util.DataUtils is never used
2. The import org.junit.Before is never used
3. The import org.junit.Assert.assertTrue is never used
4. The import org.junit.Assert.assertFalse is never used

**Wendel_marcio**

**ClienteTest.java**
1. The import org.junit.Assert.assertEquals is never used

**PremioSeguroTest.java**
1. The import org.util.DataUtils is never used
2. The import org.junit.Assert.assertEquals is never used
3. The import org.junit.Assert.assertFalse is never used

**gilmar**

**ClienteTest.java**
1. The import org.junit.Assert.assertEquals is never used
