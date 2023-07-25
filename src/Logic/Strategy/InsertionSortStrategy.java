package Logic.Strategy;

import Logic.Array;

public class InsertionSortStrategy extends SortStrategy {
    @Override
    public void execute(Array array) {
        int length = array.length();
        for(int i = 1; i < length; i++) {
            int indexKey = i;
            int j = i - 1;
            while (j >= 0 && !array.areOrdered(j, i)) {
                array.swap(j, i);
                j--;
                i--;
            }
        }
    }
}
