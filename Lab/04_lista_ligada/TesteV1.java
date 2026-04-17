public class TesteV1 {
    public static void main(String[] args) {
        var lista = new ListaLigada();
        for(int i = 0; i < 10; i++) {
            lista.adicionarNoComeco("Musica " + i);
            System.out.println("Quantidade: " + lista.primeiro.musica);
        }
    }
}
