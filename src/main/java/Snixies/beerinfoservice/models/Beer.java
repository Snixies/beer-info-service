package Snixies.beerinfoservice.models;

public class Beer {

    private int beerId;
    private String name;

    public Beer(int beerId, String name) {
        this.beerId = beerId;
        this.name = name;
    }

    public int getBeerId() {
        return beerId;
    }

    public void setBeerId(int beerId) {
        this.beerId = beerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
