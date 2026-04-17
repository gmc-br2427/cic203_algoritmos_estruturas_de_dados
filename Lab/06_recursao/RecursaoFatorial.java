// n! = 1 * 2 * 3 * ... * n
public class RecursaoFatorial {
    public static int fatorial(int n) {
        //caso base
        if (n == 0)
            return 1;
        //passo recursivo
        return n * fatorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(fatorial(5));
    }
}
