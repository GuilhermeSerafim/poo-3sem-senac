package aula2;

public class Gato extends Animal {
    private double descontoExame = 20;
    
    public Gato(String nome, double peso) {
        super("Gato", nome, peso);
    }

    public double getDescontoExame() {
        return descontoExame;
    }

    public void setDescontoExame(double descontoExame) {
        this.descontoExame = descontoExame;
    }

    @Override
    public void fazBarulho() {
        System.out.println("MiauuuuuuupeloamordedeusMIAAAAUU");
    }

    @Override
    public double getValorExame() {
        return super.getValorExame() - this.descontoExame;
    }
}
