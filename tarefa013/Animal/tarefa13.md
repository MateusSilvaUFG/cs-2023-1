abstract class Animal {
    protected String nome;
    protected int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public abstract String emitirSom();

    public abstract String correr();
}

@SuppressWarnings("serial")
class AnimalInvalidoException extends Exception {
    public AnimalInvalidoException(String mensagem) {
        super(mensagem);
    }
}

class AnimalTeste {
    public static void testarAnimais() {
        Cachorro dog = new Cachorro("Rex", 12);
        Cavalo horse = new Cavalo("Thor", 10);
        Preguica sloth = new Preguica("Side", 5);
        Pato duck = new Pato("Donald", 11);

        Animal[] animals = { dog, horse, sloth, duck };

        for (Animal animal : animals) {
            System.out.println(animal.emitirSom());
            System.out.println(animal.correr());
        }
    }
}


class Cachorro extends Animal {
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String emitirSom() {
        return "Au Au";
    }

    @Override
    public String correr() {
        return nome + " está correndo!";
    }
}


class Cavalo extends Animal {
    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String emitirSom() {
        return "Relincho";
    }

    @Override
    public String correr() {
        return nome + " está correndo!";
    }
}


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
class Pato  extends Animal {
    public Pato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String emitirSom() {
        return "quack quack";
    }

    @Override
    public String correr() {
        return nome + " está andando!";
    }
}


class Preguica extends Animal {
    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String emitirSom() {
        return "Som de preguiça";
    }

    @Override
    public String correr() {
        return nome + " é uma preguiça e não consegue correr rápido.";
    }
}


class Veterinario {
    public void examinar(Animal animal) throws AnimalInvalidoException {
        if (animal instanceof Cachorro || animal instanceof Cavalo || animal instanceof Preguica) {
            System.out.println("Examinando " + animal.nome + "...");
            System.out.println(animal.emitirSom());
        } else {
            throw new AnimalInvalidoException("Tipo de Animal Inválido = " + animal.nome);
        }
    }
}


class Zoologico {
    private final Animal[] jaulas;
    private int contadorJaulas;

    public Zoologico() {
        this.jaulas = new Animal[10];
        this.contadorJaulas = 0;
    }

    public void adicionarAnimal(Animal animal) throws AnimalInvalidoException {
        if (contadorJaulas < 10) {
        	if (animal instanceof Cachorro || animal instanceof Cavalo || animal instanceof Preguica) {
        		jaulas[contadorJaulas] = animal;
        		contadorJaulas++;}
        	
        	else {
            throw new AnimalInvalidoException("Tipo de Animal Inválido para ser adicionado ao zoo = " + animal.nome);
        }
        }	
        if(contadorJaulas >=10) {
            System.out.println("Zoológico está cheio.");
        }
       
    }
   public void mostrarAnimais() {
        for (Animal animal : jaulas) {
            if (animal != null) {
                System.out.println(animal.emitirSom());
                System.out.println(animal.correr());
            }
        }
    }
}
