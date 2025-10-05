package Smart_traffic_control_system;

public class PedestrianSignal extends TrafficSignal{
    public PedestrianSignal(String location){
        super(location);

    }
    @Override
    public void changeSingle(){
        if(getState().equals("RED")){
            setState("GREEN");
        }else{
            setState("RED");
        }

    }
    @Override
    public void showStatus(){
        System.out.println("Pedestrian signal at "+getLocation()+": "+getState());
    }

}
