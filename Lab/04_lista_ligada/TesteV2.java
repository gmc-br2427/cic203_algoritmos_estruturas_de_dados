import java.util.Random;
public class TesteV2 {
    public static void main(String[] args) throws Exception{
        var gerador = new Random();
        var playlist = new ListaLigada();
        String[] todas = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
        while (true) {
            var m = todas[gerador.nextInt(todas.length)];

            var oQueFazer = gerador.nextInt(1, 5); //1: add no começo, 2: add no fim, 3: remover do começo, 4: remover do fim
            switch (oQueFazer) {
                case 1:
                    System.out.println("Adicionando no comeco...");
                    Thread.sleep(1000);
                    playlist.adicionarNoComeco(m);
                    break;
                case 2:
                    System.out.println("Adicionando no fim...");
                    Thread.sleep(1000);
                    playlist.adicionarNoFim(m);
                    break;
                case 3:
                    System.out.println("Removendo do comeco...");
                    Thread.sleep(1000);
                    playlist.removerDoComeco();
                    break;
                case 4:
                    System.out.println("Removendo do fim...");
                    Thread.sleep(1000);
                    playlist.removerDoFim();
                    break;
            }

            System.out.println(playlist);
            System.out.println("=================================");

            Thread.sleep(1000);
        }
    }
}
