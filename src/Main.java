import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "Luan Lopes";
        String tipoConta = "Conta corrente";
        double saldo = 1600.23;

        int opcao = 0;


        System.out.println("***********************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println(tipoConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("\n***********************");

        String menu = """
                \n** Digite sua opcao **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Finalizar
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println(saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Voce nao tem saldo suficiente");
                } else {
                    saldo = saldo - valor;
                }
            } else if (opcao == 3) {
                System.out.println("Digite o valor do deposito: ");
                double valor = leitura.nextDouble();

                saldo = saldo + valor;

                System.out.println("Novo saldo: " + saldo);
            } else if (opcao != 1 || opcao != 2 || opcao != 3 || opcao != 4) {
                System.out.println("opcao invalida");
            }
        }
    }
}