package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Consultant extends AbstractEntity {

    @NotBlank(message = "Address required!")
    private String streetAddress;

    @NotBlank(message = "City required!")
    private String city;

    @ManyToOne
    @Size(min = 2, max = 2, message = "Use 2 letter standard abbreviation please!")
    @NotBlank(message = "State required!")
    private USConstants usConstants;

    @NotBlank(message = "Zip required!")
    private Integer zip;

    @NotBlank(message = "Phone required!")
    private Integer phone;

    public Consultant(String streetAddress, String city, Integer zip, Integer phone, USConstants usConstants) {
        super();
        this.streetAddress=streetAddress;
        this.city=city;
        this.zip=zip;
        this.phone=phone;
        this.usConstants = usConstants;
    }

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

    public USConstants getUsConstants() {
        return usConstants;
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

    public Consultant(){}
}
