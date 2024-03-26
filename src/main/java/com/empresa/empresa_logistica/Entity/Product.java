package com.empresa.empresa_logistica.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String type;


    public Product (long l, String producto1, String description1, String type1) {
    }

    public Product (Long o, String producto1, String description1, String type1) {
    }


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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<GroundTransportation> getGroundTransportation() {
        return groundTransportation;
    }

    public void setGroundTransportation(List<GroundTransportation> groundTransportation) {
        this.groundTransportation = groundTransportation;
    }

    public List<MarineTransport> getMarineTransport() {
        return marineTransport;
    }

    public void setMarineTransport(List<MarineTransport> marineTransport) {
        this.marineTransport = marineTransport;
    }

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<GroundTransportation> groundTransportation;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<MarineTransport> marineTransport;
}
