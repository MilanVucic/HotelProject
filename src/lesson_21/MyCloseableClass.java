package lesson_21;

public class MyCloseableClass implements AutoCloseable{
    public void doStuff() {
        System.out.println("I',m doing some stuff...");
    }

    @Override
    public void close() throws Exception {
        System.out.println("I'm closing...");
    }
}
