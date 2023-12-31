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
    private int spinType;
    private int optionType;

    // no-arg constructor
    WashingMachine() {
        brand = "Samsung";
        modelno = "WM-201";
        capacity = 5;
        time = 45;
        power = 50;
        height = 880;
        width = 530;
        depth = 530;

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

    public boolean chooseWash(boolean washType) {
        this.washType = washType;

        if(washType) {
            System.out.println("Quick Wash.");
        } else {
            System.out.println("Colour Wash.");
        }

        return washType;
    }
    public boolean chooseSpin(int spinType) {
        this.spinType = spinType;

        if(this.spinType > 0 && this.spinType < 6) {
            switch (this.spinType) {
                case 1:
                    System.out.println("The highest speed is selected.");
                    break;
                case 2:
                    System.out.println("The average speed is selected.");
                    break;
                case 3:
                    System.out.println("The low speed is selected.");
                    break;
                case 4:
                    System.out.println("No spin.");
                    break;
                case 5:
                    System.out.println("Rinse & hold.");
                    break;
                default:
                    System.out.println("No spin type is selected.");
            }
            return true;
        } else {
            return false;
        }
    }
    public boolean chooseOption(int optionType) {
        this.optionType = optionType;

        if(this.optionType > 0 && this.optionType < 6) {
            switch (this.optionType) {
                case 1:
                    System.out.println("Soak is selected.");
                    break;
                case 2:
                    System.out.println("Rinse is selected.");
                    break;
                case 3:
                    System.out.println("Soak & rinse is selected.");
                    break;
                case 4:
                    System.out.println("Rinse & spin is selected.");
                    break;
                case 5:
                    System.out.println("Drain & spin is selected.");
                    break;
                default:
                    System.out.println("No option type is selected.");
            }
            return true;
        } else {
            return false;
        }
    }
    public void addDelay(int time) {
        this.time += time;
    }

    public boolean save(boolean washType, int spinType, int optionType) {
        this.washType = washType;
        this.spinType = spinType;
        this.optionType = optionType;
        if((this.spinType > 0 && this.spinType < 6) || (this.optionType > 0 && this.optionType < 6)) {
            System.out.println("Wash Type: " + washType);
            System.out.println("Spin Type: " + spinType);
            System.out.println("Option Type: " + optionType);
            return true;
        } else {
            return false;
        }
    }

    public void lock() {
        System.out.println("You can't change the program option, wash option, spin option anymore!");
    }

    @Override
    public String toString() {
        return "WashingMachine {" +
                "brand='" + brand + '\'' +
                ", modelno='" + modelno + '\'' +
                ", capacity=" + capacity +
                ", time=" + time +
                ", power=" + power +
                ", height=" + height +
                ", width=" + width +
                ", depth=" + depth + "}";
    }
}
