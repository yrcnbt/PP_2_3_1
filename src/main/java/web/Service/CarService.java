package web.Service;

import org.springframework.context.annotation.Bean;
import web.model.Car;

import java.util.List;
public interface CarService {


    public List<Car> getCar(Integer quantity);
}
