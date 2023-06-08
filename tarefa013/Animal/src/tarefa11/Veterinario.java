package tarefa11;

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
