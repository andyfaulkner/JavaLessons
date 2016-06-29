package dayThree;

/**
 * Created by student on 29-Jun-16.
 */
public class threadDemo {

    public static void main(String [] args){
        Thread t = Thread.currentThread();

        new ThreadTwo();

        try{
            for(int i = 1; i< 11; i++){
                System.out.println("Main thread is counting " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e){
            System.out.println("Main thread interrupted");
        }

        System.out.println("Main thread stopped");

    }
}

class ThreadTwo implements Runnable{

    Thread t;
    ThreadTwo(){
        t = new Thread(this, "second thread");
        System.out.println("Another thread: " + t);
        t.start();
    }
    @Override
    public void run() {
        try {
        for (int i = 5; i > 0; i--) {
            System.out.println("Another thread: " + i);

            Thread.sleep(500);
        }
            } catch (InterruptedException e) {
                System.out.println("Second thread interrupted");
            }
        System.out.println("Second thread terminated");
        }
    }
