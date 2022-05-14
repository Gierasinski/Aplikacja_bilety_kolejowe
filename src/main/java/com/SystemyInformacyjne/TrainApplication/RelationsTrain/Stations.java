package com.SystemyInformacyjne.TrainApplication.RelationsTrain;

import org.springframework.data.jpa.repository.Query;

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

    @Query(value = "Select City from stations, Connection where stations.id= 1? and connection.id_station_final_id = 1?")
    Stations findCity(Integer id) {
        return null;
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
