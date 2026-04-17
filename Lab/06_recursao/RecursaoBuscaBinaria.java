public class RecursaoBuscaBinaria {
    public static int buscaBinaria(int[] v, int valor, int inicio, int fim) {
        //caso base
        if (inicio > fim)
            return -1;
        //calcula meio
        int meio = (inicio + fim) / 2;
        // se encontrar na posição meio, devolver
        if (v[meio] == valor)
            return meio;
        //senão, comparar: se valor for menor q meio, buscar no
        //subvetor à esquerda, senão, o à direita
        if (valor < v[meio]) {
            return buscaBinaria(v, inicio, meio - 1, valor);
        } else {
            return buscaBinaria(v, meio + 1, fim, valor);
        }
    }

    public static void main(String[] args) {
        int[] v = {2, 5, 6, 7, 22, 37, 38, 40, 47, 50};
        System.out.println(buscaBinaria(v, 3, 0, 9));
        System.out.println(buscaBinaria(v, 47, 0, 9));
    }
}
