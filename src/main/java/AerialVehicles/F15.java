package AerialVehicles;

import Entities.Coordinates;
import Missions.AttackMission;
import Missions.IntelligenceMission;
import Missions.Mission;
import Missions.MissionTypeException;


public class F15 extends AerialVehicle implements AerialAttackVehicle, AerialIntelligenceVehicle {
    int numberOfMissiles;
    String typeOfMissiles;
    public static final int maxHoursBetweenRepairFighter = 250;
    String sensorType;

    public String getTarget(){
        return ((AttackMission)mission).getTarget();
    }

    public String getRegion(){
        return ((IntelligenceMission)mission).getRegion();
    }



    public int getNumberOfMissiles() {
        return numberOfMissiles;
    }

    public void setNumberOfMissiles(int numberOfMissiles) {
        this.numberOfMissiles = numberOfMissiles;
    }

    public String getTypeOfMissiles() {
        return typeOfMissiles;
    }

    public void setTypeOfMissiles(String typeOfMissiles) {
        this.typeOfMissiles = typeOfMissiles;
    }

    public String getSensorType() {
        return sensorType;
    }

    public void setSensorType(String sensorType) {
        this.sensorType = sensorType;
    }






    public F15(String sensorType, int numberOfMissiles, String typeOfMissiles, String pilotName, Mission mission, int hoursOfFlightAfterRepair, boolean statusFlight) {
        super(pilotName, mission, statusFlight, hoursOfFlightAfterRepair);
        this.sensorType = sensorType;
        this.numberOfMissiles = numberOfMissiles;
        this.typeOfMissiles = typeOfMissiles;
    }

    public void flyTo() {
        System.out.println("flying to: " + mission.getCoordinates().getLongitude() + "," + mission.getCoordinates().getLatitude());
    }

    public void land() {
        System.out.println("Landing");
    }

    @Override
    public void repair() {
        hoursOfFlightAfterRepair = 0;
        statusFlight = true;
    }

    public void check() {
        if (hoursOfFlightAfterRepair > maxHoursBetweenRepairFighter) {
            repair();
        }

    }

    public String collectIntelligence() {
        String finalSentence = pilotName + ":" + " F15 Collecting Data in " + getRegion() + " with sensor type: " + sensorType;

        System.out.println(finalSentence);
        return finalSentence;
    }

    public String attack() {
        String finalSentence = pilotName + ":" + " F15 Attacking " + getTarget() + " with: " + typeOfMissiles + "X" + numberOfMissiles;
         System.out.println(finalSentence);
        return finalSentence;
    }


}
