package com.company;

public class Apartment {
    String city;
    int rooms;
    int kvadratura;
    int price;
    String phonenumber;

    public Apartment(String city, int rooms, int kvadratura, int price, String phonenumber) {
        this.city = city;
        this.rooms = rooms;
        this.kvadratura = kvadratura;
        this.price = price;
        this.phonenumber = phonenumber;
    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public int getKvadratura() {
        return kvadratura;
    }

    public void setKvadratura(int kvadratura) {
        this.kvadratura = kvadratura;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
}
