package com.ecommerce.project.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "addresses")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;

    @NotBlank
    @Size(min = 5, message = "Street name must be of at least 5 characters")
    private String street;

    @NotBlank
    @Size(min = 5, message = "Building name must be of at least 5 characters")
    private String Building;

    @NotBlank
    @Size(min = 3, message = "City name must be of at least 3 characters")
    private String City;

    @NotBlank
    @Size(min = 2, message = "State name must be of at least 2 characters")
    private String State;

    @NotBlank
    @Size(min = 2, message = "Country name must be of at least 2 characters")
    private String Country;

    @NotBlank
    @Size(min = 6, message = "Pincode must be of at least 6 characters")
    private String pincode;

    @ToString.Exclude
    @ManyToMany(mappedBy = "addresses")
    private List<User> users = new ArrayList<>();

    public Address(String street, String building, String city, String state, String country, String pincode) {
        this.street = street;
        Building = building;
        City = city;
        State = state;
        Country = country;
        this.pincode = pincode;
    }

}
