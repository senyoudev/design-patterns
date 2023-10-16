public class SortContext {
    private Sorting strategy;

    public void setStrategy(Sorting strategy) {
        this.strategy = strategy;
    }

    public void performSort(int[] data) {
        strategy.sort(data);
    }
}