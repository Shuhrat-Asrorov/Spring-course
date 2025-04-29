package dev;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        HumanWithTransport humanWithTransport = context.getBean("humanWithTransportBean", HumanWithTransport.class);

        Moto moto = context.getBean("transportBean", Moto.class);

        context.close();
    }
}
