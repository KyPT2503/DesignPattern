package designPattern.behavior.template;

public class Cookies extends Product {
    @Override
    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public void setPricePerOne(int pricePerOne) {
        this.pricePerOne = pricePerOne;
    }

    @Override
    public String toString() {
        return "Cookies{" +
                "amount=" + amount +
                ", pricePerOne=" + pricePerOne +
                ", name='" + name + '\'' +
                '}';
    }
}
