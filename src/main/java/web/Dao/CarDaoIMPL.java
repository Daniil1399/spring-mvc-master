package web.Dao;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
public class CarDaoIMPL implements CarDao {

    private List<Car> cars = new ArrayList<>();

    {

    Car car1 = new Car("lada", "green", 100);
    Car car2 = new Car("nissan", "black", 250);
    Car car3 = new Car("lifan", "red", 180);
    Car car4 = new Car("suzuki", "white", 200);
    Car car5 = new Car("lada", "yellow", 180);

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
}



    @Override
    public List<Car> getAllCars() {
        return Collections.unmodifiableList(cars);
    }

    @Override
    public List<Car> getNumberOfCars(int number) {
        return Collections.unmodifiableList(cars.subList(0, number));
    }
}
