package com.SystemyInformacyjne.TrainApplication.repository;

import com.SystemyInformacyjne.TrainApplication.models.Connection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConnectionRepository extends JpaRepository<Connection, Long> {

//    @Query("Select * from connection where data_starting = date and station_starting = from and station_final = to")
//    List<Connection> findAllByDateAndFromAndTo(String date, String from, String to);


}
