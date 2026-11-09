package com.pluralsight;

public class HotelApp {
    public static void main(String[] args) {

        // test
        Room dirtyRoom = new Room(100, 500, false, true);

        if (dirtyRoom.isAvailable()) {
            System.out.println("the room is available");
        } else {
            System.out.println("the room is not availabl");
        }

    }

}
