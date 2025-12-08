package app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import classe.Cliente;
import classe.Item;
import classe.Pedido;
import classe.Produto;
import relatorio.relatorio.Relatorio;

public class App {
    public static void main(String[] args) {
        Produto p1 = new Produto("001", "Mouse Gaymer", 15000.00);
        Produto p2 = new Produto("002", "Teclado Mecânico", 32000.00);

        List<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(p1);
        listaProdutos.add(p2);

        System.out.println("\n-------- RELATORIO DE PRODUTOS --------");
        Relatorio<Produto> relatorioProdutos = new Relatorio<>();
        relatorioProdutos.imprimirLog(listaProdutos);


        Cliente cliente = new Cliente("000.000.000-00", "Victor Hugo", "vitu@gmail.com");

        Pedido pedido = new Pedido(1, LocalDate.now(), cliente);

        Item item1 = new Item(2, p1);
        Item item2 = new Item(1, p2); 

        pedido.getListaItens().add(item1);
        pedido.getListaItens().add(item2);

  
        List<Pedido> listaPedidos = new ArrayList<>();
        listaPedidos.add(pedido);

        System.out.println("\n------ RELATORIO DE PEDIDOS ------");
        Relatorio<Pedido> relatorioPedidos = new Relatorio<>();
        relatorioPedidos.imprimirLog(listaPedidos);

       
        System.out.println("\nValor Total - Pedido: R$ " + calcularValorTotal(pedido));
    }


    private static double calcularValorTotal(Pedido pedido) {
        double total = 0;
        for (Item item : pedido.getListaItens()) {
            total += item.subTotal();
        }
        return total;
    }
}