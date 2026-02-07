package br.com.santos.events_api.model;

import jakarta.persistence.*;

@Entity
@Table
public class Conference {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "id_conference", length = 100, nullable = false)
    private String  name;

    @Column(name = "name_conference", length = 255, nullable = false)
    private String  address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
}
