public class ListaGenerica<T> {
    private T[] elementos;
    private int tamanho;

    public ListaGenerica(int capacidade) {
        elementos = (T[]) new Object[capacidade];
        tamanho = 0;
    }

    public void adicionar(T elemento) {
        if (tamanho < elementos.length) {
            elementos[tamanho] = elemento;
            tamanho++;
        } else {
            System.out.println("A lista está cheia!");
        }
    }

    public T obter(int indice) {
        if (indice >= 0 && indice < tamanho) {
            return elementos[indice];
        } else {
            throw new IndexOutOfBoundsException("Índice inválido");
        }
    }

    public int tamanho() {
        return tamanho;
    }

    public static void main(String[] args) {
        ListaGenerica<String> lista = new ListaGenerica<>(5);
        lista.adicionar("Maçã");
        lista.adicionar("Laranja");
        lista.adicionar("Banana");

        System.out.println("Tamanho da lista: " + lista.tamanho());

        String primeiroElemento = lista.obter(0);
        System.out.println("Primeiro elemento: " + primeiroElemento);
    }
}
