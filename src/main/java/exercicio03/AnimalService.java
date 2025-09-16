package exercicio03;

import exercicio02.Animal;
import exercicio02.Cachorro;
import exercicio02.Gato;

public class AnimalService {
    private Animal animal;

    public AnimalService(Animal animal) {
        this.animal = animal;
    }

    public void emitirSomDoAnimal() {
        animal.emitirSom();
    }
}
