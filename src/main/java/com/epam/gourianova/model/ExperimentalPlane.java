package com.epam.gourianova.model;

import com.epam.gourianova.model.criteria.SearchCriteria.ConfidenceLevel;
import com.epam.gourianova.model.criteria.SearchCriteria.ExperimentalTypes;


public class ExperimentalPlane extends Plane {
    private final ExperimentalTypes type;
    private ConfidenceLevel confidenceLevel;

    public ExperimentalPlane ( String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, ExperimentalTypes type, ConfidenceLevel confidencLevel ) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.type = type;
        setConfidenceLevel(confidenceLevel);
    }

    public ExperimentalTypes getType () {
        return type;
    }

    public ConfidenceLevel getConfidenceLevel () {
        return confidenceLevel;
    }

    public void setConfidenceLevel ( ConfidenceLevel confidenceLevel ) {
        this.confidenceLevel = confidenceLevel;
    }

    @Override
    public boolean equals ( Object o ) {
        return super.equals(o);
    }

    @Override
    public int hashCode () {
        return super.hashCode();
    }

    @Override
    public String toString () {
        return "ExperimentalPlane{" +
                "model='" + getModel() + '\'' +
                '}';
    }
}
