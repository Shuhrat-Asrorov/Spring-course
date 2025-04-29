package dev;

public class HumanWithTransport{
    private Transport transport;
    private int stamina;

    public void setTransport(Transport transport){
        this.transport = transport;
    }

    public void setStamina(int stamina){
        this.stamina = stamina;
    }

    public Transport getTransport() {
        return transport;
    }

    public int getStamina() {
        return stamina;
    }

    public HumanWithTransport(Transport transport){
        this.transport = transport;
    }
    public HumanWithTransport(){
    }

    public void MoveHuman(){
        System.out.println("I'm " + transport.move());
    }

    public void doMyInit(){
        System.out.println("Init from Human");
    }

}
