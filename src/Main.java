import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Пример полиморфизма в Java и использования объектов в программе:

        Dancer dancer = new Dancer("Anton", 18);

        Dancer breakDanceDancer = new BreakDankDancer("Alex", 19); // восходящее преобразование к базовому типу
        Dancer electricBoogieDancer = new ElectricBoogieDancer("Igor", 20); // восходящее преобразование к базовому типу

        List<Dancer> discotheque = Arrays.asList(dancer,breakDanceDancer,electricBoogieDancer);
        for (Dancer d : discotheque){
            d.dance();// полиморфный вызов метода
        }

    }
}