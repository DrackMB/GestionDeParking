package com.GestionDeParking.bean;

import java.io.Serializable;
import java.util.List;


public class Client implements Serializable {

    private static final long serialVersionUID = 1L;
   
    private Long id;
    private String numCIN;
    private String numMatricule;
    private String numTele;

    private List<Reservation> reservations;

    public String getNumCIN() {
        return this.numCIN;
    }

    public void setNumCIN(String numCIN) {
        this.numCIN = numCIN;
    }

    public String getNumMatricule() {
        return this.numMatricule;
    }

    public void setNumMatricule(String numMatricule) {
         this.numMatricule = numMatricule;
    }

    public String getNumTele() {
         return this.numTele;
    }

    public void setNumTele(String numTele) {
         this.numTele = numTele;
    }

    public List<Reservation> getReservations() {
        return this.reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
         this.id = id;
    }

    public int hashCode() {
         int hash = 0;
         hash += (this.id != null) ? this.id.hashCode() : 0;
         return hash;
    }

    public boolean equals(Object object) {
         if (!(object instanceof Client)) {
            return false;
        }
        Client other = (Client) object;
         if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
         return true;
    }

    @Override
    public String toString() {
         return "com.GestionDeParking.bean.Client[ id=" + this.id + " ]";
    }
}


