package model;
// Generated 24 Feb 2016 11:30:14 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Contact generated by hbm2java
 */
@Entity
@Table(name="contact"
    ,catalog="contactdb"
)
public class Contact  implements java.io.Serializable {


     private int contactId;
     private String name;
     private String email;
     private String address;
     private String telephone;

    public Contact() {
    }

    public Contact(int contactId, String name, String email, String address, String telephone) {
       this.contactId = contactId;
       this.name = name;
       this.email = email;
       this.address = address;
       this.telephone = telephone;
    }
   
     @Id 

    
    @Column(name="contact_id", unique=true, nullable=false)
    public int getContactId() {
        return this.contactId;
    }
    
    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    
    @Column(name="name", nullable=false, length=45)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="email", nullable=false, length=45)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    
    @Column(name="address", nullable=false, length=45)
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    
    @Column(name="telephone", nullable=false, length=45)
    public String getTelephone() {
        return this.telephone;
    }
    
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }




}


