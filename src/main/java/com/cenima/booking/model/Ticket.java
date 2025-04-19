package com.cenima.booking.model;

public class Ticket {
    private String movieName;
    private Float price;
    private String cinemaHall;

    public Ticket() {
    }

    public Ticket(String movieName, Float price, String cinemaHall) {
        this.movieName = movieName;
        this.price = price;
        this.cinemaHall = cinemaHall;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getCinemaHall() {
        return cinemaHall;
    }

    public void setCinemaHall(String cinemaHall) {
        this.cinemaHall = cinemaHall;
    }
}

