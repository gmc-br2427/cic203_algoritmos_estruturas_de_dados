public class FilaListaLigadaSimples implements Fila{  // só adere ao contrato quando tem enfileirar() e desenfileirar(), se n dá erro
    // alocada dinamicamente, n tem problema de capacidade máxima
    // lista ligada simples e não duplamente ligada porque não é preciso saber os anteriores na fila, só inicio e fim
    private static class No {
        int valor;
        No proximo;

        No(int valor) {
            this.valor = valor;
            this.proximo = null;
        }
    }
    private static class Lista {
        No inicio, fim;
        int tamanho;

        Lista() {
            this.inicio = this.fim = null;
            this.tamanho = 0;
        }

        void inserirFim(int valor) {
            var novo = new No(valor);
            if (inicio == null){
                inicio = fim;
            } else {
                fim.proximo = novo;
            }
            fim = novo;
            tamanho++;
        }

        int removerInicio() {
            if(inicio == null)
                throw new RuntimeException("Lista vazia"); //já termina o método, n percisa de um else
            int valor = inicio.valor;
            inicio = inicio.proximo;
            if (inicio == null) //só quando tem 1 nó apenas
                fim = null;
            tamanho--;
            return valor;
        }

    }
    private Lista dados;
    
    public FilaListaLigadaSimples() {
        this.dados = new Lista();
    }
    
    @Override
    public void enfileirar(int valor) {
        dados.inserirFim(valor);
    }
    
    @Override
    public int desenfileirar() {
        if(dados.inicio == null)
            throw new RuntimeException("Fila vazia");
        return dados.removerInicio();
    }
    
    int espiar() {  // normalmente chamado de "top()"
        if (dados.inicio == null) {
            throw new RuntimeException ("Fila vazia");
        }
        return dados.inicio.valor;
    }
    
    boolean contem(int valor) {
        No atual = dados.inicio;
        while (atual != null) {
            if (atual.valor == valor) return true;
            atual = atual.proximo;
        }
        return false;
    }

    @Override
    public String toString() {
        var sb = new StringBuilder("");
        sb.append("Tamanho: " + dados.tamanho + "\n");
        No atual = dados.inicio;
        while (atual != null) {
            sb.append(atual.valor + " ");
            atual = atual.proximo;
        }
        return sb.toString();
    }
}
