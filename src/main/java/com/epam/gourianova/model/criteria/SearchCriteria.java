package com.epam.gourianova.model.criteria;

public final class SearchCriteria {



    private SearchCriteria() {
    }

     public static enum PassengerPlane {
        MODEL,
		MAX_SPEED,
		MAX_FLIGHT_DISTANCE,
		MAX_LOAD_CAPACITY,
		PASSENGERS_CAPACITY
    }

    public static enum MilitaryPlane {
        MODEL,
        MAX_SPEED,
        MAX_FLIGHT_DISTANCE,
        MAX_LOAD_CAPACITY
    }

	public static enum ExperimentalPlane {
		MODEL,
		MAX_SPEED,
		MAX_FLIGHT_DISTANCE,
		MAX_LOAD_CAPACITY
		}

	public enum ConfidenceLevel {
        UNCLASSIFIED, CONFIDENTIAL, SECRET, TOP_SECRET
    }

    public enum ExperimentalTypes {
        LIFTING_BODY, HYPERSONIC, HIGH_ALTITUDE, VTOL
    }


    public enum MilitaryTypes {
        FIGHTER, BOMBER, TRANSPORT
    }
}

