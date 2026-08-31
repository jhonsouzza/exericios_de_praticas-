package org.example;

import java.util.Scanner;

public class praticas {
    public static void main (String[] args){
         String login = "admin";
         String senha = "souza";

         Scanner sc = new Scanner(System.in);

         System.out.println("digite login: ");
         String digitelogin = sc.nextLine();

         System.out.println("digite senha: ");
         String digitesenha = sc.nextLine();

         if (digitelogin.equals(login) && digitesenha.equals(senha)) {
             System.out.println("acesso permitido");
         } else {
             System.out.println("acesso negado");
         }


    sc.close();
    }

}
