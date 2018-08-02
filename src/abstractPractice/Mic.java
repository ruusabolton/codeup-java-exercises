package abstractPractice;

public class Mic implements PowerControllable{

    @Override
    public void powerOn() {
        System.out.println("Mic power on");
    }
    @Override
    public void powerOff() {
        System.out.println("Mic power off");
    }


}
