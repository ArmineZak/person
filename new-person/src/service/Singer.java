package service;

public class Singer extends Person {
    private String bandName;

    public Singer(String name, String designation) {
        super(name, designation);
    }

    public Singer(String name, String designation, String bandname) {
        super(name, designation);
        this.bandName = bandname;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public String getBandName() {
        return this.bandName;
    }

    public void playGuitar() {
        System.out.println("I can play guitar.");
    }
}
