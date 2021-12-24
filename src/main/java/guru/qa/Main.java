package guru.qa;

public class Main {
    public static void main(String... args) {
        Cat barsik = new Cat();

        barsik.name = "Barsik";

        barsik.age = 5;

        barsik.weight = 2;

        Feed carrot = new Feed("vegetable");

        Feed steak = new Feed("meat");

        barsik.say();

        barsik.eat(carrot);

        System.out.println("Weight is: " + barsik.getWeight());

        barsik.eat(steak);

        System.out.println("Weight is: " + barsik.getWeight());

        System.out.println("This cat is " + barsik.name +
                " of age " + barsik.age + " has weight " + barsik.weight);
    }
}
