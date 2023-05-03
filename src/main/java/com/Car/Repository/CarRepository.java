package com.Car.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Car.Model.Car;

public interface CarRepository extends JpaRepository<Car,Long> {

}
