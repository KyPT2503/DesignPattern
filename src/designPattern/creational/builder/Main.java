package designPattern.creational.builder;

public class Main {
    public static void main(String[] args) {
        Person me=new Person().withName("Ryu Coder").withAge("21").withCareer("Software Engineer").withGender("Male").withId("19111911").build();
        System.out.println(me);
    }
}
