package Smart_traffic_control_system;

public class StandardSignal extends TrafficSignal {
    public StandardSignal(String location) {
        super(location);
    }

    @Override
    public void changeSingle() {
        switch(getState()){
            case"RED":
                setState("GREEN");
            case "GREEN":
                setState("YELLOW");
            case "Yellow":
                setState("RED");
        }

    }
    @Override
    public void showStatus(){
        System.out.println("Standard signal at "+getLocation()+": "+getState());
    }
}
