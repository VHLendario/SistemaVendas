package classe;

import contrato.Imprimivel;

public class Produto implements Imprimivel {
    private String codigo;
    private String nome;
    private Double precoUnitario;

    public Produto(String codigo, String nome, Double precoUnitario) {
        this.codigo = codigo;
        this.nome = nome;
        this.precoUnitario = precoUnitario;
    }

    //getter
    public String getCodigo () {
        return codigo;
    }
    public String getNome () {
        return nome;
    }
    public Double getPrecoUnitario () {
        return precoUnitario;
    }

    //setter
    public void setCodigo (String codigo) {
        this.codigo = codigo;
    }
    public void setNome (String nome) {
        this.nome = nome;
    }
    public void setPrecoUnitario (Double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    @Override
    //retorna as informações do produto
    public String getCabecalho() {
        return "Codigo | Nome | Preço Unitario";
    }
    
    @Override
    //retorna as informações formatadas
    public String getDadosFormatados () {
        return String.format("%s | %s | %.2f", codigo, nome, precoUnitario);
    }
}


