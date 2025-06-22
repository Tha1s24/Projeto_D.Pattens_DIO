public class Pizza {
    private String nome;
    private double preco;

    public Pizza(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return nome + " - R$" + preco;
    }
}

List<Pizza> pizzas = List.of(
    new Pizza("Calabresa", 30.0),
    new Pizza("Marguerita", 28.0),
    new Pizza("Frango com Catupiry", 35.0),
    new Pizza("Portuguesa", 32.0),
    new Pizza("Quatro Queijos", 33.0)
);
