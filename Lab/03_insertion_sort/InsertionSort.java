public class InsertionSort {
    public static void go(int[] vetor){
        // Começa do segundo elemento (index 1) pq o primeiro é
        // considerado como já ordenado.
        for (int i = 1; i < vetor.length; i++) {
            int chave = vetor[i]; // Elemento atual a ser inserido
            int j = i - 1; // Index do último elemento na porção ordenada

            // Move emlementos do vetor[0..i-1], que são maiores que a chave,
            // pra uma posição a frente da posição atual
            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j--;
            }

            // Coloca o elemento chave na posição correta
            vetor[j + 1] = chave;
        }
    }
    public static void main(String[] args) {
        var vetor =new int[]{1, 5, 7, 3, 8, 3, 7, 9, 4, 2, 6, 10};
        System.out.println("Antes: " + java.util.Arrays.toString(vetor));
        go(vetor);
        System.out.println("Depois: " + java.util.Arrays.toString(vetor));
    }
}
