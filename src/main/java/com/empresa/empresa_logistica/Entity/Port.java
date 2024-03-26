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
public class Port {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String location;
    private int space;

    public Port (long l, String puerto1, String ubicacion1, int i) {
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

    public List<MarineTransport> getMarineTransport() {
        return marineTransport;
    }

    public void setMarineTransport(List<MarineTransport> marineTransport) {
        this.marineTransport = marineTransport;
    }

    @OneToMany(mappedBy = "port", cascade = CascadeType.ALL)
    private List<MarineTransport> marineTransport;

}
