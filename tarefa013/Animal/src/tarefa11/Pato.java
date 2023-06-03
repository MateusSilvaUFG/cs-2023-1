package tarefa11;

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
