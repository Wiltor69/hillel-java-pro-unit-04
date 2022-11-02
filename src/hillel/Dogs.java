package hillel;

public class Dogs extends Animals{
    public static int totalDogs;
    public Dogs(String name, int age) {
        super(name,age);
        totalDogs++;
    }

    @Override
    public void running(int metreDistance){
        if (metreDistance >= 500){
            System.out.println( "Dog can not running distance!");
        } else
       super.running(metreDistance);
    }
    public void swimming (int mileDistance){
        if (mileDistance >= 10){
            System.out.println("Dog can not swimming distance!");
        } else
            super.swimming(mileDistance);
    }
}
