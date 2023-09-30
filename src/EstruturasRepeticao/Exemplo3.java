package EstruturasRepeticao;

public class Exemplo3 {
    public static void main(String[] args) throws InterruptedException {

        String[] listaCarros = {"Chevete", "Opala", "Fusca", "Jipe"};

        for (String cadaCarro : listaCarros) {

            System.out.println(cadaCarro);
            Thread.sleep(1000);

        }
    }
}
