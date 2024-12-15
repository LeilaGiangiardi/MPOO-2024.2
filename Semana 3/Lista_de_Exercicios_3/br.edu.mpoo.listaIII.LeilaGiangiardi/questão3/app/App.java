// Pacote: app
package app;

import pacoteA.Usuario; // Especificando qual classe usar

public class App {
    public static void main(String[] args) {
        Usuario usuarioA = new Usuario();
        pacoteB.Usuario usuarioB = new pacoteB.Usuario();

        usuarioA.exibir(); // Usuario do pacoteA
        usuarioB.exibir(); // Usuario do pacoteB
    }
}