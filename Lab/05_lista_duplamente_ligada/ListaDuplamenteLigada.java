public class ListaDuplamenteLigada {
    No primeiro;
    No ultimo;
    int quantidade;

    boolean estaVazia() {
        return quantidade == 0;
    }

    // String acessarAutoral(int posicao) { // meu. lógica diferente do Bossini
    //     if (!estaVazia()) {
    //         No atual = primeiro;
    //         if (posicao == 0) {
    //             return primeiro.musica;
    //         }
    //         for (int i = 1; i < posicao; i++) {
    //             atual = primeiro.proximo;
    //         }
    //         return atual.musica.toString();
    //     }
    //     return "Lista vazia.";           
    // }

    String acessar(int posicao) { // Bossini
        if (estaVazia() || posicao >= quantidade || posicao < 0) {
            return null;
        }
        No aux = primeiro;
        int contador = 0;
        while (contador <= posicao) {
            aux = aux.proximo;
            contador++;
        }
        return aux.musica;
    }

    void inserirNoComeco(String musica) {
        No novo = new No(musica);
        if(estaVazia()){
            primeiro = novo;
            ultimo = novo;
        } else {
            novo.proximo = primeiro;
            primeiro.anterior = novo;
            primeiro = novo;
        }
        quantidade++;
    }

    void inserirNoFim(String musica) {
        No novo = new No(musica);
        if(estaVazia()){
            inserirNoComeco(musica);
        } else {
            novo.anterior = ultimo;
            ultimo.proximo = novo;
            ultimo = novo;
        }
    }

    // void removerDoComecoAutoral() { // meu. lógica diferente do Bossini
    //     // O método faz isso:
    //         // verifica se a lista tem elementos;
    //         // move o primeiro para o próximo nó;
    //         // decrementa quantidade;
    //         // se a lista ficou vazia, coloca ultimo = null;
    //         // senão, ajusta primeiro.anterior = null.
    //     if(!estaVazia()){
    //         primeiro = primeiro.proximo;
    //         quantidade--;
    //         if(estaVazia()){
    //             ultimo = null;
    //         } else {
    //             primeiro.anterior = null;
    //         }
    //     }
    // }

    void removerDoComeco() { // Bossini
        if(!estaVazia()){
            if(quantidade == 1){
                primeiro = null;
                ultimo = null;
            } else {
                primeiro = primeiro.proximo;
                primeiro.anterior = null;
                quantidade--;
            }
        }
    }

    void removerDoFim() {
        if(!estaVazia()) {
            if(quantidade == 1) {
                removerDoComeco();
            } else {
                ultimo = ultimo.anterior;
                ultimo.proximo = null;
                quantidade--;
            }
        }
    }

    public void exibirAPartirDoInicio() {
        // primeiro -> 1 <-> 2 <-> 3 <-> null
        System.out.print("primeiro -> ");
        No aux = primeiro;
        while (aux != null) {
            System.out.print(aux.musica + " <-> ");
            aux = aux.proximo;
        }
        System.out.print("null\n");
    }

    public void exibirAPartirDoFim() {
        // ultimo -> 3 <-> 2 <-> 1 <-> null
        No aux = ultimo;
        System.out.print("ultimo -> ");
        while (aux != null) {
            System.out.print(aux.musica + " <-> ");
            aux = aux.anterior;
        }
        System.out.print("null\n");
    }
}
