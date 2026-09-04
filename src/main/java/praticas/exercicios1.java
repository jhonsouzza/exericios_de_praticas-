package praticas;
import java.util.Scanner;

public class exercicios1 {
   public static void main(String[] args) {
       String login = "souza";
       String senha = "timao";

       Scanner sc = new Scanner(System.in);
 //teste
       int tentativas = 3;

       while (tentativas > 0) {

           System.out.println("Digite o login:  ");
           String Digitelogin = sc.nextLine();

           System.out.println("Digite a senha: ");
           String Digitesenha = sc.nextLine();

           if (Digitelogin.equals(login) && Digitesenha.equals(senha)) {
               System.out.println("Acesso Permitido");
               break;
           } else {
               System.out.println("Acesso Negado");
               tentativas --;
            System.out.println("tentativas restantes  " + tentativas);
           }

       }      sc.close();
   }


   }
