package tarefa11;

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
