package com.epam.gourianova.model;

import com.epam.gourianova.model.criteria.SearchCriteria.MilitaryTypes;

import java.util.Objects;

public class MilitaryPlane extends Plane {
    private MilitaryTypes type;



    public MilitaryPlane()
    {}

    public MilitaryPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, MilitaryTypes type) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        setType(type);
    }
    public void setType(MilitaryTypes type) {
        this.type = type;
    }


    public MilitaryTypes getType() {
        return type;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", type=" + type +
                        '}');
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MilitaryPlane)) return false;
        if (!super.equals(o)) return false;
        MilitaryPlane that = (MilitaryPlane) o;
        return type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type);
    }
}
