package EstruturasDecisao;

import java.util.Scanner;

public class exe2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //System.out.print("Numero digitado: ");
        System.out.println("digite o primeiro valor: ");
        System.out.println("digite o segundo valor: ");

        double valor1 = Double.parseDouble(leitor.nextLine());
        double valor2 = Double.parseDouble(leitor.nextLine());

        if(valor1 > valor2){
            System.out.println("digite o primeiro valor: ");
            System.out.println("digite o segundo valor: ");

        }else if(valor2 > valor1){
            System.out.println("negativo");
        }else{
            System.out.println("Os valores sao iguais");

        }
    }
}


