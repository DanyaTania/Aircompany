package com.epam.gourianova.repo;

import com.epam.gourianova.model.Plane;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PlaneRepository extends JpaRepository<Plane,Integer> {

    void deletePlaneById(Integer id);

   Optional<Plane> findPlaneById(Integer id);



}

