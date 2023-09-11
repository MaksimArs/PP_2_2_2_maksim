package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarServiceImpl implements CarService{

    private List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car("type1", "model1", "Red"));
        cars.add(new Car("type2", "model2", "Black"));
        cars.add(new Car("type3", "model3", "White"));
        cars.add(new Car("type4", "model4", "Orange"));
        cars.add(new Car("type5", "model5", "Green"));
    }

    @Override
    public List<Car> getCars(int number) {
        if(number > cars.size()) {
            List<Car> newCars = new ArrayList<>();
            for(int a = 0; a < cars.size(); a++) {
                newCars.add(cars.get(a));
            }
            return newCars;
        }

        List<Car> newCars = new ArrayList<>();
        for(int a = 0; a < number; a++) {
            newCars.add(cars.get(a));
        }
        return newCars;
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }
}
