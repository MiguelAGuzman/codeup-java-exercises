package enumerations;

public class Main {
    public static void main(String[] args) {
        makeDrivingDecision(TrafficLightColor.green);
        makeDrivingDecision(TrafficLightColor.yellow);
        makeDrivingDecision(TrafficLightColor.red);
    }

    public static void makeDrivingDecision(TrafficLightColor color) {
        switch (color) {
            case green:
                System.out.println("go");
            case yellow:
                System.out.println("go faster");
            case red:
                System.out.println("stop");
        }
    }
}
