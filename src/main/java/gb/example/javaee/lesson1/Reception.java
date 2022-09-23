package gb.example.javaee.lesson1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Reception")
public class Reception {
    private Direct direct;

    public Direct getDirect() {
        return direct;
    }

    @Autowired
    @Qualifier("Direct")
    public void setDirect(Direct direct) {
        this.direct = direct;
    }

    public void directed() {
        System.out.println("Направление выдано");
        direct.direct();
    }
}
