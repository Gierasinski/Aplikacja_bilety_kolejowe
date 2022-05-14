package com.SystemyInformacyjne.TrainApplication.RelationsTrain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ConnectionRepositoryImpl extends JpaRepository<Connection, Long> {

}
