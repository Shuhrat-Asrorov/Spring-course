package dev;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        HumanWithTransport human = context.getBean("humanWithTransport", HumanWithTransport.class);
        human.moveHuman();

        context.close();
    }
}
