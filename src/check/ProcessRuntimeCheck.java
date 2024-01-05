package check;

public class ProcessRuntimeCheck {

    private Long start;
    private Long end;

    public void start() {
        start = System.nanoTime();
    }

    public void end() {
        end = System.nanoTime();
    }

    public Double calc() {
        return (end - start) / 1000000.0;
    }
}
