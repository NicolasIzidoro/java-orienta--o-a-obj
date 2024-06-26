public class Math {
    static int mult(int a, int b){
        return a*b;
    }
    static double mult(double a, double b){
        return a*b;
    }
    static double mult(double a, double b, double c){
        return a*b*c;
    }
    public static void main(String[] args){
        System.out.println("mult: " + Math.mult(9,5));
        System.out.println("mult: " + Math.mult(3.9,5.8));
        System.out.println("mult: " + Math.mult(2.4,8));
        System.out.println("mult: " + Math.mult(9,8.2));
        System.out.println("mult: " + Math.mult(6.8,5,2.9));
    }

}
