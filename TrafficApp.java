package Smart_traffic_control_system;

import java.util.Scanner;

public class TrafficApp {
    private static SmartTrafficSystem system=new SmartTrafficSystem();
    private static Scanner input=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("🚦 Welcome to Smart Traffic Control System!");
        runMenu();
    }

    public static void runMenu(){
            int option;
            boolean cont=true;

            while(cont){
                System.out.println("\n--- Menu ---");
                System.out.println("1. Add Standard Signal");
                System.out.println("2. Add Pedestrian Signal");
                System.out.println("3. Show All Signals");
                System.out.println("4. Change All Signals");
                System.out.println("5. Test Smart_traffic_control_system.Car Movement");
                System.out.println("6. saveToFIle");
                System.out.println("0. Exit");
                System.out.print("Enter choice: ");
                option=Integer.parseInt(input.nextLine());

            switch(option) {
                case 0:
                    cont = false;
                    System.out.println("👋 Goodbye!");
                    break;
                case 1:
                    addStandardSignal();
                    break;
                case 2:
                    addPedestrianSignal();
                    break;
                case 3:
                    system.showAllSignals();
                    break;
                case 4:
                    system.changeAllSignals();
                    break;
                case 5:
                    testCarMovement();
                    break;
                case 6:
                    system.saveToFile();
                default:
                    System.out.println("Invalid choice.");

            }

            }
    }
    private static void addStandardSignal(){
        System.out.println("Enter Location: ");
        String location=input.nextLine();
        system.addSignal(new StandardSignal(location));

    }
    private static void addPedestrianSignal(){
        System.out.println("Enter pedestrian  Location: ");
        String location=input.nextLine();
        system.addSignal(new StandardSignal(location));

    }
    private static void testCarMovement(){
        System.out.println("Enter car license Plate: ");
        String plate=input.nextLine();
        Car car=new Car(plate);

        System.out.println("Enter single location: ");
        String location=input.nextLine();
        TrafficSignal signal=system.findbyTrafficID(location);

        if(signal !=null){
            car.move(signal);
        }else{
            System.out.println("X Signal not found.....");
        }

    }



}
