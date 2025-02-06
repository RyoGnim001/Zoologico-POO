public class Gato implements Animal {
    public void andar() {
        System.out.println("Andando igual a um gato");
    }

    public void emitirSom() {
        System.out.println("Miau, miau! Miau...");
    }

    @Override
    public void comer() {
        System.out.println("Gato comendo peixe");
    }
}