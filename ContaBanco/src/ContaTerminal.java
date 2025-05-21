import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
        //To-do: - Conhecer e importar a classe Scanner

        //       - Exibir as mensagens para o usuário

        //       - Obter os valores digitados no terminal

        //       - Exibir a mensagem com os dados da conta registrada

        public static void main(String[] args) throws Exception{
        
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Número da conta:");
        int conta = scanner.nextInt();

        System.out.println("Número da agência:");
        String agencia = scanner.next();

        System.out.println("Nome:");
        String nomeCliente = scanner.next();

        System.out.println("Sobrenome:");
        String sobrenomeCliente = scanner.next();

        System.out.println("Saldo bancário:");
        double saldo = scanner.nextDouble();

        //Imprimindo dados inseridos pelo usuário
        System.out.println("Olá, " + nomeCliente + " " + sobrenomeCliente + ", obrigado por criar uma conta em nosso banco! Sua agência é " + agencia + ", conta de número " + conta + " e seu saldo de R$" + saldo + " já está disponível para saque.");
        }
        
}
