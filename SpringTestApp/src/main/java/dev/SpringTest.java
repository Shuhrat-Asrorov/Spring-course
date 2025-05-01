package dev;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        HumanWithTransport humanWithTransport = context.getBean("humanWithTransport", HumanWithTransport.class);

        Transport transport = context.getBean("bike", Transport.class);

        humanWithTransport.setStamina(100);
        humanWithTransport.setTransport(transport);

        humanWithTransport.moveHuman();
        System.out.println(humanWithTransport.getStamina());

        context.close();
    }
}
