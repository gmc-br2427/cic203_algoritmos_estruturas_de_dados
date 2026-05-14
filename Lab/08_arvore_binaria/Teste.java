public class Teste {
    public static void main(String[] args) {
        var abb = new ArvoreBinariaBusca();
        int[] numeros = {50, 30, 70, 20, 40, 60, 80};
        for (int n : numeros) {
            abb.inserir(n);
        }
        // System.out.println("Menor: " + abb.buscaMenor()); // 20
        // System.out.println("40 existe? " + abb.buscar(40)); // true
        // System.out.println("99 existe? " + abb.buscar(99)); // false


        // System.out.print("\nPre-ordem: ");
        // abb.preOrdem();
        // System.out.print("\nEm-ordem: ");
        // abb.emOrdem();
        // System.out.print("\nPos-ordem ");
        // abb.posOrdem();

        // System.out.println("\n\nSoma de todos os valores da arvore: " + abb.somatorio());

        System.out.println("Em ordem");
        abb.emOrdem();
        System.out.println("\n========================");
        System.out.println("Removendo o 40");
        abb.remover(40);
        abb.emOrdem();
        System.out.println("\n========================");
        System.out.println("Removendo o 20");
        abb.remover(20);
        abb.emOrdem();
        System.out.println("\n========================");
        System.out.println("Removendo o 50");
        abb.remover(50);
        abb.emOrdem();
    }
}
