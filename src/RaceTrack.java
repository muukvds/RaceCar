public class RaceTrack {
    private RaceCar[] raceCars = new RaceCar[5];
    private RaceCar[] finishOrder = new RaceCar[5];
    private int distance;

    public void setDistance(int distance) {
        this.distance = distance;
    }


    public void addRaceCar(RaceCar raceCar) {
        for (int i = 0; i < raceCars.length; i++) {
            if (raceCars[i] == null) {
                raceCars[i] = raceCar;
            }
        }
    }

    public void doRace() {

    }
}
