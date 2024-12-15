package questao8;

public class MainComArgumentos {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Argumentos fornecidos:");
            for (String arg : args) {
                System.out.println(arg);
            }
        } else {
            System.out.println("Nenhum argumento foi fornecido.");
        }
    }
}