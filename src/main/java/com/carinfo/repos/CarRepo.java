package com.carinfo.repos;

import com.carinfo.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepo extends JpaRepository<Car, Long>{

}