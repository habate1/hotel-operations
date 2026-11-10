package com.pluralsight;

public class Hotel {

    /*
    This class will allow you to create a simple hotel object and check if there are rooms
    available for the current day only. The hotel has 2 types of rooms a King Suite and a
    Basic Double room. Your Hotel class should track the name, numberOfSuites,
    numberOfRooms, bookedSuites and bookedBasicRooms. There should be
    no public setters for these variables
     */

    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;


    // hotel constructors
    public Hotel(String name, int numberOfSuites, int numberOfRooms){
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.numberOfSuites = 0;
        this.numberOfRooms = 0;
    }
    // hotel constructors
    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }
    public int getAvailableSuites() {
        return numberOfSuites - bookedSuites;
    }

    public int getAvailableRooms() {
        return numberOfRooms - bookedBasicRooms;
    }

    /*
    A user should be able to book one or more rooms (if they are available). The user will
    specify how many rooms they would like, and if it is a suite or a basic room.

    The bookRoom method should determine if there are enough rooms available and
    update the booked inventory if they are. The method should return true/false
    based on whether the rooms were able to be booked.
    The class should also include getAvailableSuites() and
    getAvailableRooms(). These are derived getters that SHOULD NOT have a
    private backing variable. Instead, these getters should calculate the response based on
    other member variables
     */
    public boolean bookRoom(int roomCount, boolean suite) {
        if (roomCount <= 0) {
            return false;
        }
        if (suite) {
            if (roomCount <= getAvailableSuites()) {
                bookedSuites += roomCount;
                return true;
            }
        } else {
            if (roomCount <= getAvailableRooms()) {
                bookedBasicRooms += roomCount;
                return true;
            }
        }

        return false;
    }


    public String getName() {
        return name;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

    public int getBookedBasicRooms() {
        return bookedBasicRooms;
    }
}
