package aula2;

public class Cachorro extends Animal {
    private double fatorPesoExame = 2;
    private double pesoReferencia = 20;
    private double adicionalCachorroPesado = 70;

    public Cachorro(String nome, int peso) {
        super("Cachorro", nome, peso);
    }

    public double getPesoReferencia() {
        return pesoReferencia;
    }

    public void setPesoReferencia(double pesoReferencia) {
        this.pesoReferencia = pesoReferencia;
    }

    public double getAdicionalCachorroPesado() {
        return adicionalCachorroPesado;
    }

    public void setAdicionalCachorroPesado(double adicionalCachorroPesado) {
        this.adicionalCachorroPesado = adicionalCachorroPesado;
    }

    public double getFatorPesoExame() {
        return fatorPesoExame;
    }

    public void setFatorPesoExame(double fatorPesoExame) {
        this.fatorPesoExame = fatorPesoExame;
    }

    @Override
    public void fazBarulho() {
        System.out.println("Auauauauauauau!");
    }

    // Cachorro pesado -> Valor consulta = Valor base + Adicional
    @Override 
    public double getValorConsulta() {
        if(getPeso() >= pesoReferencia) return super.getValorConsulta() + this.adicionalCachorroPesado;
        else return super.getValorConsulta();
     }

     @Override
     public double getValorExame() {
        return super.getValorExame() + this.fatorPesoExame * getPeso();
     }
}
