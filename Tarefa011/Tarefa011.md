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

class AnimalTeste {
   public static void testarAnimais() {
       Cachorro dog = new Cachorro("Rex", 12);
       Cavalo horse = new Cavalo("Thor", 10);
       Preguica sloth = new Preguica("Side", 5);
    
       Animal[] animals = { dog, horse, sloth};
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
       return nome + " esta correndo!";
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
       return nome + " esta correndo!";
   }
}
class Preguica extends Animal {
   public Preguica(String nome, int idade) {
       super(nome, idade);
   }
   @Override
   public String emitirSom() {
       return "Som de preguica";
   }
   @Override
   public String correr() {
       return nome + " e uma preguica e nao consegue correr rapido.";
   }
}

class Veterinario {
   public void examinar(Animal animal)  {
   
           System.out.println("Examinando " + animal.nome + "...");
           System.out.println(animal.emitirSom());
     
   }
}

class Zoologico {
   private final Animal[] jaulas;
   private int contadorJaulas;
   public Zoologico() {
       this.jaulas = new Animal[10];
       this.contadorJaulas = 0;
   }
   public void adicionarAnimal(Animal animal){
       if (contadorJaulas < 10) {
       		jaulas[contadorJaulas] = animal;
       		contadorJaulas++;
       	
      
       }	
       else {
           System.out.println("Zoologico esta cheio.");
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
public class Main {
   public static void main(String[] args) {
       Zoologico zoo = new Zoologico();
       Cachorro dog = new Cachorro("Rex", 12);
       Cavalo horse = new Cavalo("Thor", 10);
       Preguica sloth = new Preguica("Side", 5);
      
    
    
       	zoo.adicionarAnimal(dog);
           zoo.adicionarAnimal(horse);
           zoo.adicionarAnimal(sloth);
    
       zoo.mostrarAnimais();
 
       Veterinario vet = new Veterinario();
     
           vet.examinar(dog);
           vet.examinar(horse);
           vet.examinar(sloth);
  
        AnimalTeste.testarAnimais();
   }
}

