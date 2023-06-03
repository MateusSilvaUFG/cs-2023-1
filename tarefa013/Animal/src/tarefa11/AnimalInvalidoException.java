package tarefa11;

@SuppressWarnings("serial")
class AnimalInvalidoException extends Exception {
    public AnimalInvalidoException(String mensagem) {
        super(mensagem);
    }
}