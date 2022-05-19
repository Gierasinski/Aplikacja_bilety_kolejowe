package com.SystemyInformacyjne.TrainApplication.models;

import com.SystemyInformacyjne.TrainApplication.models.Payment;
import com.SystemyInformacyjne.TrainApplication.models.Reduction;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tickets")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private int polaczenie;
    @NotBlank
    private int konto;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(	name = "ticket_payment",
            joinColumns = @JoinColumn(name = "ticket_id"),
            inverseJoinColumns = @JoinColumn(name = "payment_id"))
    private Set<Payment> payments = new HashSet<>();

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(	name = "ticket_reduction",
            joinColumns = @JoinColumn(name = "ticket_id"),
            inverseJoinColumns = @JoinColumn(name = "reduction_id"))
    private Set<Reduction> reductions = new HashSet<>();

    @NotBlank
    private String dates;
    @NotBlank
    private int site;

    public Ticket(){

    }

    public Ticket(Long id, int polaczenie, int konto, String dates, int site) {
        this.id = id;
        this.polaczenie = polaczenie;
        this.konto = konto;
        this.dates = dates;
        this.site = site;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getPolaczenie() {
        return polaczenie;
    }

    public void setPolaczenie(int polaczenie) {
        this.polaczenie = polaczenie;
    }

    public int getKonto() {
        return konto;
    }

    public void setKonto(int konto) {
        this.konto = konto;
    }

    public Set<Payment> getPayments() {
        return payments;
    }

    public void setPayments(Set<Payment> payments) {
        this.payments = payments;
    }

    public Set<Reduction> getReductions() {
        return reductions;
    }

    public void setReductions(Set<Reduction> reductions) {
        this.reductions = reductions;
    }

    public String getDates() {
        return dates;
    }

    public void setDates(String dates) {
        this.dates = dates;
    }

    public int getSite() {
        return site;
    }

    public void setSite(int site) {
        this.site = site;
    }
}
