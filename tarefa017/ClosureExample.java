interface Operation {
    int perform(int a, int b);
}

public class ClosureExample {
    public static void main(String[] args) {
        // Definindo uma closure que realiza uma soma
        Operation addition = (a, b) -> a + b;

        // Executando a closure
        int result = performOperation(5, 3, addition);
        System.out.println("Resultado da soma: " + result);

        // Definindo uma closure que realiza uma subtração
        Operation subtraction = (a, b) -> a - b;

        // Executando a closure
        result = performOperation(10, 4, subtraction);
        System.out.println("Resultado da subtração: " + result);
    }

    public static int performOperation(int a, int b, Operation operation) {
        return operation.perform(a, b);
    }
}
