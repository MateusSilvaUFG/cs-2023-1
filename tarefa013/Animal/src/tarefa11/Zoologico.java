package tarefa11;

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
