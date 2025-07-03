import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== SISTEMA DE PROCESSO SELETIVO ===");
            System.out.println("1 - Analisar salário de candidato");
            System.out.println("2 - Selecionar candidatos");
            System.out.println("3 - Imprimir selecionados");
            System.out.println("4 - Ligar para selecionados");
            System.out.println("5 - Executar desafio contador");
            System.out.println("0 - Sair");
            System.out.print("Digite a opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    Analisador.analisarCandidato(1900);
                    Analisador.analisarCandidato(2000);
                    Analisador.analisarCandidato(2200);
                    break;
                case 2:
                    Selecionador.selecionarCandidatos();
                    break;
                case 3:
                    Selecionador.imprimirSelecionados();
                    break;
                case 4:
                    Selecionador.ligarParaSelecionados();
                    break;
                case 5:
                    Util.contador(1);
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
