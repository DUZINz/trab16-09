package exercicio02;

// Interface Animal.java
public interface Animal {
    void emitirSom();
}

// Implementações
class Gato implements Animal {
    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }
}

class Cachorro implements Animal {
    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }
}
