package designPattern.creational.objectPool;

public class User implements Runnable {
    private String name;
    private static final int MAX_USING_TIME = 2000;
    TaxiPool taxiPool;
    private Taxi usingTaxi;

    @Override
    public void run() {
        this.useTaxiService();
    }

    public User(String name) {
        this.name = name;
        this.taxiPool = TaxiPool.getInstance();
    }

    public void useTaxiService() {
        try {
            this.usingTaxi = this.getTaxi();
            System.out.println(this.usingTaxi.getName() + " is using, user: " + this.name);
            try {
                Thread.sleep(randomUsingTime());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            this.freeTaxi();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Taxi getTaxi() throws TaxiNotFoundException {
        return this.taxiPool.getTaxi();
    }

    public void freeTaxi() {
        taxiPool.freeTaxi(usingTaxi);
    }

    private int randomUsingTime() {
        return (int) (Math.random() * MAX_USING_TIME);
    }
}
