public class Vetor {
    private int[] vetor;
    private int ocupacao; // quantidade de itens
    private int capacidade;
    private static final int CAPACIDADE_PADRAO = 4; // constante para capacidade padrão
    
    // sobrecarga de construtores
    public Vetor() {
        // vetor = new int[CAPACIDADE_PADRAO];
        // ocupacao = 0; // por clareza
        // capacidade = CAPACIDADE_PADRAO;
        this(CAPACIDADE_PADRAO);
    }
    public Vetor (int capacidade) { // construtor com capacidade inicial personalizada pra n ter q colocar this.capacidade
        vetor = new int[capacidade];
        ocupacao = 0; // por clareza
        this.capacidade = capacidade;
    }


    // v1 e v2 são equivalentes, mas v2 é mais simples
    public boolean estaVazio1() {
        if (ocupacao == 0) return true;
        else return false;
    }
    public boolean estaVazio2() {
        if (ocupacao == 0) return true;
        return false;
        // n precisa do else, porque o return true já encerra a execução do método
    }
    public boolean estaVazio3() {
        return ocupacao == 0;
    }
    public boolean estaVazio4() {
        return ocupacao == 0 ? true : false;
        // operador ternário, mas é desnecessário aqui, porque ocupacao == 0 já é uma expressão booleana
    }

    public boolean estaCheio() {
        return ocupacao == capacidade;
    }

    private void aumentarCapacidade() {
        var aux = new int[capacidade * 2];
        capacidade *= 2;
        for (int i = 0; i < ocupacao; i++) 
            aux[i] = vetor[i];
        vetor = aux;
    }

    private void reduzirCapacidade() {
        var aux = new int[capacidade / 2];
        capacidade /= 2;
        for (int i = 0; i < ocupacao; i++) 
            aux[i] = vetor[i];
        vetor = aux;
    }

    public boolean adiciona(int elemento) {
        // se está cheio, redimensione
        //adiciona
        //devolve true
        if (estaCheio()) aumentarCapacidade();
        vetor[ocupacao++] = elemento;
        return true;
    }


    public int remove() {
        // if (estaVazio3()) return -1; //cuidado: -1 pode ser um valor válido, então seria melhor lançar uma exceção ou usar um tipo de retorno diferente
        // // ocupacao--;
        // return vetor[--ocupacao];

        if(!estaVazio3()) {
            --ocupacao;
            if(ocupacao < capacidade / 4 && ocupacao > CAPACIDADE_PADRAO) {
                reduzirCapacidade();
            }
            return vetor[ocupacao];
        }
        return -1;
    }

    @Override
    public String toString() {
        // if(estaVazio3()) return "vetor vazio";
        // String s = "";
        // for (int i = 0; i < ocupacao; i++) 
        //     s += vetor[i] + " ";
        // return s;

        // StringBuilder
        var sb = new StringBuilder();
        sb.append("Quantidade: ").append(ocupacao).append("\n");
        sb.append("Capacidade: ").append(capacidade).append("\n");
        if(!estaVazio3()) {
            for (int e : vetor) { //ehanced for ou foreach
                sb.append(e).append(" ");
            }
        }
        return sb.toString();
    }
}