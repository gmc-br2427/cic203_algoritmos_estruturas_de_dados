// 1 2 3 4 5
public class RecursaoExibeValoresOrdemCrescente {
    public static void exibir (int n) {
        //caso base: não chama a função recursivamente, só devolve um número
        if(n > 5)
            return;
        System.out.println(n);
        //passo recursivo
        // recursão de calda: compilador traduz a recursão pra uma forma mais eficiente de função iterativa 
        exibir(n + 1);
    }

    public static void main(String[] args) {
        exibir(1);
    }
}
