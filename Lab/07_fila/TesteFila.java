import java.util.Random;
public class TesteFila {
    public static void main(String[] args) throws Exception{
        var rand = new Random();
        // Teste de fila em lista ligada simples
        var fila = new FilaListaLigadaSimples();
        while (true) {
            int decisao = rand.nextInt(1, 3);
            if (decisao == 1) {
                System.out.println("Enfileirando...");
                int valor = rand.nextInt(1, 101);
                fila.enfileirar(valor);
            } else {
                try {
                    System.out.println("Desenfileirando...");
                    fila.desenfileirar();
                } catch (Exception e) {
                    System.out.println("Fila vazia");
                }
            }
            System.out.println(fila.toString());
            Thread.sleep(5000);
        }
    }
}
