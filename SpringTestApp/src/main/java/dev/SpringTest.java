package dev;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        Transport transport = context.getBean("transportBean", Transport.class);

        HumanWithTransport humanWithTransport = new HumanWithTransport(transport);

        humanWithTransport.MoveHuman();

        context.close();
    }
}
