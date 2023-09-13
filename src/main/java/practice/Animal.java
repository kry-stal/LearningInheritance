package practice;

public class Animal {
    private static double gravityConstant = 10.00;
    private double weight;
    private double height;
    private String type;

    public Animal(double weight, double height, String type) {
        this.weight = weight;
        this.height = height;
        this.type = type;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public static double getGravityConstant() {
        return gravityConstant;
    }

    public double speed(){
        double animalSpeed = (weight* Animal.gravityConstant * height);
        return animalSpeed;
    }

    public void move(){
        speed();
        System.out.println(type + " is in motion at a speed of " + speed() + "mph");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "weight=" + weight +
                ", height=" + height +
                ", type='" + type + '\'' +
                '}';
    }
}
