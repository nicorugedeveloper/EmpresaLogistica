package com.empresa.empresa_logistica.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Email;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private String phone;
    private String username;
    private String password;
    @Email
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<GroundTransportation> getGroundTransportation() {
        return groundTransportation;
    }

    public void setGroundTransportations(List<GroundTransportation> groundTransportation) {
        this.groundTransportation = groundTransportation;
    }

    public List<MarineTransport> getMarineTransport() {
        return marineTransport;
    }

    public void setMarineTransport(List<MarineTransport> marineTransport) {
        this.marineTransport = marineTransport;
    }



    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<GroundTransportation> groundTransportation;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<MarineTransport> marineTransport;



}
