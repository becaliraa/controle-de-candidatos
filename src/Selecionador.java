public class Selecionador {

    static String[] candidatos = { "Ana", "João", "Carla", "Pedro", "Mariana" };
    static double[] salarios = { 1900, 2100, 2000, 2300, 1800 };

    public static void selecionarCandidatos() {
        System.out.println("\nSelecionando candidatos...");
        for (int i = 0; i < candidatos.length; i++) {
            if (salarios[i] <= 2000) {
                System.out.println("Selecionado: " + candidatos[i]);
            }
        }
    }

    public static void imprimirSelecionados() {
        System.out.println("\nCandidatos selecionados:");
        for (int i = 0; i < candidatos.length; i++) {
            if (salarios[i] <= 2000) {
                System.out.println("- " + candidatos[i]);
            }
        }
    }

    public static void ligarParaSelecionados() {
        System.out.println("\nLigando para os candidatos...");
        for (int i = 0; i < candidatos.length; i++) {
            if (salarios[i] <= 2000) {
                System.out.println("Ligando para " + candidatos[i] + "...");
            }
        }
    }
}
