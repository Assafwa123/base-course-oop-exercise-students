package Missions;


import Entities.Coordinates;


public abstract class Mission{
    public Mission(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    private Coordinates coordinates;

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public void begin(){
        System.out.println("beginning mission!");
    }

    public void cancel(){
        System.out.println("abort mission!");
    }

    public void finish(){
        System.out.println("finish mission!");
    }


}
