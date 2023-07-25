import Graphics.ArrayViewerPanel;
import Logic.*;
import Graphics.MainFrame;
import Logic.Strategy.*;
import java.awt.*;

public class Main {

    /*
        PROGETTO INGEGNERIA DEL SOFTWARE
        Nome: Simone
        Cognome: Avellino
        Matricola: 1000030497

        Descrizione: Rappresentazione grafica di tutti gli algoritmi di sorting. Grazie ai design pattern usati
                     è possibile rapprentare qualsiasi algoritmo di sorting esistente.
    */



    private static int ARRAY_LENGTH = 500;
    private static int MILLIS_SORT_SPEED_DELAY = 5;
    /*
        Possible sorting strategy

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