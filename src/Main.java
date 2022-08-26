public class Main {

    public static void main(String[] args) {
        CallCenter callCenter = new CallCenter();
        for (int i = 1; i <= CallCenter.getNumberCalls(); i++) {
            ATS ats = new ATS("абонентa " + i, callCenter);
            ats.start();
        }

        for (int i = 1; i <= Operator.getNumberOfOperators(); i++) {
            Operator operator = new Operator(" № " + i, callCenter);
            operator.start();
        }
    }

}