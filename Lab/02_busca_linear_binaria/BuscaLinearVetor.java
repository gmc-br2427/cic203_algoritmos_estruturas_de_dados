import java.util.Random;
public class BuscaLinearVetor {
    public static int buscaLinear(int [] vetor, int valor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    public static void busca_aleatoria() {
        int[] vetor = new int[15];
        Random gerador = new Random();
        int contador = 0;
        int[] indices = new int[vetor.length];
        //gerando valores aleatórios do vetor
        for (int i = 0; i < vetor.length; i++){
            vetor[i] = gerador.nextInt(1, 11);
        }
        //pegando um valor para ser buscado
        var valorBuscado = gerador.nextInt(1, 11);
        System.out.println("Valor aleatorio em busca: " + valorBuscado);
        //contador de aparições de valorBuscado
        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] == valorBuscado) {
                contador++;
                indices[i] = i;
            }
        }
        //buscando o valor no vetor
        var resultado = buscaLinear(vetor, valorBuscado);
        System.out.println(
            resultado != -1 
            ? "Valor encontrado " + contador + " vezes na(s) posicao(oes): " + indices[resultado] 
            : "Valor nao encontrado."
        );
    }

    public static void main(String[] args) {
        int [] vetor = {4, 6, 10, 1, 2, 60, 4, 5}; //syntax sugar: n precisa do construtor do vetor
        var resultado = buscaLinear(vetor, 3);
        System.out.println(resultado != -1 ? "Valor encontrado." : "Valor nao encontrado."); //operador ternário

        busca_aleatoria();
    }
}