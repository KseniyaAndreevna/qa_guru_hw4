package guru.qa;

public class Cat {
    String name;

    int age;

    int weight;

    public int getWeight() {
        return weight;
    }

    void say() {
        System.out.println("My name is " + name + ", meow...");
    }

    void eat(Feed feed) {
        if (feed.typeOfFeed.equals("meat")) {
            System.out.println("I just ate a peace of " + feed);
            weight += 1;
        }
        else System.out.println("I dont want to eat " + feed + ". I am hungry!");
    }
}
