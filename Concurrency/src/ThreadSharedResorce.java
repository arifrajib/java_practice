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
        String color = ColorCode.textColor(Thread.currentThread().getName());
        for(i=10; i > 0; i--){
            System.out.println(color+"Thread "+Thread.currentThread().getName()+ " doing count down i: " + i);
        }
    }
}



