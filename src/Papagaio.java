public class Papagaio implements Animal {
    public void andar(){
        System.out.println("Andando igual a um papagaio!");
    }

    public void emitirSom(){
        System.out.println("Som do papagaio falante...");
    }

    @Override
    public void comer() {
        System.out.println("Papagaio comendo sementes");
    }
}