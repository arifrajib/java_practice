public class SynchronizedMethod {

    public static void main (String[] args) {

        SynchronizedCounter counter = new SynchronizedCounter();

        CountingOperator threadOne   = new CountingOperator(counter, "==Thread One==");
        CountingOperator threadTwo   = new CountingOperator(counter, "==Thread Two==");
        CountingOperator threadThree = new CountingOperator(counter, "==Thread Three==");

        threadOne.start();
        threadTwo.start();
        threadThree.start();
    }

}


class SynchronizedCounter {
    private int counter;

    public synchronized void increment () {
        String color = ColorCode.textColor(Thread.currentThread().getName());

        System.out.println(color+"Thread "+Thread.currentThread().getName()+" get access increment");
        counter++;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(color+"Thread "+Thread.currentThread().getName()+" completed increment operation");
    }

    public synchronized void decrement () {
        String color = ColorCode.textColor(Thread.currentThread().getName());
        System.out.println(color+"Thread "+Thread.currentThread().getName()+" get access decrement");
        counter--;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(color+"Thread "+Thread.currentThread().getName()+" completed decrement operation");
    }

    public void printValue () {
        String color = ColorCode.textColor(Thread.currentThread().getName());
        System.out.println(color+"Thread "+Thread.currentThread().getName()+" Counter value "+counter);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(color+"Thread "+Thread.currentThread().getName()+" completed printing operation");
    }
}


class CountingOperator extends Thread {
    private SynchronizedCounter counter;

    public CountingOperator (SynchronizedCounter counter, String name) {
        super(name);
        this.counter = counter;
    }

    @Override
    public void run (){
        for (int i=0; i<3; i++){
            ////////// Only single synchronized method can be accessible at a time
            counter.increment();
            counter.printValue();
            counter.decrement();
            counter.printValue();
        }
    }
}

