// ABB: Árvore Binária de Busca
public class ArvoreBinariaBusca {
    private No raiz;

    public ArvoreBinariaBusca() {
        this.raiz = null;
    }

    public void inserir(int valor) {
        this.raiz = inserirRecursivo(this.raiz, valor);
    }

    private No inserirRecursivo(No atual, int valor) {
        if(atual == null) {
            return new No(valor);
        }

        if(valor < atual.valor) {
            atual.esquerda = inserirRecursivo(atual.esquerda, valor);
        } else if(valor > atual.valor) {
            atual.direita = inserirRecursivo(atual.direita, valor);
        }
        // Se valor == atual.valor, não insere duplicado
        return atual;
    }

    public boolean buscar(int valor) {
        return buscarRecursivo(this.raiz, valor);
    }

    private boolean buscarRecursivo(No atual, int valor){
        if(atual == null) {
            return false;
        } 
        if(valor == atual.valor) {
            return true;
        }
        
        if(valor < atual.valor) {
            return buscarRecursivo(atual.esquerda, valor);
        }
        // valor > atual.valor
        return buscarRecursivo(atual.direita, valor);
    }

    public int buscaMenor() {
        if(this.raiz == null) {
            throw new IllegalStateException("A árvore está vazia.");
        }
        return buscaMenorRecursivo(this.raiz);
    }

    private int buscaMenorRecursivo(No atual) {
        if(atual.esquerda == null) {
            return atual.valor;
        }
        return buscaMenorRecursivo(atual.esquerda);
    }

    public int buscaMaior() {
        if(this.raiz == null) {
            throw new IllegalStateException("A árvore está vazia.");
        }
        return buscaMaiorRecursivo(this.raiz);
    }

    private int buscaMaiorRecursivo(No atual) {
        if(atual.direita == null) {
            return atual.valor;
        }
        return buscaMaiorRecursivo(atual.direita);
    }

    public void preOrdem() { // raiz, esquerda, direita
        preOrdemRecursivo(this.raiz);
    }

    private void preOrdemRecursivo(No atual) {
        if (atual == null) {
            return;
        }

        System.out.print(atual.valor + " "); // 1º visita a raiz
        preOrdemRecursivo(atual.esquerda); // 2º percorre a esquerda
        preOrdemRecursivo(atual.direita); // 3º percorre a direita
    }

    public void emOrdem() { // esquerda, raiz, direita   devolve os números em ordem crescente
        emOrdemRecursivo(this.raiz);
    }

    private void emOrdemRecursivo(No atual) {
        if(atual == null) {
            return;
        }

        emOrdemRecursivo(atual.esquerda); // 1º percorre a esquerda
        System.out.print(atual.valor + " "); // 2º visita a raiz
        emOrdemRecursivo(atual.direita); //3º percorre a direita
    }

    public void posOrdem() { // esquerda, direita, raiz
        posOrdemRecursivo(this.raiz);
    }

    private void posOrdemRecursivo(No atual) {
        if(atual == null){
            return;
        }

        posOrdemRecursivo(atual.esquerda); // 1º percorre a esquerda
        posOrdemRecursivo(atual.direita); //2º percorre a direita
        System.out.print(atual.valor + " "); // 3º visita a raiz
    }

    public int somatorio() {
        return somatorioRecursivo(this.raiz);
    }

    private int somatorioRecursivo(No atual) {
        if (atual == null) {
            return 0;
        }

        return atual.valor + somatorioRecursivo(atual.esquerda) + somatorioRecursivo(atual.direita);
    }

    public void remover (int valor){
        raiz = removerRecursivo(raiz, valor);
    }

    private No removerRecursivo(No atual, int valor){
        if (atual == null) {
            return null;
        }
        if (valor < atual.valor) {
            atual.esquerda = removerRecursivo(atual.esquerda, valor);
        } 
        else if (valor > atual.valor) {
            atual.direita = removerRecursivo(atual.direita, valor);
        } 
        else {
            // Caso 1: nó sem filhos
            if (atual.esquerda == null && atual.direita == null) {
                return null;
            }
            // Caso 2: nó com apenas um filho
            if (atual.esquerda == null) {
                return atual.direita;
            }
            if (atual.direita == null) {
                return atual.esquerda;
            }
            // Caso 3: nó com dois filhos
            No sucessor = encontrarMenor(atual.direita);
            atual.valor = sucessor.valor;
            atual.direita = removerRecursivo(atual.direita, sucessor.valor);
        }
        return atual;
    }

    private No encontrarMenor(No no) {
        while (no.esquerda != null) {
            no = no.esquerda;
        }
        return no;
    }
}