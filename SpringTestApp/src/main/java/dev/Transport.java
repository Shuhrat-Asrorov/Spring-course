package dev;

public interface Transport {
    public String move();
    public void doMyInit();
    public void doMyDestroy() throws InterruptedException;
}
