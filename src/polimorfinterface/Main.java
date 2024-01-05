package polimorfinterface;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Swim human = new Human("Antom", 6);
        Swim fish = new Fish("Kit");
        Swim boat = new UBoat(25);

        List<Swim> swimmers = Arrays.asList(human, fish, boat);
        for (Swim s : swimmers){
            s.swim();
        }
    }
}
