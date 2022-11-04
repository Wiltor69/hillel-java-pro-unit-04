package hillel;

public class Cat extends Animal {
    public static int totalCats;

    public Cat(String name, int age) {
        super(name, age);
         totalCats++;
    }
    @Override
    public void run(int metreDistance){
        if (metreDistance >= 200){
            System.out.println( "Cat can not running distance!");
        } else
            super.run(metreDistance);
    }
    public void swim(int mileDistance){
        System.out.println("Cat can not swimming!");
    }
}
