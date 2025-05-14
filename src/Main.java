import Graphics.ArrayViewerPanel;
import Logic.*;
import Graphics.MainFrame;
import Logic.Strategy.*;
import java.awt.*;

public class Main {

    /*
        Graphical representation of all sorting algorithms. Thanks to the design patterns used
        it is possible to represent any existing sorting algorithm in a flexible way.
    */



    private static int ARRAY_LENGTH = 500;
    private static int MILLIS_SORT_SPEED_DELAY = 5;
    /*
        SelectionSortStrategy()
        QuickSortStrategy()
        MergeSortStrategy()
        InsertionSortStrategy()
        HeapSortStrategy()
        BubbleSortStrategy()
        BogoSortStrategy()
        MergeSortStrategy()

    */
    private static SortStrategy strategy = new MergeSortStrategy();

    public static void main(String[] args) {

        // Generate random array
        Array a = new Array(ARRAY_LENGTH);

        // Instantiate graphics components
        Dimension d = new Dimension(1000, 600);
        ArrayViewerPanel arrayViewerPanel = new ArrayViewerPanel(d, MILLIS_SORT_SPEED_DELAY);
        new MainFrame(arrayViewerPanel, d);

        // Define logic
        a.subscribe(arrayViewerPanel);

        // SETTING THE SORT STRATEGY
        a.setSortStrategy(strategy);

        // Start sorting
        a.sort();
    }
}
