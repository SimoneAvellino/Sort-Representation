package Logic.Strategy;

import Logic.Array;

public class MergeSortStrategy extends SortStrategy {

    @Override
    public void execute(Array array) {
        mergeSort(array, 0, array.length() - 1);
    }

    private void mergeSort(Array array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }

    private void merge(Array array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = array.getElement(left + i);
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = array.getElement(mid + 1 + j);
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array.setElement(k, leftArray[i]);
                i++;
            } else {
                array.setElement(k, rightArray[j]);
                j++;
            }
            k++;
        }

        while (i < n1) {
            array.setElement(k, leftArray[i]);
            i++;
            k++;
        }

        while (j < n2) {
            array.setElement(k, rightArray[j]);
            j++;
            k++;
        }
    }
}
