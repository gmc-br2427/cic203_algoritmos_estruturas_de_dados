// import java.util.NoSuchElementException;

public class Pilha {
    private int topo;
    private int[] dados;
    private int capacidade;

    public Pilha (int capacidade) { // sobrecarga de construtor
        dados = new int[capacidade];
        topo = 0;
        this.capacidade = capacidade;
    }

    public Pilha () { // construtor padrão: vetor tamanho 10
        this(10);
    }

    public boolean pilhaVazia () {
        return topo == 0;
    }

    public boolean pilhaCheia () {
        return topo == capacidade;
    }

    public int tamanho () {
        return topo;
    }

    public boolean empilha (int i) {
        if (pilhaCheia()) return false;
        dados[topo++] = i;
        return true;
    }
    
    public int desempilha () {
        //teste de pilha vazia vai ficar para a aplicação
        // if (pilhaVazia())
        //     throw new NoSuchElementException();
        return dados[--topo];
    }
    @Override
    public String toString () {
        if (pilhaVazia()) return "pilha vazia";
        String s = "";
        for (int i=topo-1; i>=0; i--) {
            s += dados[i] + "\n";
        }
        return s;
    }
}