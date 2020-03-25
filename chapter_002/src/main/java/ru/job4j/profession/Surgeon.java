package ru.job4j.profession;

public class Surgeon extends Doctor {
    private Boolean PacientCondition;

    public void makeIncision(Pacient pacient){
    }

    public void surgery(Pacient pacient){
    }

    public Boolean checkPatientCondition(Pacient pacient){
        return PacientCondition;
    }
}
