package dev;

import org.springframework.stereotype.Component;

@Component
public class Car implements Transport{
    @Override
    public String move(){
        return "move in Car";
    }
}
