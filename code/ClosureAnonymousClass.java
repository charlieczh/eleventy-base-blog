public class ClosureAnonymousClass {
    public static void main(String[] args) {
        int localInt = 10;
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(localInt);
            }
        };
        runnable.run();
    }
}