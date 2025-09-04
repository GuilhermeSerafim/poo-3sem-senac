package aula2;

// Classe abstrata não pode ser instanciada
public abstract class Animal {
    private String nome;
    private String especie;

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    private double peso;
    private double valorCompra = 100;
    private double valorConsulta = 50;

    public double getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    public Animal(String especie, String nome, double peso) {
        this.nome = nome;
        this.especie = especie;
        this.peso = peso;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    private double valorExame = 50;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public double getValorExame() {
        return valorExame;
    }

    public void setValorExame(double valorExame) {
        this.valorExame = valorExame;
    }

    public abstract void fazBarulho();
}
