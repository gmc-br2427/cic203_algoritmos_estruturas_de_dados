public class ListaLigada {
    No primeiro = null, ultimo = null;
    int quantidade = 0;
    
    // caso a extensão esteja reclamando
    static class No {
        String musica;
        No proximo;

        No() {}

        No(String musica, No proximo) {
        this.musica = musica;
        this.proximo = proximo;
    }
    }
    
    // inserindo musicas hipotéticas aq
    public void adicionarNoComeco(String musica) {
        //construir um nó
        var novo = new No();
        //cadastrar uma música
        novo.musica = musica;
        //incrementar a quantidade
        quantidade++;
        if(estaVazia()){
            //ajustar o primeiro
            primeiro = novo;
            //ajustar o último
            ultimo = novo;
            //ajustar o ponteiro próximo do primeiro e único nó
            primeiro.proximo = null; // feito automaticamente pelo compilador, mas só pra deixar explícito
        } else {
            //ajustar o ponteiro próximo do novo nó
            novo.proximo = primeiro;
            //ajustar o primeiro
            primeiro = novo;
        }
    }

    public boolean estaVazia() {
        // return primeiro == null;
        return quantidade == 0; // só atualizar a quantidade
    }

    public void exibir() {
        if(!estaVazia()){
            No aux = primeiro;
            while (aux != null) {
                System.out.println(aux.musica + " ");
                aux = aux.proximo;
            }
            System.out.println();
        } else {
            System.out.println("A lista está vazia");
        }
    }

    public void adicionarNoFim(String musica) {
        if(estaVazia()){
            adicionarNoComeco(musica);
        } else {
            No novo = new No(musica, null);
            ultimo.proximo = novo;
            ultimo = novo;
            quantidade++;
        }
        
    }

    public void removerDoComeco(){
        if(!estaVazia()){
            if(quantidade == 1){
                primeiro = null;
                ultimo = null;
            } else {
                primeiro = primeiro.proximo;
            }
            quantidade--;
        }
    }

    public void removerDoFim(){
        if(!estaVazia()){
            if(quantidade == 1){
                removerDoComeco();
            } else {
                No aux = primeiro;
                while (aux.proximo.proximo != null) { //aux, seu próximo do próximo é nulo? (percorre toda a lista até achar o penúltimo)
                    // n mano
                    aux = aux.proximo;
                }
                aux.proximo = null;
                ultimo = aux;
                quantidade--;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("");
        No aux = primeiro;
        sb.append("Quantidade: ").append(quantidade).append("\n");   
        if (!estaVazia()) {
            aux = primeiro;
            while (aux != null) {
                sb.append(aux.musica).append("->");
                aux = aux.proximo;
            }
            sb.append("null\n");
        } 
        else {
            sb.append("A lista esta vazia\n");
        }
        return sb.toString();
    }

}