public class Teste {
    public static void main(String[] args) {
        CatalogoProdutos catalogo = new CatalogoProdutos();

        catalogo.cadastrar(new Produto(50, "Caderno"));
        catalogo.cadastrar(new Produto(30, "Caneta azul"));
        catalogo.cadastrar(new Produto(70, "Mochila"));
        catalogo.cadastrar(new Produto(20, "Borracha"));
        catalogo.cadastrar(new Produto(40, "Lapis"));
        catalogo.cadastrar(new Produto(60, "Estojo"));

        System.out.println("=== Catalogo completo (em ordem) ===");
        catalogo.listarTodos();

        System.out.println();
        System.out.println("Consultar codigo 40: " + catalogo.consultar(40));
        System.out.println("Consultar codigo 99: " + catalogo.consultar(99));

        System.out.println();
        System.out.println("Produto com menor codigo: " + catalogo.produtoComMenorCodigo());
    }
}