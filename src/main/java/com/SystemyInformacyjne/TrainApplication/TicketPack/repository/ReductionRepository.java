package com.SystemyInformacyjne.TrainApplication.TicketPack.repository;

import com.SystemyInformacyjne.TrainApplication.TicketPack.models.Reduction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReductionRepository extends JpaRepository<Reduction, Long> {
}
