public class Q11 {
    public static void main(String args[]) {
        Demo d = new Demo();
        d.start();  
    }
}
class Demo extends Thread {
    public void run() {
        System.out.println("Running");
    }
}
