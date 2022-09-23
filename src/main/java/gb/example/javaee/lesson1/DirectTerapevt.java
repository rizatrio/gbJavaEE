package gb.example.javaee.lesson1;

import org.springframework.stereotype.Component;

@Component("Direct")
public class DirectTerapevt implements Direct{
    @Override
    public void direct() {
        System.out.println("Направление к терапевту");
    }
}
