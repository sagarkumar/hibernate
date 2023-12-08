package com.sagarpr.lifecycle;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Computer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String computerName;

    private  String computerPrice;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getComputerName() {
        return computerName;
    }

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }

    public String getComputerPrice() {
        return computerPrice;
    }

    public void setComputerPrice(String computerPrice) {
        this.computerPrice = computerPrice;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", computerName='" + computerName + '\'' +
                ", computerPrice='" + computerPrice + '\'' +
                '}';
    }
}
