package EstruturasRepeticao;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int idade;
        System.out.println("Digite sua idade");


        do{
            System.out.println("Digite sua idade");
            idade = leitor.nextInt();


        }while (idade < 18);
        System.out.println("Maior que 18 anos");
    }
}
