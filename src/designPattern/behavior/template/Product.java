package designPattern.behavior.template;

public abstract class Product {
    protected int amount;
    protected int pricePerOne;
    protected String name;

    public Product() {
    }

    public Product withAmount(int amount) {
        this.amount = amount;
        return this;
    }

    public Product withPricePerOne(int pricePerOne) {
        this.pricePerOne = pricePerOne;
        return this;
    }

    public Product withName(String name) {
        this.name = name;
        return this;
    }

    public abstract void setAmount(int amount);

    public abstract void setPricePerOne(int pricePerOne);

    public void setProduct(int amount, int pricePerOne) {
        this.setAmount(amount);
        this.setPricePerOne(pricePerOne);
    }
}
