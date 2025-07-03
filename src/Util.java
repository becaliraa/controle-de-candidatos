public class Util {
    public static void contador(int numero) {
        if (numero <= 3) {
            System.out.println("Contador: " + numero);
            contador(numero + 1);
        }
    }
}
