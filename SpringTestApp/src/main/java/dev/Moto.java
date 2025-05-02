package dev;

import org.springframework.stereotype.Component;

@Component
public class Moto implements Transport{
    @Override
    public String move(){
        return "move on Moto";
    }
}
