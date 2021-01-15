package designPattern.behavior.observer;

public class Main {
    public static void main(String[] args) {
        // create 4 Text instance and display values
        Text originText = new Text().withValue("Origin designPattern.behavior.observer.Text");
        Text branchText01 = new Text().withValue("First Branch designPattern.behavior.observer.Text");
        Text branchText02 = new Text().withValue("Second Branch designPattern.behavior.observer.Text");
        Text branchText03 = new Text().withValue("Third Branch designPattern.behavior.observer.Text");

        System.out.println(originText.getValue());
        System.out.println(branchText01.getValue());
        System.out.println(branchText02.getValue());
        System.out.println(branchText03.getValue());

        //register 3 branch text with origin text, change value of origin text and display all of them
        originText.attachSubject(branchText01);
        originText.attachSubject(branchText02);
        originText.attachSubject(branchText03);
        originText.setValue("Origin text changed.");

        System.out.println(originText.getValue());  //Origin text changed.
        System.out.println(branchText01.getValue());//Origin text changed.
        System.out.println(branchText02.getValue());//Origin text changed.
        System.out.println(branchText03.getValue());//Origin text changed.

        //detach 1 branchText01 text, change value of origin text and display all of them
        originText.detachSubject(branchText01);
        originText.setValue("new origin Text");

        System.out.println(originText.getValue());  //new origin Text
        System.out.println(branchText01.getValue());//Origin text changed.
        System.out.println(branchText02.getValue());//new origin Text
        System.out.println(branchText03.getValue());//new origin Text
    }
}
