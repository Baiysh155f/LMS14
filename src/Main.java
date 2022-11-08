import java.util.SortedMap;
import java.util.SplittableRandom;

public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Baiysh","devoloper","Peacsoft");
        System.out.println(programmer);
        System.out.println(programmer.coding());
        programmer.learn();
        programmer.walk();
        programmer.eat();
        System.out.println("=================================");

        Dancer dancer=new Dancer("Pablo","dancer","BreakDance");
        System.out.println(dancer);
        System.out.println(dancer.dancing());
        dancer.learn();
        dancer.walk();
        dancer.eat();
        System.out.println(dancer.dancing());

        System.out.println("=================================");

        Singer singer = new Singer("Hozier","Take Me To Church","Hozier");
        System.out.println(singer);
        System.out.println(singer.singing());
        singer.learn();
        singer.walk();
        singer.eat();
        System.out.println(singer.playGitar());
    }
}