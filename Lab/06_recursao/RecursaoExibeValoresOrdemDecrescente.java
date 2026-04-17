// 5 4 3 2 1 
public class RecursaoExibeValoresOrdemDecrescente {
    public static void exibir(int n) {
        //caso base
        if (n < 1)
            return;
        System.out.println(n);
        //passo recursivo
        exibir(n - 1);
    }

    public static void main(String[] args) {
        exibir(5);
    }
}
