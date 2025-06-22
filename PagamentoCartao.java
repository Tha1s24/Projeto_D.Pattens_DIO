public class PagamentoCartao implements PagamentoStrategy {
    @Override
    public String pagar(double valor) {
        return "Pagamento de R$" + valor + " realizado via Cartão.";
    }
}
