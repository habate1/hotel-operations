package com.pluralsight;

public class HotelApp {
    public static void main(String[] args) {

        // create simple hotel object
        Hotel hotel = new Hotel("name", 100, 100);

        // test
        Room dirtyRoom = new Room(100, 500, false, true);

        if (dirtyRoom.isAvailable()) {
            System.out.println("the room is available");
        } else {
            System.out.println("the room is not available");
        }


    }

}
