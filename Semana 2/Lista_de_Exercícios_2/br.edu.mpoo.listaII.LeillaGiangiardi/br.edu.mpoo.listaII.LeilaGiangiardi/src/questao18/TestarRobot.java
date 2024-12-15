package questao18;

public class TestarRobot {
    public static void main(String[] args) {
        Robot robot = new Robot("Robo1");
        System.out.println(robot.getStatus());

        robot.andar(5);
        System.out.println(robot.getStatus());

        robot.mudarDirecao("Leste");
        robot.andar(3);
        System.out.println(robot.getStatus());

        robot.transportar(10, 10);
        System.out.println(robot.getStatus());

        robot.retornaPosZero();
        System.out.println(robot.getStatus());
    }
}