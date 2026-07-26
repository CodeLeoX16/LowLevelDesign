package Transport;

import java.sql.SQLOutput;

public class MotorCycle extends Vehicle {
    public String handleBarStyle;
    public String suspensionType;


    MotorCycle(String name,String model,int noOfTyres,String handleBarStyle,String suspensionType){
        super(name,model,noOfTyres);
        this.handleBarStyle=handleBarStyle;
        this.suspensionType=suspensionType;
    }

    public void wheelie(){
        System.out.println("MotorCycle is doing Wheelieeeee!"+name);

    }

}
