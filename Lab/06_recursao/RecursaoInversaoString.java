public class RecursaoInversaoString {
    public static String inverter(String str) {
        //caso base
        if (str.length() <= 1)
            return str;
        //passo recursivo
        return inverter(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(inverter("adoro batatas"));
    }
}
