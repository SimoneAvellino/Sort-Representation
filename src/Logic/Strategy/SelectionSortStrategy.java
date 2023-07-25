package Logic.Strategy;

import Logic.Array;

public class SelectionSortStrategy extends SortStrategy {

    @Override
    public void execute(Array array) {
        int n = array.length();

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array.getElement(j) < array.getElement(minIndex)) {
                    minIndex = j;
                }
            }

            array.swap(i, minIndex);
        }
    }
}
