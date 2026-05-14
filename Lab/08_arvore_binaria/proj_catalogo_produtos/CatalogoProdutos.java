public class CatalogoProdutos {
    private No raiz;

    public CatalogoProdutos() {
        this.raiz = null;
    }

    public void cadastrar(Produto p) {
        this.raiz = cadastrarRecursivo(this.raiz, p);
    }

    private No cadastrarRecursivo(No atual, Produto p) {
        if (atual == null) {
            return new No(p);
        }

        if (p.codigo < atual.produto.codigo) {
            atual.esquerda = cadastrarRecursivo(atual.esquerda, p);
        } else if (p.codigo > atual.produto.codigo) {
            atual.direita = cadastrarRecursivo(atual.direita, p);
        }

        return atual;
    }

    public Produto consultar(int codigo) {
        return consultarRecursivo(this.raiz, codigo);
    }

    private Produto consultarRecursivo(No atual, int codigo) {
        if (atual == null) {
            return null;
        }

        if (codigo == atual.produto.codigo) {
            return atual.produto;
        }

        if (codigo < atual.produto.codigo) {
            return consultarRecursivo(atual.esquerda, codigo);
        } else {
            return consultarRecursivo(atual.direita, codigo);
        }
    }

    public void listarTodos() {
        listarRecursivo(this.raiz);
    }

    private void listarRecursivo(No atual) {
        if (atual == null) {
            return;
        }

        listarRecursivo(atual.esquerda);
        System.out.println(atual.produto);
        listarRecursivo(atual.direita);
    }

    public Produto produtoComMenorCodigo() {
        if (this.raiz == null) {
            return null;
        }

        No atual = this.raiz;

        while (atual.esquerda != null) {
            atual = atual.esquerda;
        }

        return atual.produto;
    }
}