package aula2;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Cachorro("Snoop dog", 20);
        Animal animal2 = new Gato("Cato", 10);
        Clinica c = new Clinica();
        Animal[] animais =  {
            animal,
            animal2
        };
        c.fazOrcamento(animais, true);          
    }
}
