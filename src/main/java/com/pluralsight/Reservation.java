package com.pluralsight;

public class Reservation {
    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean weekend;
    private double reservationTotal;

    public Reservation(String roomType, boolean weekend, int numberOfNights) {
        this.roomType = roomType;
        this.weekend = weekend;
        this.numberOfNights = numberOfNights;

        //reservationTotal = price * numberOfNights;
        this.reservationTotal = this.price * numberOfNights;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
        if (roomType.equalsIgnoreCase("king")) {
            this.price = 139;
        }
        else if (roomType.equalsIgnoreCase("double")) {
            this.price = 124;
        }
    }

    public double getPrice() {

        if (weekend) {
            return price + (price * .10);
        }
        return price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }

    //public double getReservationTotal() {

     //   return reservationTotal;
   // }

   // public void setReservationTotal(double reservationTotal) {
   //     this.reservationTotal = reservationTotal;
   // }
}
