package com.Car.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Car.Model.Car;
import com.Car.Service.CarService;

@RestController
public class CarController {
	@Autowired
	private CarService carService;
	
	@GetMapping("/cars")
	public ResponseEntity<List<Car>> getAllCars(){
		return ResponseEntity.ok().body(carService.getAllCars());
	}
	@GetMapping("/cars/{id}")
	public ResponseEntity<Car> getCarById(@PathVariable long id){
		return ResponseEntity.ok().body(carService.getCarById(id));
	}
	
	@PostMapping("/cars")
	public ResponseEntity<Car> createCar(@RequestBody Car car){
		return ResponseEntity.ok().body(this.carService.createCar(car));
	}
	@PutMapping("/cars/{id}")
	public ResponseEntity<Car> updateCar(@PathVariable long id,@RequestBody Car car){
		car.setId(id);
		return ResponseEntity.ok().body(this.carService.updateCar(car));
	}
	@DeleteMapping("/cars/{id}")
	public HttpStatus deleteCar(@PathVariable long id){
		this.carService.deleteCar(id);
		return HttpStatus.OK;
		
	}
	
}
