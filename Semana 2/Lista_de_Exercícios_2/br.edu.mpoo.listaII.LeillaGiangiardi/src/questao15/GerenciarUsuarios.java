package questao15;

public class GerenciarUsuarios {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("maria", "mariamaria", "166.728.840-76");
        Usuario usuario2 = new Usuario("jose", "JoSe", null);
        Usuario usuario3 = new Usuario("joao", "JoAo123", "123.456.789-00");

        System.out.println(usuario1);
        System.out.println(usuario2);
        System.out.println(usuario3);

        System.out.println("CPFs dos usuários:");
        System.out.println(usuario1.getCpf());
        System.out.println(usuario2.getCpf());
        System.out.println(usuario3.getCpf());
    }
}