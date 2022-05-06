package com.SystemyInformacyjne.TrainApplication.RelationsTrain;

import javax.persistence.*;

import java.util.Set;

@Entity
public class Connection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long Id;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(referencedColumnName = "Id")
    private Train train;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(referencedColumnName = "Id")
    private Stations idStationStarting;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(referencedColumnName = "Id")
    private Stations idStationFinal;



    public Connection(){

    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

}
