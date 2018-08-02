package abstractPractice;


public class Janitor implements PowerControllable {

    @Override
    public void powerOn() {
        System.out.println("Janitor power on");
    }
    @Override
    public void powerOff() {
        System.out.println("Janitor power off");
    }


}

