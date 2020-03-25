package ru.job4j.profession;

public class Doctor extends Profession{

    private String diagnose;
    private Boolean success;
    private Boolean checkGuess;
    private long numberOfDisease;
    private  Boolean anesthesia;

    public Boolean doAnesthesia(Pacient pacient){
        return anesthesia;
    }
    public Boolean treatPatient(Pacient pacient){
        return success;
    }
    public long questionPatient(Pacient pacient){
        return numberOfDisease;
    }
    public Boolean checkPatient(Pacient pacient){
        return checkGuess;
    }
    public long diagnose(Pacient pacient){
        return numberOfDisease;
    }

}
