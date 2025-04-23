package dev;

public class HumanWithTransport{
    private Transport transport;

    public HumanWithTransport(Transport transport){
        this.transport = transport;
    }

    public void MoveHuman(){
        System.out.println("I'm " + transport.move());
    }
}
