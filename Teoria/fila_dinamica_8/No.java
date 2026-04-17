public class No <T> {  // Fazendo um nó genérico, T para tipo genérico ou E para elemento genérico
    private T info;
    private No<T> proximo;  // Operador diamante <>: permite criação de objetos genéricos
    public No (T info) {
        this.info = info;
        this.proximo = null; //por clareza, compilador faz sozinho
    }
    public T getInfo() {
        return info;
    }
    public void setInfo(T info) {
        this.info = info;
    }
    public No<T> getProximo() {
        return proximo;
    }
    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }
    @Override
    public String toString() {
        return "[" + info + "]";
    }
    
}