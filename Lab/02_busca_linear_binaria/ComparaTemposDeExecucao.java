import java.util.Random;
import java.util.Arrays;
public class ComparaTemposDeExecucao {
    public static void go(){
        int quantidade = 100000000;
        int[] vetor = new int[quantidade];
        Random gerador = new Random(); //Java 10+
        // preenchimemnto do vetor com valores aleatórios
        for (int i = 0; i < vetor.length; i++){
            vetor[i] = gerador.nextInt(1, 10001); // Java 17+
        }
        var valor = -1; //gerador.nextInt(1, 10001);
        Arrays.sort(vetor);

        //tempo de busca linear
        var inicio = System.currentTimeMillis();
        BuscaLinearVetor.buscaLinear(vetor, valor);
        var fim = System.currentTimeMillis();
        System.out.println("Tempo de busca linear: " + (fim - inicio) + "ms");

        //tempo de busca binária
        inicio = System.currentTimeMillis();
        BuscaBinariaVetor.buscaBinaria(vetor, valor);
        fim = System.currentTimeMillis();
        System.out.println("Tempo de busca binaria: " + (fim - inicio) + "ms");
    }
    public static void main(String[] args) {
        go();
    }
}
