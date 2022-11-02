package hillel;

public class Main {
    public static void main(String[] args) {
        Dogs dog = new Dogs("Sharick", 5);
        Dogs dog2 = new Dogs("Bobik", 3);
        Dogs dog3 = new Dogs("Muchtar", 12);
        Dogs dog4= new Dogs("Barbos", 8);

        System.out.println("-----------------Dogs------------------");

        dog.running(150);
        dog.swimming(5);
        dog2.running(500);
        dog2.swimming(8);
        dog3.running(200);
        dog3.swimming(11);
        dog4.running(128);
        dog4.swimming(3);

        System.out.println("----------------------Cats------------------");

        Cats cat = new Cats("Murzik", 12);
        Cats cat2 = new Cats("Barsik", 8);
        Cats cat3 = new Cats("Matroskin", 5);

        cat.running(100);
        cat.swimming(10);
        cat2.running(220);
        cat2.swimming(25);
        cat3.running(50);
        cat3.swimming(11);

        System.out.println("---------------------Total-----------------------");

        System.out.println("There are " + Dogs.totalDogs + " dogs.");
        System.out.println("There are " + Cats.totalCats + " cats.");
        System.out.println("There are " + Animals.total + " animals.");
    }
}
