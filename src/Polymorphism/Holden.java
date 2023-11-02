package Polymorphism;

public class Holden  extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }
    @Override
    public String startEngine() {
        super.startEngine();
        return getClass().getSimpleName() + " -> Engine starting";
    }

    @Override
    public String accelerate() {
        super.accelerate();
        return getClass().getSimpleName() + " -> Accelerating";
    }

    @Override
    public String brake() {
        super.brake();
        return getClass().getSimpleName() + " -> Braking";
    }
}
