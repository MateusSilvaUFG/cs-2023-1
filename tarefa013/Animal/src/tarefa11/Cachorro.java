package tarefa11;

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
