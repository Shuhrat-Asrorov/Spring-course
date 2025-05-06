package dev;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        HumanWithTransport human = context.getBean("humanWithTransport", HumanWithTransport.class);
        HumanWithTransport human1 = context.getBean("humanWithTransport", HumanWithTransport.class);
        human.moveHuman();

        human1.setAge(50);

        System.out.println(human.getAge());
        System.out.println(human.getName());
        System.out.println(human1.getAge());


        context.close();
    }
}