package com.Car.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Car.Exceptions.ResourceNotFoundException;
import com.Car.Model.Car;
import com.Car.Repository.CarRepository;

import jakarta.transaction.Transactional;
@Service
@Transactional
public class CarServiceImpl implements CarService{
	@Autowired
	private CarRepository carRepository;
	
	@Override
	public Car createCar(Car car) {
	
		return carRepository.save(car);
	}

	@Override
	public Car updateCar(Car car) {
		Optional<Car> cardb=this.carRepository.findById(car.getId());
		
		if(cardb.isPresent()) {
			Car carupdate=cardb.get();
			carupdate.setId(car.getId());
			carupdate.setName(car.getName());
			carRepository.save(carupdate);
			return carupdate;
		}
		else {
			throw new ResourceNotFoundException("Record not found with id:"+ car.getId());
		}
	}

	@Override
	public List<Car> getAllCars() {
		// TODO Auto-generated method stub
		return this.carRepository.findAll();
	}

	@Override
	public Car getCarById(long carid) {
		Optional<Car> cardb=this.carRepository.findById(carid);
		if(cardb.isPresent()) {
			return cardb.get();
		}
		else {
			throw new ResourceNotFoundException("Record not found with id:"+carid);
		}
	}

	@Override
	public void deleteCar(long id) {
		Optional<Car> cardb=this.carRepository.findById(id);
		if(cardb.isPresent()) {
			this.carRepository.delete(cardb.get());
		}
		else {
			throw new ResourceNotFoundException("Record not found with id:"+id);
		}
		
	}
	
}
