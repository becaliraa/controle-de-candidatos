public class Analisador {
    public static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS");
        } else {
            System.out.println("CANDIDATO REPROVADO");
        }
    }
}
