public class Tiger extends Animal implements Walk{
    private int numbOfStripes;
    private int speed;
    private double roarSoundLevel;

    public Tiger(){
        super("Tiger");
    }

    public int getNumbOfStripes() {
        return numbOfStripes;
    }

    public void setNumbOfStripes(int numbOfStripes) {
        this.numbOfStripes = numbOfStripes;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getRoarSoundLevel() {
        return roarSoundLevel;
    }

    public void setRoarSoundLevel(double roarSoundLevel) {
        this.roarSoundLevel = roarSoundLevel;
    }


    @Override
    public void eatingCompleted() {

    }


    @Override
    public void walking() {
        System.out.println("Tiger: I am walking at the speed " + speed + " mph");
    }
}
