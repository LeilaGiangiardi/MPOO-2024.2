// Questão 9.2: GarbageCollectorExample
package scr;

public class GarbageCollectorExample {
    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            new String("Objeto " + i);
        }
        System.gc();
        System.out.println("Garbage Collector solicitado!");
    }
}