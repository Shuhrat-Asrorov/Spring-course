package dev;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        HumanWithTransport human = context.getBean("humanWithTransport", HumanWithTransport.class);
        HumanWithTransport human1 = context.getBean("humanWithTransport", HumanWithTransport.class);
        human.moveHuman();

        human1.setAge(50);

        System.out.println(human.getAge());
        System.out.println(human1.getAge());


        context.close();
    }
}
