public class PagamentoPix implements PagamentoStrategy {
    @Override
    public String pagar(double valor) {
        return "Pagamento de R$" + valor + " realizado via Pix.";
    }
}
