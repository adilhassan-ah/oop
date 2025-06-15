package com.adilhassan.interfacecloneable.v2;

public class Address implements Cloneable {
    private String country;
    private String city;

    public Address(String country, String city) {
        this.country = country;
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    @Override
    public String toString() {
        return "country='" + country + '\'' +
                ", city='" + city;
    }

    @Override
    protected Object clone() {
        return new Address(this.country, this.city);
    }
}
