//somar: 0 + 1 + 2 + ... + n
public class RecursaoSomatorioValores {
    public static int somar(int n) {
        //caso base
        if (n == 0)
            return 0;
        //passo recursivo
        return n + somar(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(somar(5));
    }
}
