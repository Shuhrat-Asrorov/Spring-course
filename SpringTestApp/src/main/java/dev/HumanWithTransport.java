package dev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HumanWithTransport{
    private Car car;
    private Moto moto;
    @Autowired
    private Bike bike;

    @Autowired
    public void setMoto(Moto moto) {
        this.moto = moto;
    }


    @Autowired
    public HumanWithTransport(Car car){
        this.car = car;
    }

    public void moveHuman(){
        System.out.println("I " + bike.move());
        System.out.println("I " + car.move());
        System.out.println("I " + moto.move());
    }
}
