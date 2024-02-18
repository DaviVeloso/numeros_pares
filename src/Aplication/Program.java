package Aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        int[] vect = new int[n];

        for(int i = 0; i < n; i++){
            System.out.println("Digite o numero : ");
            vect[i] = sc.nextInt();
        }
        System.out.println("Numero pares :");
        int soma = 0;
        for(int i = 0; i < n; i++){
            if(vect[i] % 2 == 0){
                soma += 1;
                System.out.println(vect[i]);
            }
        }
        System.out.println("Quantidade de pares : " + soma);


        sc.close();

    }
}
