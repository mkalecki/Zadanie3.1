public class TvTest {
    public static void main(String[] args) {

        Televisor televisor = new Televisor();
        televisor.status = "OFF";

        televisor.showStatus();

        televisor.turnOn();
        televisor.showStatus();

        televisor.turnOff();
        televisor.showStatus();
    }
}
