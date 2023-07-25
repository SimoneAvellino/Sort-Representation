package Logic.Strategy;

import Logic.Array;

public class BogoSortStrategy extends SortStrategy {
    @Override
    public void execute(Array array) {
        while(!array.isSorted()) {
            array.shuffle();
        }
    }
}
