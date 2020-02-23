package com.cmc;
import static com.cmc.HotelSystem.k;
import static com.cmc.HotelSystem.maxRoomNumber;

public class Room {
    public enum RoomType {
        Suite(400, 1, k),
        JuniorSuite(200, k+1, 2*k),
        Single(70, 2*k+1, 3*k),
        Double(100, 3*k+1, 4*k ),
        DoubleWithExtraSpace(120, 4*k+1, maxRoomNumber);
        private final int price;
        private final int from;
        private final int to;
        RoomType(int price, int from, int to) {
            this.price = price;
            this.from = from;
            this.to = to;
        }
        int getPrice() {
            return price;
        }
        boolean check(int number) {
            return number > from && number < to;
        }
    }
    private RoomType type;
    private int roomNumber;
    private boolean isFree;
    private boolean isBooked;
    private Room(RoomType type, int roomNumber) {
        this.type = type;
        this.roomNumber = roomNumber;
    }
    int getPrice() {
        return type.getPrice();
    }
    int getRoomNumber() {
        return roomNumber;
    }
    Room createRoom(RoomType type, int roomNumber) throws ExceptionInInitializerError {
        if (!type.check(roomNumber)) {
            throw new IllegalArgumentException("there is no " + type.toString() + " with this number " + roomNumber);
        } else {
            return new Room(type, roomNumber);
        }
    }
    void book () throws Exception {
        if (isBooked) {
            throw new Exception("already booked");
        } else if (isFree) {
            throw new Exception("not free");
        } else {
            this.isBooked = true;
        }
    }
    void checkIn () throws Exception {
        if (isBooked) {
            throw new Exception("already booked");
        } else if (!isFree) {
            throw new Exception("not free");
        } else {
            this.isFree = false;
        }
    }
}
