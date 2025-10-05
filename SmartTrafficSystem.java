package Smart_traffic_control_system;

import java.io.IOException;
import java.util.ArrayList;
import java.io.FileWriter;

public class SmartTrafficSystem {
    private ArrayList<TrafficSignal> signals=new ArrayList<>();


    public void addSignal(TrafficSignal signal){
        signals.add(signal);
        System.out.println(" Add signal at "+signal.getLocation());
    }
    public void showAllSignals(){
        for(TrafficSignal t:signals){
            t.showStatus();
        }
    }
    public void changeAllSignals(){
        for(TrafficSignal t:signals){
            t.changeSingle();
        }
        System.out.println("All signals Change.");
    }
    public TrafficSignal findbyTrafficID(String location){
        for(TrafficSignal t:signals){
            if(t.getLocation().equalsIgnoreCase(location))return t;

        }
        return null;
    }
    public void saveToFile(){
        if(signals.isEmpty()){
            System.out.println("No signals found to save.");
            return;
        }


        try(FileWriter file=new FileWriter("Traffic_management.txt")){
            file.write("........Smart_Traffic_System..........."+"\n");
            for(TrafficSignal t:signals){
                if(t instanceof StandardSignal){
                    file.write("Standard: "+t.getLocation()+"\n"+"State:"+t.getState()+"\n");
                } else if (t instanceof PedestrianSignal) {
                    file.write("Pedestrian location: "+t.getLocation()+"\n"+"State: "+"\n");
                }

            }
            System.out.println("All the details are saved.....");
        }catch(IOException e){
            System.out.println("xxxError Occurred......");
        }
    }
}
