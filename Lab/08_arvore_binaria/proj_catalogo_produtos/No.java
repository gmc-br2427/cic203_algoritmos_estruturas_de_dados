public class No {
    Produto produto;
    No esquerda;
    No direita;

    public No(Produto produto) {
        this.produto = produto;
        this.esquerda = null;
        this.direita = null;
    }
}