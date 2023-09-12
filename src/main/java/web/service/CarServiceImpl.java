package web.service;

import org.springframework.stereotype.Component;
import web.DAO.CarDAO;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarServiceImpl implements CarService{


    private final CarDAO carDAO;

    public CarServiceImpl(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @Override
    public List<Car> getCars(int number) {
        if(number > carDAO.getAllCars().size()) {
            List<Car> newCars = new ArrayList<>();
            for(int a = 0; a < carDAO.getAllCars().size(); a++) {
                newCars.add(carDAO.getAllCars().get(a));
            }
            return newCars;
        }

        List<Car> newCars = new ArrayList<>();
        for(int a = 0; a < number; a++) {
            newCars.add(carDAO.getAllCars().get(a));
        }
        return newCars;
    }

    @Override
    public List<Car> getAllCars() {
        return carDAO.getAllCars();
    }
}
