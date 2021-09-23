package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.Dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceIMPL implements CarService{

    private CarDao carDao;

    @Autowired
    public CarServiceIMPL(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getAllCars() {
        return carDao.getAllCars();
    }

    @Override
    public List<Car> getNumberOfCars(int number) {
        return carDao.getNumberOfCars(number);
    }
}
