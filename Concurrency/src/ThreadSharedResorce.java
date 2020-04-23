public class ThreadSharedResorce {

    public static void main (String[] args) {
        CountDown counting = new CountDown();

        Thread threadOne = new Thread(() -> {
            counting.doCountDown();
        },"==Thread One==");

        Thread threadTwo = new Thread(() -> {
            counting.doCountDown();
        },"==Thread Two==");

        threadOne.start();
        threadTwo.start();
    }

}



class CountDown {
    private int i;

    public synchronized void doCountDown () {
        for(i=10; i > 0; i--){
            System.out.println("Thread "+Thread.currentThread().getName()+ " doing count down i: " + i);
        }
    }
}



