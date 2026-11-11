package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    /*
    @Test
    public void accelerate_should_increaseCarSpeed() {
    // arrange
    // act
    // assert
    }
     */

    /*
    Create a RoomTest unit test class to test the methods of the Room class. Write tests
    for the following functions:
            checkIn() // room should be occupied and dirty
            checkOut()
            cleanRoom()
        How many tests should you write?
        Should you be able to check in a room, if it is already occupied?
        What if it is dirty?
        Should housekeeping be able to clean the room if it is occupied?
     */

    @Test
    public void testCheckIn_room_should_not_be_available() {
        // arrange
        Room room = new Room(10, 50.99, false, false);

        // act
        room.checkIn();

        // assert
        assertFalse(room.isAvailable());
    }
    @Test
    public void testCheckIn_isDirty() {
        // arrange
        Room room = new Room(10, 50.99, false, false);

        // act
        room.checkIn();

        // assert
        assertTrue(room.isDirty());
    }
    @Test
    public void testCheckOut_room_should_not_be_available() {
        // arrange
        Room room = new Room(10, 50.99, true, true);

        // act
        room.checkOut();

        // assert
        assertTrue(room.isAvailable()); //isAvailable()
    }
    @Test
    public void testCheckOut_isDirty() {
        // arrange
        Room room = new Room(10, 50.99, true, true);

        // act
        room.checkOut();

        // assert
        assertTrue(room.isDirty());
    }
    @Test
    public void testIsRoomClean() {
        // arrange
        Room room = new Room(10, 50.99, false, false);

        // act
        room.cleanRoom();

        // assert

        assertFalse(room.isDirty());
    }

}