public class Dolphin extends Animal implements Swim {
    private String dolphinColor;
    private int swimmingSpeed;

    public Dolphin(){
        super("Dolphin");
    }

    public String getDolphinColor() {
        return dolphinColor;
    }

    public void setDolphinColor(String dolphinColor) {
        this.dolphinColor = dolphinColor;
    }

    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public void eatingCompleted() {

    }

    @Override
    public void swimming() {
        System.out.println("Dolphin: I am swimming at the speed of " + swimmingSpeed + "nautical miles per hour");
    }
}
