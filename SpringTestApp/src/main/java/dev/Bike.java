package dev;

public class Bike implements Transport{
    @Override
    public String move(){
        return "driving at a speed of 20 km/h";
    }
}
