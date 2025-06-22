@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

    @PostMapping
    public ResponseEntity<String> fazerPedido(@RequestBody PedidoDTO pedido) {
        PedidoFacade facade = new PedidoFacade();
        String resultado = facade.realizarPedido(pedido.sabores, pedido.tipoPagamento);
        return ResponseEntity.ok(resultado);
    }

    @GetMapping("/cardapio")
    public ResponseEntity<List<Pizza>> listarPizzas() {
        return ResponseEntity.ok(CardapioSingleton.getInstance().getPizzas());
    }
}
