package Logic.Strategy;

import Logic.Array;

public class QuickSortStrategy extends SortStrategy {

    @Override
    public void execute(Array array) {
        quickSort(array, 0, array.length() - 1);
    }

    private void quickSort(Array array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    private int partition(Array array, int low, int high) {
        int pivot = array.getElement(high);
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array.getElement(j) <= pivot) {
                i++;
                array.swap(i, j);
            }
        }

        array.swap(i + 1, high);
        return i + 1;
    }
}