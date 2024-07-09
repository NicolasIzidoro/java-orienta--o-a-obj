import java.util.Scanner;

public class EXLeituraDeDados {

    /**
     * @param args
     */
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Digite um valor inteiro (int):  ");
    int entradaInt = scan.nextInt();
    System.out.print("Digite um valor real (Double):  ");
    double  entradaDouble = scan.nextDouble();
    System.out.print("Digite um valor Logico (boolean):  ");
    boolean entradaBoolean = scan.nextBoolean();
    System.out.print("Digite uma String (Uma palavra):  ");
    String entradaPalavra = scan.next();
    scan.nextLine();

    System.out.print("Digite uma String (Varias palavras):  ");
    String entradaString = scan.nextLine();
    System.out.println("Saida dos valores lidos:  ");
    System.out.printf("\tValorInteiro: %d%n", entradaInt);
    System.out.printf("\tValorLogico: %b%n", entradaBoolean);
    System.out.printf("\tValorPalavra: %s%n", entradaPalavra);
    System.out.printf("\tValorfrase: %s%n", entradaString);
    System.out.printf("\tValorReal: %f%n", entradaDouble);


    
}