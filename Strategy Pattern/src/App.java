import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] data = {3, -1, 5, -2, 9, 0};

                SortContext context = new SortContext();

                // Using Ascending Sort Strategy
                context.setStrategy(new AscSorting());
                context.performSort(data);
                System.out.println("Ascending Sort: " + Arrays.toString(data));

                // Using Descending Sort Strategy
                context.setStrategy(new DescSorting());
                context.performSort(data);
                System.out.println("Descending Sort: " + Arrays.toString(data));

                   }
}
