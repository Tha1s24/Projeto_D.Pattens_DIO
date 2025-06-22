public class CardapioSingleton {
    private static CardapioSingleton instancia;
    private List<Pizza> pizzas;

    private CardapioSingleton() {
        pizzas = List.of(
            new Pizza("Calabresa", 30.0),
            new Pizza("Marguerita", 28.0),
            new Pizza("Frango com Catupiry", 35.0),
            new Pizza("Portuguesa", 32.0),
            new Pizza("Quatro Queijos", 33.0)
        );
    }

    public static synchronized CardapioSingleton getInstance() {
        if (instancia == null) {
            instancia = new CardapioSingleton();
        }
        return instancia;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }
}
