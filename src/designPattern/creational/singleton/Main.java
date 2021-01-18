package designPattern.creational.singleton;

public class Main {
    public static void main(String[] args) {
        Admin admin=Admin.getInstance("Ryu Coder");
        System.out.println(admin.getName());
        Admin newAdmin=Admin.getInstance("James");
        System.out.println(newAdmin.getName());
    }
}
