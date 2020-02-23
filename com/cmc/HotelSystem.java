package com.cmc;

public class HotelSystem {
    public static int k;
    public static int maxRoomNumber;
    public static int m;
    HotelSystem(int k, int m) {
        HotelSystem.maxRoomNumber = k;
        HotelSystem.k = k/5;
        HotelSystem.m = m;
    }
}
