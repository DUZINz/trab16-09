package exercicio02;

public class Cachorro extends Gato implements Animal {
    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }
}
