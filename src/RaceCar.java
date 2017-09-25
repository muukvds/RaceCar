public class RaceCar {

    private int acceleration;
    private int speed = 0;
    private int maxSpeed;
    private int location = 0;
    private String name;
    private boolean finisht = false;

    public RaceCar(int acceleration, int maxSpeed, String name) {
        this.acceleration = acceleration;
        this.maxSpeed = maxSpeed;
        this.name = name;
    }

    public boolean isFinisht() {
        return finisht;
    }

    public void setFinisht(boolean finisht) {
        this.finisht = finisht;
    }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public void race() {

        if (speed < maxSpeed) {
            speed += acceleration;
            if (speed > maxSpeed) {
                speed = maxSpeed;
            }
        }

        location += speed;

    }

    public void brake() {
        speed = 0;

    }
}
