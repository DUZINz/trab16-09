package exercicio02;

public class AnimalFactory {
    public static Animal criarAnimal(String tipo) {
        switch (tipo.toLowerCase()) {
            case "gato":
                return new Gato();
            case "cachorro":
                return new Cachorro();
            default:
                throw new IllegalArgumentException("Tipo de animal inválido: " + tipo);
        }
    }
}
