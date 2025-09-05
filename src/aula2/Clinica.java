package aula2;

public class Clinica {

    public void fazOrcamento(Animal animal, boolean temExame) {
        System.out.println("############");
        System.out.println("Orçamento: " + animal.getNome());
        System.out.println("Espécie: " + animal.getEspecie());
        int valorTotal = 0;

        double valorConsulta = animal.getValorConsulta();
        System.out.println("Consulta: R$ " + valorConsulta);
        valorTotal += valorConsulta;

        if (temExame) {
            double valorDoExame = animal.getValorExame();
            System.out.println("Exame: R$" + valorDoExame);
            valorTotal += valorDoExame;
        }
    }

    public void fazOrcamento(Animal animal) {
        fazOrcamento(animal, false);
    }

    public void fazOrcamento(Animal[] animais, boolean temExame) {
        for (Animal animal : animais) {
            fazOrcamento(animal, temExame);
        }
    }

    public void fazOrcamento(Animal[] animais) {
        for (Animal animal : animais) {
            fazOrcamento(animal, false);
        }
    }

}
