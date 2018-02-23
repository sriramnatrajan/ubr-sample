package com.emergency.ambulence;


public class Accident {




    String accidentId;
    String people;
    String typeAccident;

   public Accident(){

    }
    public Accident(String accidentId, String people, String typeAccident) {
        this.accidentId = accidentId;
        this.people = people;
        this.typeAccident = typeAccident;
    }

    public String getAccidentId() {
        return accidentId;
    }

    public void setAccidentId(String accidentId) {
        this.accidentId = accidentId;
    }
    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people;
    }

    public String getTypeAccident() {
        return typeAccident;
    }

    public void setTypeAccident(String typeAccident) {
        this.typeAccident = typeAccident;
    }
}


