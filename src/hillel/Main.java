package hillel;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Sharick", 5);
        Dog dog2 = new Dog("Bobik", 3);
        Dog dog3 = new Dog("Muchtar", 12);
        Dog dog4= new Dog("Barbos", 8);

        System.out.println("-----------------Dogs------------------");

        dog.run(150);
        dog.swim(5);
        dog2.run(500);
        dog2.swim(8);
        dog3.run(200);
        dog3.swim(11);
        dog4.run(128);
        dog4.swim(3);

        System.out.println("----------------------Cats------------------");

        Cat cat = new Cat("Murzik", 12);
        Cat cat2 = new Cat("Barsik", 8);
        Cat cat3 = new Cat("Matroskin", 5);

        cat.run(100);
        cat.swim(10);
        cat2.run(220);
        cat2.swim(25);
        cat3.run(50);
        cat3.swim(11);

        System.out.println("---------------------Total-----------------------");

        System.out.println("There are " + Dog.totalDogs + " dogs.");
        System.out.println("There are " + Cat.totalCats + " cats.");
        System.out.println("There are " + Animal.total + " animals.");
    }
}
