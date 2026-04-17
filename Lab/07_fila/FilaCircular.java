public class FilaCircular implements Fila{  // só adere ao contrato quando tem enfileirar() e desenfileirar(), se n dá erro
    // capacidade limitada
    // não há necessidade de percorrer a lista para desenfileirar
    private int[] dados;
    private int inicio, fim, quantidade;
    private static final int capacidade = 100;

    public FilaCircular() {
        this.dados = new int[capacidade];
        inicio = 0;
        fim = -1;
        quantidade = 0;
    }

    @Override
    public void enfileirar(int valor) {
        if(quantidade == capacidade)
            throw new RuntimeException("Fila cheia");
        fim = (fim + 1) % capacidade;
        dados[fim] = valor;
        quantidade++;
    }

    @Override
    public int desenfileirar() {
        if (quantidade == 0)
            throw new RuntimeException("Fila vazia");
        int valor = dados[inicio];
        inicio = (inicio + 1) % capacidade;
        quantidade--;
        return valor;
    }
}
