import java.util.List;

public class Pedido {
    private List<Pizza> pizzas;
    private double valorTotal;
    private String tipoPagamento;

    public Pedido(List<Pizza> pizzas, double valorTotal, String tipoPagamento) {
        this.pizzas = pizzas;
        this.valorTotal = valorTotal;
        this.tipoPagamento = tipoPagamento;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }
}