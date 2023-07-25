package Logic.Strategy;

import Logic.Array;

public class HeapSortStrategy extends SortStrategy {

    @Override
    public void execute(Array array) {
        int n = array.length();

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }

        for (int i = n - 1; i > 0; i--) {
            array.swap(0, i);

            heapify(array, i, 0);
        }
    }

    private void heapify(Array array, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && !array.areOrdered(left, largest)) {
            largest = left;
        }

        if (right < n && !array.areOrdered(right, largest)) {
            largest = right;
        }

        if (largest != i) {
            array.swap(i, largest);

            heapify(array, n, largest);
        }
    }
}
