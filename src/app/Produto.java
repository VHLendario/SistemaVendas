package app;

public class Produto implements imprimivel {
    private String codigo;
    private String nome;
    private Double precoUnitario;

    public Produto(String codigo, String nome, Double precoUnitario) {
        this.codigo = codigo;
        this.nome = nome;
        this.precoUnitario = precoUnitario;
    }
}
