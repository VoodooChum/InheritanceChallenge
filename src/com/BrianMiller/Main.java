package com.BrianMiller;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 10);
        Case theCase = new Case("220B", "Dell", "240", dimensions);
        Monitor theMonitor = new Monitor("27 inch Beast", "Acer", 27, new Resolution(2540, 1440));
        Motherboard theMotherboard = new Motherboard("BJ-200", "ASUS", 4, 6, "v2.44");

        PC myPC = new PC(theCase, theMonitor, theMotherboard);

        myPC.getMotherboard().loadProgram("Windows 1.0");
        myPC.getMonitor().drawPicxelAt(12, 34, "Blue");
    }

}
