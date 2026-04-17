public class RecursaoExponencial {
    public static long potencia(long base, long expoente) { //long: int q comporta mais números
        if (expoente == 0) {
            return 1;
        }
        return base * potencia(base, expoente - 1);
    }

    public static void main(String[] args) {
        System.out.println(potencia(2, 5));
    }
}
