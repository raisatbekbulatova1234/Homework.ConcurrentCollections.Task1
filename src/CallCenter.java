import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class CallCenter {

    final private BlockingQueue<String> calls = new ArrayBlockingQueue<>(NUMBER_CALLS);
    final public static int NUMBER_CALLS = 60;
    final private static int WAITING_TIME = 1000;
    final private static int DURATION_OF_CALL = 3000;


    public void incomingCall() {
        calls.offer(Thread.currentThread().getName());

        try {
            System.out.println("Входящий звонок от " + Thread.currentThread().getName());
            Thread.sleep(WAITING_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void takeCall() {
        while (!calls.isEmpty()) {
            try {
                System.out.println("Оператор" + Thread.currentThread().getName() + " принял звонок "
                        + calls.poll());
                Thread.sleep(DURATION_OF_CALL);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static int getNumberCalls() {
        return NUMBER_CALLS;
    }
}