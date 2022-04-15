package com.codewithmosh.state.exercise;

public class DirectionService {
    private TravelMode travelMode;

    public Object getEta() {
        return travelMode.getEta();
    }

    public Object getDirection() {
        return travelMode.getDirection();
    }

    public void setTravelMode(TravelMode travelMode) {
        this.travelMode = travelMode;
    }
}
