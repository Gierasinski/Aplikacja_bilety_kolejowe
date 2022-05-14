package com.SystemyInformacyjne.TrainApplication.RelationsTrain;

import javax.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
public class Connection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long Id;

/*
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(referencedColumnName = "Id")
    private Train train;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(referencedColumnName = "Id")
    private Stations idStationStarting;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(referencedColumnName = "Id")
    private Stations idStationFinal;
*/
    private int train_id;
    private int idStationStarting_id;
    private int idStationFinal_id;
    private String dataStarting;
    private String timeStarting;
    private String dataFinal;
    private String timeFinal;
    private float prize;







    public Connection(){

    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getTimeFinal() {
        return timeFinal;
    }

    public void setTimeFinal(String timeFinal) {
        this.timeFinal = timeFinal;
    }

    public float getPrize() {
        return prize;
    }

    public void setPrize(float prize) {
        this.prize = prize;
    }
/*
    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public Stations getIdStationStarting() {
        return idStationStarting;
    }

    public void setIdStationStarting(Stations idStationStarting) {
        this.idStationStarting = idStationStarting;
    }

    public Stations getIdStationFinal() {
        return idStationFinal;
    }

    public void setIdStationFinal(Stations idStationFinal) {
        this.idStationFinal = idStationFinal;
    }
*/
    public String getDataStarting() {
        return dataStarting;
    }

    public void setDataStarting(String dataStarting) {
        this.dataStarting = dataStarting;
    }

    public String getTimeStarting() {
        return timeStarting;
    }

    public void setTimeStarting(String timeStarting) {
        this.timeStarting = timeStarting;
    }

    public String getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(String dataFinal) {
        this.dataFinal = dataFinal;
    }

}
