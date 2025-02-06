public class Cachorro implements Animal {
    public void andar() {
        System.out.println("Cachorro andando igual a cachorro");
    }

    public void emitirSom() {
        System.out.println("Au, au! Au, au...");
    }

    @Override
    public void comer() {
        System.out.println("Cachorro comendo ração");
    }
}