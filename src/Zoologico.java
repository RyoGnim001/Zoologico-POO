import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    private List<Animal> Animal = new ArrayList<>();

    public void adicionar(Animal animal){
        Animal.add(animal);
    }

    public void animarBicharada(){
        for (Animal animal : Animal){
            animal.andar();
            animal.emitirSom();
        }
    }

    public void alimentarAnimais() {
        for (Animal animal : Animal) {
            animal.comer();
        }
    }

    public void listarAnimais() {
        System.out.println("\nAnimais no zoológico:");
        for (Animal animal : Animal) {
            System.out.println(animal.getClass().getSimpleName());
        }
    }

    public int totalAnimais() {
        return Animal.size();
    }
}

