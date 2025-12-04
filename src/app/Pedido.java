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

    
}
