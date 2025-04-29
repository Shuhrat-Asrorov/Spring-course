package dev;

public class Moto implements Transport{
    private Moto(){}

    public static Moto getMoto(){
        return new Moto();
    }

    @Override
    public String move(){
        return "driving at a speed of 80 km/h";
    }

    @Override
    public void doMyInit() {
        System.out.println("Bean created");
    }

    @Override
    public void doMyDestroy() throws InterruptedException{
        System.out.println("Bean destroying");
        Thread.sleep(1000);
    }
}
