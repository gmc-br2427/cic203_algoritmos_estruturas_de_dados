import java.util.Arrays;
import java.util.Random;
public class BuscaBinariaVetor {
    public static int buscaBinaria(int[] vetor, int valor) {
        int inicio = 0, fim = vetor.length - 1;
        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            if (vetor[meio] == valor) return meio;
            else if (vetor[meio] < valor) inicio = meio + 1;
            else fim = meio - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] numeros = {4, 6, 1, 8, 5, 3, 7, 2, 10, 9};
        System.out.print("Antes da ordenacao:");
        System.out.println(Arrays.toString(numeros));
        Arrays.sort(numeros);
        System.out.print("Depois da ordenacao:");
        System.out.println(Arrays.toString(numeros));
        var gerador = new Random();
        var valorBuscado = gerador.nextInt(1, 16);
        System.out.println("Valor aleatorio em busca: " + valorBuscado);
        var resultado = buscaBinaria(numeros, valorBuscado);
        System.out.println(resultado != -1 ? "Valor encontrado na posicao " +  resultado : "Valor nao encontrado.");
    }
}
