package EstruturasRepeticao;
//atv01_Exemplo1
//Listar alunos e verificar posição na lista
// Se o numero for par, escreva "par" e o numero correspondente
//Se o numero for impar, escreva "impar" e o numero correspondente
//Se for zero, escreva "zero"
public class atv01 {
    public static void main(String[] args) {
        String[] listaProfessores = {"Alexia", "Ordilei", "Jessica", "Thiago", "Samanta"};

        for (int contador = 0; contador < listaProfessores.length; contador++) {

            if(contador == 0){
                System.out.println("O numero do indice do(a) professor(a) " + listaProfessores[contador] + " e Zero");

            } else if (contador % 2 == 0) {
                System.out.println("O numero do indice do(a) professor(a) " + listaProfessores[contador] + " e Par");

            } else{
                System.out.println("O numero do indice do(a) professor(a) " + listaProfessores[contador] + " e Impar");
            }

        }
    }
}
