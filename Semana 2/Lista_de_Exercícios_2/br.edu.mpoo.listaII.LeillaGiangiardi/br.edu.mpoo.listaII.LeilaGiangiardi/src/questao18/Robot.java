package questao18;

class Robot {
    private String nome;
    private int posX;
    private int posY;
    private String direcao;

    public Robot(String nome) {
        this(nome, 0, 0, "Norte");
    }

    public Robot(String nome, int posX, int posY, String direcao) {
        this.nome = nome;
        this.posX = posX;
        this.posY = posY;
        this.direcao = direcao;
    }

    public void andar(int passos) {
        switch (direcao) {
            case "Norte":
                posY += passos;
                break;
            case "Sul":
                posY -= passos;
                break;
            case "Leste":
                posX += passos;
                break;
            case "Oeste":
                posX -= passos;
                break;
        }
    }

    public void mudarDirecao(String novaDirecao) {
        this.direcao = novaDirecao;
    }

    public void transportar(int x, int y) {
        this.posX = x;
        this.posY = y;
    }

    public void retornaPosZero() {
        this.posX = 0;
        this.posY = 0;
        this.direcao = "Norte";
    }

    public String getStatus() {
        return "Robot{nome='" + nome + '\'' + ", posX=" + posX + ", posY=" + posY + ", direcao='" + direcao + '\'' + '}';
    }
}