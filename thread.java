public class thread {
    public static void main(String[] args) {
        Runnable myThread = () -> {
            System.out.println("working");
        };
        Thread t1 = new Thread(myThread);
        t1.start();
    }
}
