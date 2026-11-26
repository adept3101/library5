import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class SelectionSort <T> implements SortStrategy<T> {

    @Override
    public void sort(List<T> item, Comparator<T> comparator) {
        for (int i = 0; i < item.size() - 1; i++) {
            int minIndex = i;

            for (int j = 0; j < item.size() - 1 - i; j++) {

                if (comparator.compare(item.get(j), item.get(j + 1)) < 0) {
                    minIndex = j;
                }
            }
            Collections.swap(item, i, minIndex);
        }
    }
}