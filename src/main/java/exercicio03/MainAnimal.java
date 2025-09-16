package exercicio03;

import exercicio02.Cachorro;
import exercicio02.Gato;

public class MainAnimal {
    public static void main(String[] args) {
        AnimalService service1 = new AnimalService(new Gato());
        service1.emitirSomDoAnimal();

        AnimalService service2 = new AnimalService(new Cachorro());
        service2.emitirSomDoAnimal();
    }
}
