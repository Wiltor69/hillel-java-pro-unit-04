package hillel;

public class Cats extends Animals{
    public static int totalCats;

    public Cats(String name, int age) {
        super(name, age);
         totalCats++;
    }
    @Override
    public void running(int metreDistance){
        if (metreDistance >= 200){
            System.out.println( "Cat can not running distance!");
        } else
            super.running(metreDistance);
    }
    public void swimming (int mileDistance){
        System.out.println("Cat can not swimming!");
    }
}
