import java.util.Date;

public class ProdutoPerecivel extends Produto {
    public ProdutoPerecivel(String nome, int quantidade, double precoUnitario, int codigoDeBarra, Date validade,
            int dia) {
        super(nome, quantidade, precoUnitario, codigoDeBarra);
        this.validade = validade;
        this.dia = dia;
    }

    private Date validade;
    private int dia;

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
}
