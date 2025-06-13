package org.example.exo6;

import jakarta.enterprise.context.ApplicationScoped;
import org.example.exo6.model.Car;

import java.util.List;

@ApplicationScoped
public class CarService {

    public Car save(int id, String brand, String color, int yearOfManufacture) {
        return new Car(id, brand, color, yearOfManufacture);
    }

    public Car save() {
        return new Car();
    }


}
