public class Caixa {

    private Produto produto;

    public Caixa(Produto produto) {
    }

    public void fazCompra(double valor) {
        System.out.println("########");
        if (valor < produto.getPreco()) {
            System.out.println("Valor insuficiente.");
        } else {
            produto.fazCompra();
            double troco = valor - produto.getPreco();
            System.out.println("Troco: R$: " + troco);
        }
    }

    @Override
    public String toString() {
        return "Caixa [produto=" + produto.toString() + "]";
    }

}
