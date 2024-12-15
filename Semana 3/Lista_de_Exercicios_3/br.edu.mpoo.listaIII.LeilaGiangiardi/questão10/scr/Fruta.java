// Questão 10: Problema das frutas
package scr;

public abstract class Fruta {
    private boolean temCasca;
    private int qtdCarocos;

    public Fruta(boolean temCasca, int qtdCarocos) {
        this.temCasca = temCasca;
        this.qtdCarocos = qtdCarocos;
    }

    public void retirarCaroco() {
        if (qtdCarocos > 0) {
            qtdCarocos--;
            System.out.println("Caroco retirado. Restam: " + qtdCarocos);
        } else {
            System.out.println("Não há caroços para retirar.");
        }
    }

    public void retirarCasca() {
        if (temCasca) {
            temCasca = false;
            System.out.println("Casca retirada.");
        } else {
            System.out.println("A fruta não tem casca.");
        }
    }

    public void comerFruta() {
        retirarCasca();
        while (qtdCarocos > 0) {
            retirarCaroco();
        }
        System.out.println("Fruta comida!");
    }
}
