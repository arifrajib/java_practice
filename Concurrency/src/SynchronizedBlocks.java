public class SynchronizedBlocks {

    public static void main (String[] args) {

        NonSynchronizedCounter counter = new NonSynchronizedCounter();

        SynchronizedCountingOperator threadOne   = new SynchronizedCountingOperator(counter, "==Thread One==");
        SynchronizedCountingOperator threadTwo   = new SynchronizedCountingOperator(counter, "==Thread Two==");
        SynchronizedCountingOperator threadThree = new SynchronizedCountingOperator(counter, "==Thread Three==");

        threadOne.start();
        threadTwo.start();
        threadThree.start();
    }

}


class NonSynchronizedCounter {
    private Object obj1 = new Object();
    private Object obj2 = new Object();

    public void singleSynchronizedBlock () {
        String color = ColorCode.textColor(Thread.currentThread().getName());

        System.out.println(color+Thread.currentThread().getName()+" get method access");
        ////////// Only single synchronized method can be accessible at a time
        synchronized (this) {
            System.out.print(color + Thread.currentThread().getName() + " get Synchronized block access ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("and completed");
        }

    }

    public void multipleSynchronizedBlock () {
        String color = ColorCode.textColor(Thread.currentThread().getName());
        ////////// Only single synchronized method can be accessible at a time

        synchronized (obj1){
            System.out.println(color + Thread.currentThread().getName() + " get first Synchronized block access ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(color + Thread.currentThread().getName() + " first block completed");
        }
        System.out.println(color + Thread.currentThread().getName()+" get method access");
        synchronized (obj2){
            System.out.println(color + Thread.currentThread().getName() + " get second Synchronized block access ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(color + Thread.currentThread().getName() + " second block completed");
        }
    }

}


class SynchronizedCountingOperator extends Thread {
    private NonSynchronizedCounter counter;


    public SynchronizedCountingOperator (NonSynchronizedCounter counter, String name) {
        super(name);
        this.counter = counter;
    }

    @Override
    public void run (){
        for (int i=0; i<3; i++){
            ////////// singleSynchronizedBlock ()
            //this.counter.singleSynchronizedBlock();

            ////////// multipleSynchronizedBlock ()
            this.counter.multipleSynchronizedBlock();

            ///////// Static Synchronized Block
            //StaticSynchronizedBlock.SynchronizedBlock();
        }
    }
}


class StaticSynchronizedBlock {

    public static void SynchronizedBlock (){

        String color = ColorCode.textColor(Thread.currentThread().getName());
        //// Non  Synchronized Block
        System.out.println(color+"Thread "+Thread.currentThread().getName()+" get Non Synchronized Block access");

        //// Synchronized Block
        synchronized (StaticSynchronizedBlock.class){
            System.out.print(color+"Thread "+Thread.currentThread().getName() + " get Synchronized operation access ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("and completed");
        }
    }

}