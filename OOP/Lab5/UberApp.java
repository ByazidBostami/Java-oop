public class UberApp {
    public String name;
    public int age;
    public String phoneNumber;
    public int remainingRides;
    public String[] rideHistory;
    public int rideCount;
    public double lastFare;

    
    public UberApp() {
        this.name = "";
        this.age = 0;
        this.phoneNumber = "";
        this.remainingRides = 3;
        this.rideHistory = new String[3];
        this.rideCount = 0;
        this.lastFare = 0;
    }


    public void createProfile(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        System.out.println("Hello! This is your Profile:");
        System.out.println("Full Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
    }

  
    public void showProfile() {
        System.out.println("Hello! This is your Profile:");
        System.out.println("Full Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
    }

 
    public int remainingRides() {
        return remainingRides;
    }

    public void bookRide(String location, double distance) {
        if (remainingRides > 0) {
            double fare = 30 * distance;
            lastFare = fare;
            System.out.println(name + " has booked a ride!");
            System.out.println("Destination: " + location);
            System.out.println("Fare: " + fare + " Taka");
            rideHistory[rideCount] = location;
            rideCount++;
            remainingRides--;
        } else {
            System.out.println(name + ", please update your plan to premium or wait till next month!");
        }
    }


    public void changeLocation(String location, double distance) {
        if (rideCount > 0) {
            double fare = 30 * distance;
            fare += fare * 0.2;
            lastFare = fare;
            System.out.println(name + " has changed the destination of his current ride to " + location);
            System.out.println("New fare after adding 20% change fees: " + fare + " Taka.");
            rideHistory[rideCount - 1] = location;
        }
    }

    public void ridingHistory() {
        System.out.print(name + ", you have visited ");
        if (rideCount == 0) {
            System.out.println("nowhere this month.");
        } else {
            for (int i = 0; i < rideCount; i++) {
                if (i > 0) {
                    System.out.print(", ");
                }
                System.out.print(rideHistory[i]);
            }
            System.out.println(" this month.");
        }
    }


    public void resetMonth() {
        remainingRides = 3;
        rideHistory = new String[3];
        rideCount = 0;
    }
}
