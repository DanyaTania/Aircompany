package com.epam.gourianova.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
abstract public class Plane {
    @Id
    protected int id;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private String model;
    private int maxSpeed;
    private int maxFlightDistance;
    private int maxLoadCapacity;


    public Plane () {
    }


    public Plane ( int id ) {
        this.id = id;
    }

    public Plane ( String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity ) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.maxFlightDistance = maxFlightDistance;
        this.maxLoadCapacity = maxLoadCapacity;
    }

    public long getId () {
        return id;
    }

    public void setId ( int id ) {
        this.id = id;
    }

    public int getMaxLoadCapacity () {
        return maxLoadCapacity;
    }

    public void setMaxLoadCapacity ( int maxLoadCapacity ) {
        this.maxLoadCapacity = maxLoadCapacity;
    }

    public String getModel () {
        return model;
    }

    public void setModel ( String model ) {
        this.model = model;
    }

    public int getMaxSpeed () {
        return maxSpeed;
    }

    public void setMaxSpeed ( int maxSpeed ) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxFlightDistance () {
        return maxFlightDistance;
    }

    public void setMaxFlightDistance ( int maxFlightDistance ) {
        this.maxFlightDistance = maxFlightDistance;
    }

    public int getMinLoadCapacity () {
        int result = this.maxLoadCapacity;
        return result;
    }

    @Override
    public boolean equals ( Object o ) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plane plane = (Plane) o;
        return id == plane.id &&
                maxSpeed == plane.maxSpeed &&
                maxFlightDistance == plane.maxFlightDistance &&
                maxLoadCapacity == plane.maxLoadCapacity &&
                Objects.equals(model, plane.model);
    }

    @Override
    public String toString () {
        return "Plane{" +
                "id='" + id +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", maxFlightDistance=" + maxFlightDistance +
                ", maxLoadCapacity=" + maxLoadCapacity +
                '}';
    }

    @Override
    public int hashCode () {
        return Objects.hash(id);
    }

    public enum PlaneType {
        MILITARY,
        PASSENGER,
        EXPERIMENTAL
    }


}
