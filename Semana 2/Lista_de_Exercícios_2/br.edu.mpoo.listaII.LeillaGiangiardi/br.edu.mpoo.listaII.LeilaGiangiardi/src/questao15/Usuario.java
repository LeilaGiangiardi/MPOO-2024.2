package questao15;

class Usuario {
    private static int contadorId = 0;
    private int id;
    private String login;
    private String senha;
    private String cpf;

    public Usuario(String login, String senha, String cpf) {
        this.id = ++contadorId;
        this.login = login;
        this.senha = senha;
        this.cpf = validarCpf(cpf) ? cpf : null;
    }

    private boolean validarCpf(String cpf) {
        // Simplificação: aqui deveria haver uma validação real de CPF
        return cpf != null && cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}");
    }

    public int getId() {
        return id;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Usuario{id=" + id + ", login='" + login + '\'' + ", cpf='" + cpf + '\'' + '}';
    }
}