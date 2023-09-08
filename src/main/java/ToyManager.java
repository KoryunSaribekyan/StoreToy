import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ToyManager {
    private List<Toy> toys = new ArrayList<>();

    public void addToy(Toy toy) {
        toys.add(toy);
    }

    public Toy getPrizeToy() {
        int totalWeight = toys.stream().mapToInt(Toy::getWeight).sum();
        int randomValue = new Random().nextInt(totalWeight);
        int currentWeight = 0;

        for (Toy toy : toys) {
            currentWeight += toy.getWeight();
            if (randomValue < currentWeight && toy.getQuantity() > 0) {
                return toy;
            }
        }

        return null;
    }
}
