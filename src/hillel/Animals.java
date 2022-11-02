package hillel;

public class Animals {
    public static int total;
    private String name;
    private int age;

    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
        total++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void running(int metreDistance){
        System.out.println(name + " can run distance " + metreDistance + " m");
    }
    public void swimming (int mileDistance){
        System.out.println(name + " can swimm distance " + mileDistance + " m");
    }
}
