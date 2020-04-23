public class ThreadRaceCondition {

    public static void main (String[] args) {
        CountDownRace counting = new CountDownRace();

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



class CountDownRace {
    private int i;

    public void doCountDown () {
        for(i=10; i > 0; i--){
            System.out.println("Thread "+Thread.currentThread().getName()+ " doing count down i: " + i);
        }
    }
}




