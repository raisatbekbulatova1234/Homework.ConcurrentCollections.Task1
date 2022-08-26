public class Operator extends Thread {
    private CallCenter callCenter;
    private final static int NUMBER_OF_OPERATORS = 4;

    public static int getNumberOfOperators() {
        return NUMBER_OF_OPERATORS;
    }

    public Operator(String name, CallCenter callCenter) {
        super(name);
        this.callCenter = callCenter;
    }

    @Override
    public void run() {
        callCenter.takeCall();
    }
}