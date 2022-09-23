package gb.example.javaee.lesson1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
        Reception reception = app.getBean("Reception", Reception.class);
        reception.directed();
    }
}
