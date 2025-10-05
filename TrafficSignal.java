package Smart_traffic_control_system;

public abstract class TrafficSignal {
    private String location;
    private String state;

    public TrafficSignal(String location){
        this.location=location;
        this.state="RED";

    }
    public String getLocation(){
        return location;
    }
    public String getState(){
        return state;
    }
    public void setState(String state){
        this.state=state;

    }
    public abstract void changeSingle();
    public abstract void showStatus();


}
