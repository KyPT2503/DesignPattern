package designPattern.creational.objectPool;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new User("User("+i+")"));
            thread.start();
            try{
                Thread.sleep(10);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
