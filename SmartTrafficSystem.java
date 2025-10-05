package Smart_traffic_control_system;

import java.util.ArrayList;

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
}
