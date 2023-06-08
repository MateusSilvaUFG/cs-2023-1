package tarefa11;

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
