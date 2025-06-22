public class PedidoFacade {

    public String realizarPedido(List<String> sabores, String tipoPagamento) {
        List<Pizza> selecionadas = CardapioSingleton.getInstance()
                .getPizzas().stream()
                .filter(p -> sabores.contains(p.getNome()))
                .toList();

        double total = selecionadas.stream().mapToDouble(Pizza::getPreco).sum();

        PagamentoStrategy pagamento;
        if ("pix".equalsIgnoreCase(tipoPagamento)) {
            pagamento = new PagamentoPix();
        } else {
            pagamento = new PagamentoCartao();
        }

        return pagamento.pagar(total) + " Pedido: " + sabores;
    }
}
