package com.SystemyInformacyjne.TrainApplication.RelationsTrain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Stations {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long Id;

    private String City;

    /*
    @OneToMany(cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="Id")


    private Set<Connection> connection;
 */
    public Stations(){

    }


    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }
}
