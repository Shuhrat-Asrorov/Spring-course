package dev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class HumanWithTransport{
    @Value("25")
    private int age;
    private Transport transport;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Autowired
    public HumanWithTransport(@Qualifier("car")Transport transport){
        this.transport = transport;
    }

    public void moveHuman(){
        System.out.println("I " + transport.move());
    }
    @PostConstruct
    public void initMethod() throws Exception{
        System.out.println("Human created...");
    }

    @PreDestroy
    public void destroyMethod(){
        System.out.println("Human deleted...");
    }
}
