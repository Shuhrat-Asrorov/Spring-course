package dev;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Transport{
    @Override
    public String move(){
        return "move on Bike";
    }
}
