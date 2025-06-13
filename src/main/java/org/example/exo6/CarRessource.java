package org.example.exo6;


import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.example.exo6.model.Car;

@Path("/car")
public class CarRessource {

    private final CarService carService;

    @Inject
    public CarRessource(CarService carService) {
        this.carService = carService;
    }


    // Read
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Car getCar() {
        return new Car(1 , "Peugeot" , "rouge" , 2020);
    }

    // Create
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Car postCar(Car car) {
        car.setId(2);
    return car;
    }

    @POST
    @Path("/withService")
    @Produces(MediaType.APPLICATION_JSON)
    public Car postCarWithService() {
        return carService.save(3, "Toyota", "vert", 2021);
    }

    // Update
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Car putCar(Car car) {
        car.setColor("blanc");
        car.setBrand("Toyota");
        return car;
    }

    // Delete
    @DELETE
    @Path("/delete/{id}")
    public String delete(@PathParam("id") int id){
        return "Voiture a l'id : " + id + " a été supr";
    }



}




