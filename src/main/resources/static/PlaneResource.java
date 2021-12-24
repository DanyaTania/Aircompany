package com.epam.gourianova.controller;

import com.epam.gourianova.model.Plane;
import com.epam.gourianova.service.PlaneService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/plane")
public class PlaneResource {
    private final PlaneService planeService;


    public PlaneResource ( PlaneService planeService) {
        this.planeService = planeService;
    }
@GetMapping("all")
    public ResponseEntity<List<? extends Plane>>getAllPlanes(){
        List<? extends Plane> planes=planeService.findAllPlanes();
        return new ResponseEntity<>(planes, HttpStatus.OK);
}

    @GetMapping("/find/{id}")
    public ResponseEntity<? extends Plane>getPlaneById(@PathVariable("id")Integer id){
        Plane plane=planeService.findPlaneById(id);
        return new ResponseEntity<>(plane, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<? extends Plane> addPlane(@RequestBody Plane plane){
        Plane newPlane=planeService.addPlane(plane);
        return new ResponseEntity<>(newPlane, HttpStatus.CREATED);
    }
    @PutMapping("/update")
    public ResponseEntity<? extends Plane> updatePlane(@RequestBody Plane plane){
        Plane updatePlane=planeService.updatePlane(plane);
        return new ResponseEntity<>(updatePlane, HttpStatus.OK);
    }
    @DeleteMapping("/delete{id}")
    public ResponseEntity<?> deletePlane(@PathVariable("id")Integer id){
       planeService.deletePlane(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
