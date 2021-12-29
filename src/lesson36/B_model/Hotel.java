package lesson36.B_model;

import lesson6_34.lesson28.Comparable.Capability;

import java.util.Objects;

public class Hotel implements Comparable<Hotel> {
    private long id;
    private String name;
    private String country;
    private String city;
    private String street;

    public Hotel(long id, String name, String country, String city, String street) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.city = city;
        this.street = street;
    }

    public Hotel(String name, String country, String city, String street) {
        this.name = name;
        this.country = country;
        this.city = city;
        this.street = street;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return id == hotel.id && name.equals(hotel.name) && country.equals(hotel.country) && city.equals(hotel.city) && street.equals(hotel.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, country, city, street);
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    @Override
    public String toString() {
        return id +"," + name +"," + country + "," + city + "," + street;
    }


    @Override
    public int compareTo(Hotel o) {
        return (int) (this.id-o.getId());
    }
}