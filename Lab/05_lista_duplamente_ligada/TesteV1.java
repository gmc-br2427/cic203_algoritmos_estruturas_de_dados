public class TesteV1 {
    public static void main(String[] args) {
        ListaDuplamenteLigada lista = new ListaDuplamenteLigada();
        lista.inserirNoComeco("1");
        lista.inserirNoComeco("2");
        lista.inserirNoComeco("3");
        lista.exibirAPartirDoInicio();
        System.out.println(lista.acessar(2));
    }
}
