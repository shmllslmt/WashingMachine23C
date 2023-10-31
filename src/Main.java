public class Main {
    public static void main(String[] args) {
        WashingMachine machine = new WashingMachine();

        System.out.println(machine);

        machine.turnOn();
        machine.chooseProgram(3);
        machine.chooseWash(true);
        machine.chooseSpin(1);
        machine.chooseOption(1);
        machine.pressStart();
    }
}