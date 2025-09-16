package exercicio02;

public class Main {
    public static void main(String[] args) {
        Animal a1 = AnimalFactory.criarAnimal("gato");
        a1.emitirSom();

        Animal a2 = AnimalFactory.criarAnimal("cachorro");
        a2.emitirSom();
    }
}
