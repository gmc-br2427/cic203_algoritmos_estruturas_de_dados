public interface Fila {
    //Uma interface em Java é um tipo abstrato que funciona como um "contrato" ou um "manual" para classes, 
    // agrupando métodos com corpos vazios (ou default desde Java 8) que devem ser implementados. Ela não pode 
    // ser instanciada diretamente e é usada para garantir consistência, alcançar abstração e simular herança múltipla.
    
    public void enfileirar(int valor);
    public int desenfileirar();
}
