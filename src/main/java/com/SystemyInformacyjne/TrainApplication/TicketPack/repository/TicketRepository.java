package com.SystemyInformacyjne.TrainApplication.TicketPack.repository;

import com.SystemyInformacyjne.TrainApplication.TicketPack.models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
