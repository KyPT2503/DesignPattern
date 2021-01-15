package designPattern.creational.objectPool;

import java.util.LinkedList;
import java.util.List;

public class TaxiPool {
    private static TaxiPool instance;
    private static int MAX_NUMBER_OF_TAXI = 5;
    private static int MIN_NUMBER_OF_TAXI = 2;
    private static int EXPIRED_TIME_IN_MILLISECOND = 1200;

    private List<Taxi> taxisFree = new LinkedList<>();
    private List<Taxi> taxisWorking = new LinkedList<>();

    private TaxiPool() {
        taxisFree.add(new Taxi("Taxi1"));
        taxisFree.add(new Taxi("Taxi2"));
    }

    public static TaxiPool getInstance() {
        if (instance == null) {
            synchronized (TaxiPool.class) {
                if (instance == null) {
                    instance = new TaxiPool();
                }
            }
        }
        return instance;
    }

    synchronized public Taxi getTaxi() throws TaxiNotFoundException {
        if (this.taxisFree.size() == 0 && this.taxisWorking.size() < MAX_NUMBER_OF_TAXI) {
            taxisFree.add(new Taxi("Taxi" + (this.taxisWorking.size() + this.taxisFree.size() + 1)));
            System.out.println(taxisFree.get(0).getName() + " is created.");
        }
        if (this.taxisFree.size() != 0) {
            taxisWorking.add(0, taxisFree.remove(0));
            return taxisWorking.get(0);
        }
        return this.waitTaxi();
    }

    public void freeTaxi(Taxi taxi) {
        this.taxisWorking.remove(taxi);
        this.taxisFree.add(taxi);
        System.out.println(taxi.getName() + " is free.");
    }

    private Taxi waitTaxi() {
        try {
            Taxi taxi;
            Thread.sleep(EXPIRED_TIME_IN_MILLISECOND);
            if (this.taxisFree.size() != 0) {
                taxi = this.taxisFree.remove(0);
                this.taxisWorking.add(0, taxi);
                return taxi;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        throw new TaxiNotFoundException();
    }
}
