package polimorfinterface;

public interface Swim { //Plavat'
    //void swim();
    default void swim() {
        System.out.println("Просто плыву");
    }
}
