package tarefa11;

public class Main {
    public static void main(String[] args) {
        Zoologico zoo = new Zoologico();

        Cachorro dog = new Cachorro("Rex", 12);
        Cavalo horse = new Cavalo("Thor", 10);
        Preguica sloth = new Preguica("Side", 5);
        Pato duck = new Pato("Donald", 11);

        
      
        try {
        	zoo.adicionarAnimal(dog);
            zoo.adicionarAnimal(horse);
            zoo.adicionarAnimal(sloth);

            // Testando tratamento de exceção
            zoo.adicionarAnimal(duck); // Lançará AnimalInvalidoException
        } catch (AnimalInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        System.out.println();
        zoo.mostrarAnimais();
        System.out.println();

        Veterinario vet = new Veterinario();
        try {
            vet.examinar(dog);
            vet.examinar(horse);
            vet.examinar(sloth);

            // Testando tratamento de exceção
            vet.examinar(duck); // Lançará AnimalInvalidoException
        } catch (AnimalInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        System.out.println();

        AnimalTeste.testarAnimais();
    }
}