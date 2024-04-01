import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        double saldo = 1550;
        String nome = "Guilherme Sales";
        String tipoConta = "Conta Corrente";

        System.out.println("******************************");
        System.out.println("\nNome: " + nome);
        System.out.println("Tipo da Conta: "+ tipoConta);
        System.out.println("Saldo em conta: R$" + saldo);
        System.out.println("\n******************************");

        int option = 0;
        while (option != 4) {
            System.out.println("\n1 - Consultar Saldo");
            System.out.println("2 - Realizar depósito");
            System.out.println("3 - Realizar saque");
            System.out.println("4 - Sair");
            System.out.print("\nQual operação você quer realizar? ");
            option = in.nextInt();

            if (option == 1) {
                
                System.out.println("\nO saldo da conta é de: R$"+saldo);

            } else {
                if (option == 2) {
                    
                    System.out.print("\nQuanto que você gostaria de depositar? ");
                    double valorDeposito = in.nextDouble();
                    saldo = saldo + valorDeposito;

                }else{
                    if (option == 3) {
                        
                        System.out.print("\nQuanto você gostaia de sacar? ");
                        double valorSaque = in.nextDouble();
                        if (valorSaque <= saldo) {
                            
                            saldo = saldo - valorSaque;

                        } else {

                            System.out.println("\nVocê não tem saldo para realizar esta operação!");
                            
                        }
                    
                    } else{

                        if (option > 4 || option < 1) {
                            System.out.println("\nOpção inválida!");
                        }
                    }
                }
            }

        }
        
        in.close();
    }
}
