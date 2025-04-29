package dev;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        HumanWithTransport humanWithTransport = context.getBean("HumanWithTransportBean", HumanWithTransport.class);
        HumanWithTransport humanWithTransport1 = context.getBean("HumanWithTransportBean", HumanWithTransport.class);
        HumanWithTransport humanWithTransport2 = context.getBean("HumanWithTransportBean", HumanWithTransport.class);

        humanWithTransport.setStamina(100);
        humanWithTransport1.setStamina(100);
        humanWithTransport2.setStamina(100);

        System.out.println(humanWithTransport1);
        System.out.println(humanWithTransport2);
        System.out.println(humanWithTransport.equals(humanWithTransport1));

        System.out.println("Stamina: " + humanWithTransport.getStamina());
        System.out.println("Stamina: " + humanWithTransport1.getStamina());
        System.out.println("Stamina: " + humanWithTransport2.getStamina());

        context.close();
    }
}
