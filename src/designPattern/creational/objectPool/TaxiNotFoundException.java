package designPattern.creational.objectPool;

public class TaxiNotFoundException extends RuntimeException {
    private String message;

    public TaxiNotFoundException() {
        this.message = "Taxi not found Exception.";
    }

    public String getMessage() {
        return this.message;
    }
}
