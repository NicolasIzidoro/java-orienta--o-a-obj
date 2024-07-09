import java.util.Locale;
public class EXLocalizacao {
    public static void main(String[] args) {
        Locale locale = new Locale("en", "US");
        if (args.length == 0) {
            System.err.println("Precisa de argumentos");
            System.exit(0);
        }
        String resp = "ERROR";
        args[0] =args[0].toLowerCase();
        if (args[0].equals("--help")) {
            resp = "Programa: Cmd Math via args\n" + 
            "Funções: \n\tsqrt x\n\tpow x y\n\tlog10 x\n" + 
            "Constantes:\n\tPI\n\tE\n\tPHI\n";
        } else if (args[0].equals("--autor")){
            resp = "Autor: Nicolas Matos";
        } else if (args[0].equals("--version")){
            resp = "Vesion: 1.0";
        } else if (args[0].equals("sqrt")){
            resp = java.lang.Math.sqrt(Double.parseDouble(args[1])) + "";
        } else if (args[0].equals("pow")){
            double x = Double.parseDouble(args[1]);
            double y = Double.parseDouble(args[2]);
            resp = java.lang.Math.pow (x, y) + "";
        } else if (args[0].equals("log10")){
            resp = java.lang.Math.log10(Double.parseDouble(args[1])) + "";
        } else if (args[0].equals("PI")){
            resp = java.lang.Math.PI + "";
        } else if (args[0].equals("e")){
            resp = java.lang.Math.E + "";
        } else if (args[0].equals("PHI")){
            resp = 1.618033988749895 + "";
        }
        System.out.println(resp);
    }
}

















// public class EXLocalizacao {
//     public static void main(String[] args) {
//         Locale.setDefault(new Locale("ar", "SA"));  
//         Double pi = 3.141592;
//         System.out.printf("Valor pi %f%n", pi);
//     }
// }

