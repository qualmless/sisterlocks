package models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Loctitian extends AbstractEntity {

    @NotBlank(message = "Address required!")
    private String streetAddress;

    @NotBlank(message = "City required!")
    private String city;

    @Size(min = 2, max = 2, message = "Use 2 letter standard abbreviation please!")
    @NotBlank(message = "State required!")
    private String state;

    @NotBlank(message = "Zip required!")
    private Integer zip;

    @NotBlank(message = "Phone required!")
    private Integer phone;

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getZip() {
        return zip;
    }

    public void setZip(Integer zip) {
        this.zip = zip;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Loctitian(){}
}
