public class Galinha implements Animal {
    public void andar(){
        System.out.println("Algoritmo que imita uma galinha andando....");
    }

    public void emitirSom(){
        System.out.println("Cocoricó....");
    }

    @Override
    public void comer() {
        System.out.println("Galinha bicando milho");
    }
}