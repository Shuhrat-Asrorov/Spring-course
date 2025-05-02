package dev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HumanWithTransport{
    private Transport transport;

    @Autowired
    public HumanWithTransport(@Qualifier("car")Transport transport){
        this.transport = transport;
    }

    public void moveHuman(){
        System.out.println("I " + transport.move());
    }
}
