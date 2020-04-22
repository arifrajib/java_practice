public class Concurrency {


    public static void main (String[] args) {

        Thread threadOne = new Thread(() -> {
            for (int i=0; i < 5; i++){
                System.out.println("Inside " + Thread.currentThread().getName());

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }, " ======= Thread One ======= ");
        threadOne.start();


        new Thread(() -> {
            for (int i=0; i < 5; i++){
                System.out.println("Inside " + Thread.currentThread().getName());

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }, " ======= Thread Two ======= ").start();

        try {
            threadOne.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        Thread threadThree = new ThreadChild();
        threadThree.setName(" ======= Thread Three ======= ");
        threadThree.start();


        Thread threadFour = new Thread(new RunnableChild());
        threadFour.setName(" ======= Thread Four ======= ");
        threadFour.start();


        System.out.println("Main Thread Completed");


    }
}



class ThreadChild extends Thread {

    @Override
    public void run() {
        for (int i=0; i < 5; i++){
            System.out.println("Inside " + Thread.currentThread().getName());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

class RunnableChild implements Runnable {

    @Override
    public void run() {
        for (int i=0; i < 5; i++){
            System.out.println("Inside " + Thread.currentThread().getName());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

