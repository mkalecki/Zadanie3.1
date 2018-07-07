public class Televisor {
    String status;


    String turnOn () {
        status = "ON";
        return status;
    }

    String turnOff() {
        status = "OFF";
        return status;
    }

     void showStatus () {
        System.out.println("TV is " + status);
    }

}
