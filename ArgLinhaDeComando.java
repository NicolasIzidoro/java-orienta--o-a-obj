public class ArgLinhaDeComando {
    public static void main(String[] args) {
        System.out.printf("qtd de Argumentos = %d%n", args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.printf("\targs[%d] = %s%n", i, args[i]);
        }
    }
}