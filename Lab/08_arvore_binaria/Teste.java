public class Teste {
    public static void main(String[] args) {
        var arvore = new ArvoreBinariaBusca();
        int[] numeros = {50, 30, 70, 20, 40, 60, 80};
        for (int n : numeros) {
            arvore.inserir(n);
        }
        System.out.println("Menor: " + arvore.buscaMenor()); // 20
        System.out.println("40 existe? " + arvore.buscar(40)); // true
        System.out.println("99 existe? " + arvore.buscar(99)); // false


        System.out.print("\nPre-ordem: ");
        arvore.preOrdem();
        System.out.print("\nEm-ordem: ");
        arvore.emOrdem();
        System.out.print("\nPos-ordem ");
        arvore.posOrdem();

        System.out.println("\n\nSoma de todos os valores da arvore: " + arvore.somatorio());
    }
}
