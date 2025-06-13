package org.example.exo6;


import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.example.exo6.model.Car;

import java.util.ArrayList;
import java.util.List;

@Path("/car")
public class CarRessource {

    private  CarService carService;
    private List<Car> cars = new ArrayList<>();

    @Inject
    public CarRessource(CarService carService) {
        this.carService = carService;
    }



    // Create
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Car createCar(Car car) {
        cars.add(car);
        return car;
    }



    // Read
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Car> getCar() {
        return cars ;
    }


    // Create
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Car postCar(Car car) {
        car.setColor();
        car.setBrand();
        car.setYearOfManufacture();
        cars.add(car);
        return car;
    }

    @POST
    @Path("/withService")
    @Produces(MediaType.APPLICATION_JSON)
    public Car postCarWithService() {
        return carService.save();
    }

    // Update
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Car putCar(Car car) {
        car.setColor();
        car.setBrand();
        car.setYearOfManufacture();
        cars.add(car);
        return car;
    }

    // Delete
    @DELETE
    @Path("/delete/{id}")
    public String delete(@PathParam("id") int id){
        return "Voiture a l'id : " + id + " a été supr";
    }



}




