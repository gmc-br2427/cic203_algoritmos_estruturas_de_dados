public class Pessoa {
    private String nome;
    private int anoNasc;
    public Pessoa(String nome, int anoNasc) {
        this.nome = nome;
        this.anoNasc = anoNasc;
    }
    @Override
    public String toString() {
        return "[" + nome + ", " + anoNasc + "]";
    }
    
}