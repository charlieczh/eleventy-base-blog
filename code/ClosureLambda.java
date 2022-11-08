public class ClosureLambda {
    public static void main(String[] args) {
        int localInt = 10;
        Runnable runnable = () -> System.out.println(localInt);
        runnable.run();
    }
}