package com.adilhassan.interfacecomparable.v4;

public class Address implements Comparable<Address> {
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
    public int compareTo(Address o) {
        // comparing by country first, then by city
        int countryComparison = this.country.compareTo(o.country);

        if (countryComparison == 0) {
            return this.city.compareTo(o.city);
        }

        return countryComparison;
    }

    @Override
    public String toString() {
        return "country='" + country + '\'' +
                ", city='" + city;
    }
}
