package tarefa11;

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
