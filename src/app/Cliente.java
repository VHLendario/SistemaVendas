package app;

public class Cliente implements Imprimivel {
    private String cpf;
    private String nome;
    private String email; // corrigido para String

    public Cliente(String cpf, String nome, String email) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    //getter
    public String getCPF () {
        return cpf;
    }
    public String getNome () {
        return nome;
    }
    public String getEmail () {
        return email;
    }

    //setter
    public void setCPF (String cpf) {
        this.cpf = cpf;
    }
    public void setNome (String nome) {
        this.nome = nome;
    }
    public void setEmail (String email) {
        this.email = email;
    }

    @Override
    public String getCabecalho () {
        return "CPF | Nome | Email";
    }
    @Override
    public String getDadosFormatados () {
        return String.format("%s | %s | %s", cpf, nome, email);
    }
}
