public class No { //Nó
    String musica;
    No proximo;

    No() {}

    No(String musica, No proximo) {
        this.musica = musica;
        this.proximo = proximo;
    }
}
