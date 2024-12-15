package scr;

public class App {
    public static void main(String[] args) {
        Fruta melancia = new Melancia();
        Fruta abacate = new Abacate();

        System.out.println("Comendo melancia:");
        melancia.comerFruta();

        System.out.println("\nComendo abacate:");
        abacate.comerFruta();
    }
}