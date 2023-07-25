package Logic.Strategy;

import Logic.Array;

public class BubbleSortStrategy extends SortStrategy {

    @Override
    public void execute(Array array) {
        for(int i = 0; i < array.length(); i++) {
            for(int j = 1; j < array.length(); j++) {
                if(!array.areOrdered(j - 1, j)) {
                    array.swap(j - 1, j);
                }
            }
        }
    }

}
