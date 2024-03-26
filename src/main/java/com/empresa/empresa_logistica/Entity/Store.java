package com.empresa.empresa_logistica.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String location;
    private int space;

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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSpace() {
        return space;
    }

    public void setSpace(int space) {
        this.space = space;
    }

    public List<GroundTransportation> getGroundTransportation() {
        return groundTransportation;
    }

    public void setGroundTransportations(List<GroundTransportation> groundTransportation) {
        this.groundTransportation = groundTransportation;
    }
    @OneToMany(mappedBy = "store", cascade = CascadeType.ALL)
    private List<GroundTransportation> groundTransportation;
}
