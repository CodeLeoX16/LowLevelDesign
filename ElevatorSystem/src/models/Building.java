package models;

import java.util.List;

public class Building {
    //singleton
    private List<Floor> floorList;
    private List<Elevator>elevatorList;

    private static Building buildingInstance=null;


    public static Building getBuildingInstance() {
        if(buildingInstance==null){
            buildingInstance =new Building();
        }
        return buildingInstance;
    }
}
