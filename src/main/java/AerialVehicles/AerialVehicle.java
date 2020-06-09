package AerialVehicles;

import Entities.Coordinates;
import Missions.Mission;
import Missions.MissionTypeException;


public abstract class AerialVehicle {
    String pilotName;
    Mission mission;
    boolean statusFlight;
    int hoursOfFlightAfterRepair;

    public String getPilotName() {
        return pilotName;
    }

    public void setPilotName(String pilotName) {
        this.pilotName = pilotName;
    }

    public Mission getMission() {
        return mission;
    }

    public void setMission(Mission mission) {
        this.mission = mission;
    }

    public boolean isStatusFlight() {
        return statusFlight;
    }

    public void setStatusFlight(boolean statusFlight) {
        this.statusFlight = statusFlight;
    }

    public int getHoursOfFlightAfterRepair() {
        return hoursOfFlightAfterRepair;
    }

    public void setHoursOfFlightAfterRepair(int hoursOfFlightAfterRepair) {
        this.hoursOfFlightAfterRepair = hoursOfFlightAfterRepair;
    }



    public AerialVehicle(String pilotName, Mission mission, boolean statusFlight, int hoursOfFlightAfterRepair){
        this.pilotName = pilotName;
        this.mission = mission;
        this.statusFlight = statusFlight;
        this.hoursOfFlightAfterRepair = hoursOfFlightAfterRepair;
    }
    public abstract void repair();






}
