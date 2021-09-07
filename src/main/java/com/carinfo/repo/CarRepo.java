package com.carinfo.repo;

import com.carinfo.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepo extends JpaRepository<Car, Long>{
}
