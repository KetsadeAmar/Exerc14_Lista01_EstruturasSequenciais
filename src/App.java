import java.util.Scanner;

 public class App {

     // Início do Programa
     public static void main(String[] args) throws Exception {
        
        // Declaração de Variaveis
        double peso;
        double multa;
        double excesso;

        // Solicitação de 
        Scanner teclado = new Scanner (System.in);
        System.out.println ("Digite o peso dos seu peixes em Kg: " );
        peso = teclado.nextDouble();
        teclado.close();

        if (peso > 50) {
            excesso = peso - 50;
            multa = excesso * 4;
            System.out.println ("Seu peixe excedeu: " + excesso + "Kg");
            System.out.println ("O valor da multa é R$"+ multa);   
        }else{
            System.out.println ("Não houve excesso de peso.");
        }
      
    }
}
