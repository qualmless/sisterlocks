package org.launchcode.sisterlocksprofiles.models;

import org.springframework.stereotype.Controller;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.persistence.CascadeType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class ConsultantDetails extends AbstractEntity{

    private String name;
    private String contactEmail;
    private String streetAddress;
    private String city;
    private Integer zip;
    private Integer phone;
//    private USConstants usConstants;


    private Consultant consultant;

    public ConsultantDetails(@Size(max = 500, message = "Description too long!") String description,
                             @NotBlank(message = "Email is required")
                             @Email(message = "Invalid email. Try again.") String contactEmail,
                             String name,
                             String streetAddress,
                             String city,
                             Integer zip,
                             Integer phone
                             /*USConstants usConstants*/) {
        this.name = description;
        this.contactEmail = contactEmail;
        this.streetAddress=streetAddress;
        this.city=city;
        this.zip=zip;
        this.phone=phone;
//        this.usConstants = usConstants;
    }



    public String getName() {
        return name;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCity() {
        return city;
    }
//
//    public USConstants getUsConstants() {
//        return usConstants;
//    }

    public Integer getZip() {
        return zip;
    }

    public Consultant getConsultant() {
        return consultant;
    }

    public Integer getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return name;
    }

}
