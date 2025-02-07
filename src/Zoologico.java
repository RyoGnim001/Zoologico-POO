import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    private List<Animal> animais = new ArrayList<>();

    public void adicionar(Animal animal){
        animais.add(animal);
    }

    public void animarBicharada(){
        for (Animal animal : animais){
            animal.andar();
            animal.emitirSom();
        }
    }

    public void alimentarAnimais() {
        for (Animal animal : animais) {
            animal.comer();
        }
    }

    public void listarAnimais() {
        System.out.println("\nAnimais no zoológico:");
        for (Animal animal : animais) {
            System.out.println(animal.getClass().getSimpleName());
        }
    }

    public int totalAnimais() {
        return animais.size();
    }
}


