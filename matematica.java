public class matematica {
    static final double PI = 3.14159265358979323846;
    static final double E = 2.71828182845904523536;
    static final double PHI = 1.61803398874989484820;
    static int soma(int a, int b) {
        return a + b;
    }


static int mult(int a, int b) {
    return a * b;
}


public static void main(String[] args) {
    System.out.println("Numero PI: " + matematica.PI);
    System.out.println("Numero E: " + matematica.E);
    System.out.println("Numero PHI: " + matematica.PHI);
    System.out.println("Soma: " + matematica.soma(8, 17));
    System.out.println("mult: " + matematica.mult(29, 33));

}
}
