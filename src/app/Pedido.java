package app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido implements imprimivel {
    private Integer numero;
    private LocalDate data;
    private Cliente cliente;
    private List<item> listaItens;

    public Pedido(Integer numero, LocalDate data, Cliente cliente) {
        this.numero = numero;
        this.data = data;
        this.cliente = cliente;
        this.listaItens = new ArrayList<>();
    }

    //getter
    public Integer getNumero () {
        return numero;
    }
    public LocalDate getData () {
        return data;
    }
    public Cliente getCliente () {
        return cliente;
    }
    public List<item> getListaItens () {
        return listaItens;
    }

    //setter
    public void setNumero (Integer numero) {
        this.numero = numero;
    }
    public void setData (LocalDate data) {
        this.data = data;
    }
    public void setCliente (Cliente cliente) {
        this.cliente = cliente;
    }
    public void setListaItens (List<item> listaItens) {
        this.listaItens = listaItens;
    }

    @Override
    public String getCabecalho () {
        return "Numero | Data | Cliente | ListaItens";
    }

    @Override
    public String getDadosFormatados () {
        return String.format("%d | %d | %s | %d", numero, data, cliente, listaItens);
    }
}
