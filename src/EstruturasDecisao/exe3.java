package EstruturasDecisao;

import java.util.Scanner;

public class exe3 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um numero:");

        double numero = Double.parseDouble(leitor.nextLine());

        if(numero > 0){
            System.out.println("positivo");

        }else if(numero < 0){
            System.out.println("negativo");
        }else{
            System.out.println("neutro");

        }
    }
}
