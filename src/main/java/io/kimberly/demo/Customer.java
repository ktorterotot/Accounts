package io.kimberly.demo;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Set;


@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class Customer{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   // @JsonProperty("customer_id")
    public Long customer_Id;
    //@JsonProperty("first_name")
    public String first_name;
    //@JsonProperty("last_name")
    public  String last_name;
    @OneToMany(cascade = CascadeType.ALL)
    public Set<Address> address;


    public Customer(){

    }

//    public Customer(String firstName, String lastName, Set<Address> address) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.address = address;
//    }

    @Override
    public String toString() {
        return "Customer{" +
                "customer_Id" + customer_Id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", address=" + address +
                '}';
    }
}









