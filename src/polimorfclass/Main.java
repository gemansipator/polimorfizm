package polimorfclass;

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

        /*
        * При загрузке и инициализации объектов JVM строит таблицы в памяти, и в них связывает переменные
        *  с их значениями, а объекты — с их методами. Причем если объект наследуется или имплементирует интерфейс,
        *  в первую очередь проверяется наличие переопределенных методов в его классе. Если таковые есть,
        *  они привязываются к этому типу, если нет – ищется метод, определенный в классе на ступень выше
        * (в родителе) и так вплоть до корня при многоуровневой иерархии*/
    }
}