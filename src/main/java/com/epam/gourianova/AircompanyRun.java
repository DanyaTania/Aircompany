package com.epam.gourianova;


import com.epam.gourianova.model.*;
import com.epam.gourianova.util.*;

import java.sql.SQLException;
import java.util.List;


public class AircompanyRun {
    AircompanyRun () {
        InitPlaneList planesList = new InitPlaneList();
        List<Plane> planes = planesList.getPlanes();
        Airport airport = new Airport(planes);
        Airport militaryAirport = new Airport(airport.getMilitaryPlanes());
        Airport passengerAirport = new Airport(airport.getPassengerPlanes());
        System.out.println("Military airport sorted by max distance: ");
        militaryAirport.print(militaryAirport.sortByMaxDistance().getMilitaryPlanes());
        System.out.println("Passenger airport sorted by max speed: ");
        passengerAirport.print(passengerAirport.sortByMaxSpeed().getPassengerPlanes());
        System.out.println("\nPlane with max passenger capacity: " + passengerAirport.getPassengerPlaneWithMaxPassengersCapacity() + '\n');
    }
}



