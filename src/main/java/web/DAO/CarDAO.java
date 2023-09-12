package web.DAO;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CarDAO {
    private List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car("type1", "model1", "Red"));
        cars.add(new Car("type2", "model2", "Black"));
        cars.add(new Car("type3", "model3", "White"));
        cars.add(new Car("type4", "model4", "Orange"));
        cars.add(new Car("type5", "model5", "Green"));
    }

    public List<Car> getAllCars() {
        return cars;
    }
}
