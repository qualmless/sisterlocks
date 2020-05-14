package models;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class ConsultantDetails {

    private String consultantName;
    private String contactEmail;
    private String streetAddress;
    private String city;
    private Integer zip;
    private Integer phone;
    private USConstants usConstants;


    private Consultant consultant;

    public ConsultantDetails(@Size(max = 500, message = "Description too long!") String description,
                             @NotBlank(message = "Email is required")
                             @Email(message = "Invalid email. Try again.") String contactEmail,
                             String streetAddress,
                             String city,
                             Integer zip,
                             Integer phone,
                             USConstants usConstants) {
        this.consultantName = description;
        this.contactEmail = contactEmail;
        this.streetAddress=streetAddress;
        this.city=city;
        this.zip=zip;
        this.phone=phone;
        this.usConstants = usConstants;
    }



    public String getConsultantName() {
        return consultantName;
    }

    public void setConsultantName(String consultantName) {
        this.consultantName = consultantName;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
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

    public void setUsConstants(USConstants usConstants) {
        this.usConstants = usConstants;
    }

    public Integer getZip() {
        return zip;
    }

    public void setZip(Integer zip) {
        this.zip = zip;
    }

    public Consultant getConsultant() {
        return consultant;
    }

    public void setConsultant(Consultant consultant) {
        this.consultant = consultant;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }
}
