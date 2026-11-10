package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;
    private boolean available;

    // constructor
    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }

    public boolean isAvailable() {
        return !dirty && !occupied;
    }

    public void checkIn() {
        if (isAvailable()) {
            occupied = true;
            dirty = true;
        }

    }

    public void checkOut() {
        occupied = false;

    }

    public boolean cleanRoom() {
        if (!dirty) {
            return true;
        }
        return dirty;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }
}
