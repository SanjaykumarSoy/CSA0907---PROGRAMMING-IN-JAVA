public class Q8 {
    public static void main(String args[]) {
        try {
            Thread.sleep(2000);
            System.out.println("Completed");
        } 
        catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}
