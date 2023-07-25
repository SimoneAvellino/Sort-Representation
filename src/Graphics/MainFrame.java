package Graphics;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public MainFrame(JPanel panel, Dimension dimension) {

        setContentPane(panel);
        setSize(dimension);
        setResizable(false);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

}

