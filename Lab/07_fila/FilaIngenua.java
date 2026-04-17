public class FilaIngenua implements Fila { // só adere ao contrato quando tem enfileirar() e desenfileirar(), se n dá erro
    // é uma fila de vetores não-circular, capacidade limitada
    // problema: desenfileirar custa bastante por ter que percorrer todo o vetor
    private int[] dados;
    private int quantidade;
    private static final int capacidade = 100;

    public FilaIngenua() {
        this.dados = new int[capacidade];
        this.quantidade = 0;
    }

    @Override
    public void enfileirar(int valor) {
        if(quantidade == capacidade) {
            throw new RuntimeException("Fila cheia");
        }
        dados[quantidade++] = valor;
    }

    @Override
    public int desenfileirar() {
        if(quantidade == 0)
            throw new RuntimeException("Fila vazia");
        int valor = dados[0];
        for (int i = 0; i < quantidade - 1; i++) {
            dados[i] = dados[i + 1];
        }
        quantidade--;
        return valor;
    }
}
