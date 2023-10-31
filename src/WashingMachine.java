public class WashingMachine {
    // information hiding
    // hide data and implementation details from the user
    private String brand;
    private String modelno;
    private int capacity;
    private int time;
    private int power;
    private int height;
    private int width;
    private int depth;
    private boolean isOn;
    private boolean isStart;
    private int materialType;
    private int soilLevel;
    private int waterLevel;
    private boolean washType;
    private boolean spinType;
    private int optionType;

    // no-arg constructor
    WashingMachine() {
        System.out.println("A washing machine object is created.");
    }
    public void turnOn(){
        isOn = true;
        System.out.println("This washing machine is on");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("This washing machine is off");
    }

    public void pressStart() {
        isStart = true;
        System.out.println("The washing machine has started.");
    }

    public void pressPause() {
        isStart = false;
        System.out.println("We're pausing the washing machine.");
    }

    public boolean chooseProgram(int materialType) {
        this.materialType = materialType;
        if(this.materialType > 0 && this.materialType < 8) {
            switch (this.materialType) {
                case 1:
                    System.out.println("The material type is Hijab.");
                    break;
                case 2:
                    System.out.println("The material type is Batik.");
                    break;
                case 3:
                    System.out.println("The material type is Cottons.");
                    break;
                case 4:
                    System.out.println("The material type is Mixed.");
                    break;
                case 5:
                    System.out.println("The material type is Quick 20.");
                    break;
                case 6:
                    System.out.println("The material type is Bedding.");
                    break;
                case 7:
                    System.out.println("The material type is Wool/Handwash.");
                    break;
                default:
                    System.out.println("No material type is selected.");
            }
            return true;
        } else {
            return false;
        }
    }
}
