package com.epam.gourianova.service;


import com.epam.gourianova.exception.PlaneNotFoundException;
import com.epam.gourianova.model.Plane;
import com.epam.gourianova.repo.PlaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PlaneService {
 private final PlaneRepository planeRepository;

    @Autowired
    public PlaneService ( PlaneRepository planeRepository) {
        this.planeRepository = planeRepository;
    }

    public PlaneService () {

        planeRepository = null;
    }

    public Plane addPlane( Plane plane) {

        return planeRepository.save(plane);
    }

    public List<? extends Plane> findAllPlanes() {
        return planeRepository.findAll();
    }

    public Plane updatePlane(Plane plane) {
        return planeRepository.save(plane);
    }

    public Plane findPlaneById(Integer id) {
        return planeRepository.findPlaneById(id).
                orElseThrow(() -> new PlaneNotFoundException("Plane by id" + id + "not found"));

    }

    public void deletePlane(Integer id) {
        planeRepository.deletePlaneById(id);
    }


}


