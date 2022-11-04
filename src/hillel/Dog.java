package hillel;

public class Dog extends Animal {
    public static int totalDogs;
    public Dog(String name, int age) {
        super(name,age);
        totalDogs++;
    }

    @Override
    public void run(int metreDistance){
        if (metreDistance >= 500){
            System.out.println( "Dog can not running distance!");
        } else
       super.run(metreDistance);
    }
    public void swim(int mileDistance){
        if (mileDistance >= 10){
            System.out.println("Dog can not swimming distance!");
        } else
            super.swim(mileDistance);
    }
}
