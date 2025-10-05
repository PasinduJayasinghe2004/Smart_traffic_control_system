package Smart_traffic_control_system;

public class Car {
    private String licensePlate;

    public Car(String licensePlate){
        this.licensePlate=licensePlate;

    }
    public void move(TrafficSignal signal){
        if(signal instanceof StandardSignal && signal.getState().equals("GREEN")){
            System.out.println("🚗 Smart_traffic_control_system.Car "+licensePlate+"is moving at "+signal.getLocation() );
        }else{
            System.out.println("🚗 Smart_traffic_control_system.Car "+licensePlate+"is stooped at "+signal.getLocation() );
        }
    }

}
