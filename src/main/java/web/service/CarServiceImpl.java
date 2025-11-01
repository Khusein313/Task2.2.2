package web.service;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.Arrays;
import java.util.List;

@Component
public class CarServiceImpl {
    List<Car> cars = Arrays.asList(new Car(1,"AUDI","New"),
            new Car(2,"BMW","Broken"),
            new Car(3,"Mercedes","good"),
            new Car(4,"HUMMER","good"),
            new Car(5,"Nissan","new"));

    public List<Car> someCar(int i) {
        if (i>=5 || i<1) {
            return cars;
        } else {
            return cars.subList(0,i);
        }
    }
}
