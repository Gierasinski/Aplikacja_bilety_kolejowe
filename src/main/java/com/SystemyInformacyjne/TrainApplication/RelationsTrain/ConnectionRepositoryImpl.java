package com.SystemyInformacyjne.TrainApplication.RelationsTrain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConnectionRepositoryImpl extends JpaRepository<Connection, Long> {

//    @Query("Select * from connection where data_starting = date and station_starting = from and station_final = to")
//    List<Connection> findAllByDateAndFromAndTo(String date, String from, String to);


}
