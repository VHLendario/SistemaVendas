package app;

public class Cliente implements imprimivel {
    private Integer cpf;
    private String nome;
    private String email; // corrigido para String

    public Cliente(Integer cpf, String nome, String email) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    //getter
    public Integer getCPF () {
        return cpf;
    }
    public String getNome () {
        return nome;
    }
    public String getEmail () {
        return email;
    }

    //setter
    public void setCPF (Integer cpf) {
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
        return String.format("%d | %s | %s", cpf, nome, email);
    }
}
