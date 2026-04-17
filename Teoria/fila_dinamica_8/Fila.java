public class Fila <T> {
    private No<T> primeiro;
    private No<T> ultimo;
    //construtor padrão
    public boolean estaVazia () {
        return primeiro == null;
    }

    // implementação normal de lista ligada simples, mas sem add no primeiro e remover no último
    public void enfileira (T info) {  // add no último
        No<T> novo = new No<>(info);
        if (estaVazia()) {
            primeiro = novo;
        }
        else {
            ultimo.setProximo(novo);
        }
        ultimo = novo;
    }
    public T desenfileira () {  // remover no primeiro
        if (estaVazia())
            return null;
        T temp = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        if (primeiro == null) { //esvaziou a fila
            ultimo = null;
        }
        return temp;
    }
    public T consultaPrimeiro () {
        if (estaVazia()) return null;
        return primeiro.getInfo();
    }
}