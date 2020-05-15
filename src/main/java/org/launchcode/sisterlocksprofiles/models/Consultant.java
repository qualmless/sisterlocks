package org.launchcode.sisterlocksprofiles.models;

import org.springframework.stereotype.Controller;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Consultant extends AbstractEntity {

    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "Address required!")
    private String streetAddress;

    @NotBlank(message = "City required!")
    private String city;

//    @ManyToOne
//    @Size(min = 2, max = 2, message = "Use 2 letter standard abbreviation please!")
//    @NotBlank(message = "State required!")
//    private USConstants usConstants;

    @NotBlank(message = "Zip required!")
    private Integer zip;

    @NotBlank(message = "Phone required!")
    private Integer phone;

    public Consultant(String name, String streetAddress, String city, Integer zip, Integer phone/*, USConstants usConstants*/) {
        super();
        this.name=name;
        this.streetAddress=streetAddress;
        this.city=city;
        this.zip=zip;
        this.phone=phone;
//        this.usConstants = usConstants;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCity() {
        return city;
    }

//    public USConstants getUSConstants() {
//        return usConstants;
//    }

    public Integer getZip() {
        return zip;
    }

    public Integer getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return name;
    }

    public Consultant(){}
}
