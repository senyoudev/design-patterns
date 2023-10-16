import java.util.Arrays;

public class DescSorting implements Sorting {
    @Override
    public void sort(int[] data) {
        Arrays.sort(data);
        reverse(data);
    }

    public void reverse(int[] data) {
        for (int i = 0; i < data.length / 2; i++) {
                    int temp = data[i];
                    data[i] = data[data.length - 1 - i];
                    data[data.length - 1 - i] = temp;
                }
    }
}
