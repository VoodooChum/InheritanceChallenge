package com.BrianMiller;

public class RDX extends Car{
    private int roadServiceMonths;

    public RDX( int roadServiceMonths) {
        super("RDX", "SUV", 4, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }
}
