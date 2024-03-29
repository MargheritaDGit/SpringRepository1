package com.example.SpringRepo1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CarsRepository extends JpaRepository<Car, Long> {
}
