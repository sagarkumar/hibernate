package com.sagarpr.simplesave;

import jakarta.persistence.Embeddable;

@Embeddable
public class Organizer {

    private String organizerName;
    private String organizerAddress;

    public String getOrganizerName() {
        return organizerName;
    }

    public void setOrganizerName(String organizerName) {
        this.organizerName = organizerName;
    }

    public String getOrganizerAddress() {
        return organizerAddress;
    }

    public void setOrganizerAddress(String organizerAddress) {
        this.organizerAddress = organizerAddress;
    }
}
