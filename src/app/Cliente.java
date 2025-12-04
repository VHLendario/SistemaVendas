package app;

public class Cliente implements imprimivel {
    private String cpf;
    private String nome;
    private String email; // corrigido para String

    public Cliente(String cpf, String nome, String email) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }
}
