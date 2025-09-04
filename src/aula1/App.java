public class App {
    public static void main(String[] args) throws Exception {
        Produto p1 = new Produto("Banana", 1, 0.80, 2332);
        System.out.println(p1.getNome());
        System.out.println(p1);

        Caixa c1 = new Caixa(p1);
        c1.fazCompra(50.0);
        System.out.println(c1);
        
    }
}
