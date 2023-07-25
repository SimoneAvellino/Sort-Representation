package Graphics;

import Logic.Array;
import Logic.Observer;

import javax.swing.*;
import java.awt.*;

public class ArrayViewerPanel extends JPanel implements Observer {

    private int array[];
    private int sortDelay;

    public ArrayViewerPanel(Dimension d, int sortDelay) {
        this.sortDelay = sortDelay;
        setBackground(Color.black);
        setSize(d);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int rectWidth = getWidth() / array.length;
        int heightUnit = getHeight() / getMaxValue();
        int x = 0;
        g.setColor(Color.white);
        for (int i = 0; i < array.length; i++) {
            int height = heightUnit * array[i];
            int y = getHeight() - height;

            g.fillRect(x, y, rectWidth, height);

            x += rectWidth;
        }
    }

    private int getMaxValue() {
        int max = Integer.MIN_VALUE;
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }


    @Override
    public void update(Object array) {
        this.array = ((Array)array).getArray();
        removeAll();
        try {
            Thread.sleep(sortDelay);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        repaint();
    }
}
