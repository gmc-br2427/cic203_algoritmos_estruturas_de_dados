// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...
// 0  1  2  3  4  5  6  7   8   9   10  valores de "N"
public class RecursaoFibinacci {
    public static int fibonacci(int n) {
        //caso base
        if (n == 0 || n == 1)
            return n;
        //passo recursivo
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
    //Memoização é uma técnica de otimização que acelera programas 
    // armazenando os resultados de chamadas de funções dispendiosas 
    // (funções puras) em um cache. Ao invés de reprocessar o mesmo 
    // cálculo, a função retorna o resultado armazenado quando a mesma 
    // entrada ocorre novamente, economizando tempo de processamento 
    // à custa de memória.

    public static int fibonacciMemoizacao(int n, int[] memoria) {
        //casos base
        if (n == 0 || n == 1)
            return n;
        if (memoria[n] != -1)
            return memoria[n];
        //passo recursivo
        memoria[n] = fibonacciMemoizacao(n - 1, memoria) + fibonacciMemoizacao(n - 2, memoria);
        return memoria[n];
    }

    public static void main(String[] args) {
        int n = 50;
        int[] memoria = new int[n + 1];

        // for (int i = 0; i <= n; i++) {
        //     memo[i] = -1;
        // }
        java.util.Arrays.fill(memoria, -1);

        System.out.printf("Fibonacci(%d) =\n", n);
        long inicio = System.currentTimeMillis();
        fibonacci(n);
        long fim = System.currentTimeMillis();
        System.out.println(fim - inicio); // ~45s

        System.out.printf("FibonacciMemoizacao(%d) =\n", n);
        inicio = System.currentTimeMillis();
        fibonacciMemoizacao(n, memoria);
        fim = System.currentTimeMillis();
        System.out.println(fim - inicio); // ~0ms
    }
}
