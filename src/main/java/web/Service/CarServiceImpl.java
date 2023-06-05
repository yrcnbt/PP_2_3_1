package web.Service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {

    private List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car("Hyndai", "Solaris", "Sedan"));
        cars.add(new Car("Volkswagen", "Tiguan", "SUV"));
        cars.add(new Car("Volkswagen", "Polo", "Sedan"));
        cars.add(new Car("Renault", "Logan", "Sedan"));
        cars.add(new Car("Skoda", "Octavia", "Combi"));
    }

    @Override
    public List<Car> getCar(Integer quantity){
        if(quantity != null) {
            return cars.stream().limit(quantity).toList();
        } else{
            return cars;
        }
    }
}
