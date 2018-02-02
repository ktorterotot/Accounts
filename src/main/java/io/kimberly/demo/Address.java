package io.kimberly.demo;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
@JsonIgnoreProperties(ignoreUnknown = true)

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    //@JsonProperty("street_number")
    public String street_number;
    //@JsonProperty("street_name")
    public String street_name;
    public String city;
    public String state;
    public String zip;


    public Address(){

    }

//    public Address(String streetNumber, String streetName, String city, String state, String zip) {
//        this.streetNumber = streetNumber;
//        this.streetName = streetName;
//        this.city = city;
//        this.state = state;
//        this.zip = zip;
//    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", street_number='" + street_number + '\'' +
                ", street_name='" + street_name + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }
}
