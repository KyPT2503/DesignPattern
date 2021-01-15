package designPattern.behavior.template;

public class Main {
    public static void main(String[] args) {
        Cookies orion = (Cookies) new Cookies().withAmount(100).withName("Orion Cookies").withPricePerOne(15);
        System.out.println(orion);
        orion.setProduct(12, 17);
        System.out.println(orion);
    }
}
