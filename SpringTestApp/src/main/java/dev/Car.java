package dev;

public class Car implements Transport{
    @Override
    public String move(){
        return "driving at a speed of 60 km/h";
    }
}
