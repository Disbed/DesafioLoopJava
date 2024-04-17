import java.util.Scanner;
public class DesafioJava {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nomeUsuario = "Luis Carlos Roberto";
        String tipoConta = "Corrente";
        double saldo = 2500;
        int opcaoMenu;
        double valorReceber;
        double valorTransferir;
        String menu = """
                ************************************************
                Dados iniciais do cliente:
                               
                Nome:              %s     
                Tipo conta:        %s  
                Saldo inicial:     R$%.2f 
                ************************************************
                               
                Operações
                               
                1 - Consultar saldos
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                               
                Digite a opção desejada:
                 """.formatted(nomeUsuario, tipoConta, saldo);
        String opcoesMenu = """
                Operações

                1 - Consultar saldos
                2 - Receber valor
                3 - Transferir valor
                4 - Sair

                Digite a opção desejada:""";

        System.out.println(menu);
        opcaoMenu = leitura.nextInt();

        while (opcaoMenu != 4) {
            if (opcaoMenu == 1) {
                System.out.println("Seu saldo na conta é  R$" + saldo);
                System.out.println(opcoesMenu);
                opcaoMenu = leitura.nextInt();
            } else if (opcaoMenu == 2) {
                System.out.println("Digite o valor que deseja receber :");
                valorReceber = leitura.nextDouble();
                saldo += valorReceber;
                System.out.println("Saldo atualizado  R$" + saldo);
                System.out.println(opcoesMenu);
                opcaoMenu = leitura.nextInt();
            } else if (opcaoMenu == 3) {
                System.out.println("Digite o valor que deseja transferir");
                valorTransferir = leitura.nextDouble();
                if (valorTransferir <= saldo) {
                    saldo -= valorTransferir;
                    System.out.println("Saldo atualizado  R$" + saldo);
                    System.out.println(opcoesMenu);
                } else {
                    System.out.println("Não é possivel transferir esse valor");
                    System.out.println(opcoesMenu);
                }
                opcaoMenu = leitura.nextInt();
            } else {
                System.out.println("Opção Invalida!");
                System.out.println(opcoesMenu);
                opcaoMenu = leitura.nextInt();


            }
        }
    }
}
