public class RaceTrack {
    private RaceCar[] raceCars = new RaceCar[5];
    private RaceCar[] finishOrder = new RaceCar[5];
    private int distance;

    public RaceTrack(int distance) {
        this.distance = distance;

        addRaceCar(new RaceCar(5, 120, "rubber bootje"));
        addRaceCar(new RaceCar(7, 120, "badeentje"));
        addRaceCar(new RaceCar(20, 120, "badkuip"));
        addRaceCar(new RaceCar(10, 120, "mona pudding"));
        addRaceCar(new RaceCar(2, 200, "slak"));
    }

    public void addRaceCar(RaceCar raceCar) {
        for (int i = 0; i < raceCars.length; i++) {
            if (raceCars[i] == null) {
                raceCars[i] = raceCar;
            }
        }
    }

    private void addfinishOrder(RaceCar raceCar) {
        for (int i = 0; i < finishOrder.length; i++) {
            if (finishOrder[i] == null) {
                finishOrder[i] = raceCar;
            }
        }
    }

    public void doRace() {
        boolean racing = true;
        int carfinisht = 0;
        while (racing) {
            for (RaceCar raceCar : raceCars) {
                raceCar.race();
                if (raceCar.getLocation() >= distance) {
                    addfinishOrder(raceCar);
                    carfinisht++;
                }

                if (carfinisht >= 5) {
                    racing = false;
                }
            }
        }
        printResult();
    }

    private void printResult()
    {
        for(int i =0;i< finishOrder.length;i++ )
        {
            System.out.println(i+1+": "+finishOrder[i].getName());
        }
    }
}
