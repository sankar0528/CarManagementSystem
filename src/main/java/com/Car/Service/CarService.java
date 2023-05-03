package com.Car.Service;

import java.util.List;

import com.Car.Model.Car;

public interface CarService {
	Car createCar(Car car);
	Car updateCar(Car Car);
	List<Car> getAllCars();
	Car getCarById(long carid);
	void deleteCar(long id);
}
