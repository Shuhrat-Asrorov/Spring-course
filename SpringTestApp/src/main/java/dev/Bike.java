package dev;

public class Bike implements Transport{
    @Override
    public String move(){
        return "driving at a speed of 20 km/h";
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
