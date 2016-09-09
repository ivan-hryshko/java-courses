package Other;

public class Printer implements Runnable {
    @Override
    public void run() {
        long count =0;
        int number = 1000000000;
        for (int i = 0; i <number ; i++) {
            count+=i;
        } for (int i = 0; i <number ; i++) {
            count-=i;
        }
        System.out.println(count);
    }
}
