import java.awt.*;
import javax.swing.*;

public class S1254013 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Test");
        Container container = frame.getContentPane();
        container.setBackground(Color.GRAY);
        container.setLayout(new GridBagLayout());
        //
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 3;
        gbc.gridheight = 1;
        gbc.weightx = 0.5;
        gbc.weighty = 0.5;
        gbc.fill = GridBagConstraints.BOTH;
        JTextField input = new JTextField("");
        container.add(input, gbc);
        for (int y = 1; y <= 3; y++) {
            for (int x = 0; x < 3; x++) {
                gbc.gridx = x;
                gbc.gridy = y;
                gbc.gridwidth = 1;
                gbc.gridheight = 1;
                gbc.fill = GridBagConstraints.BOTH;
                JButton button = new JButton("" + ((y - 1) * 3 + x + 1));
                container.add(button, gbc);
            }
        }
        //
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
// sudo apt install libxext6 libxrender1 libxtst6 libxi6 libx11-6 libfreetype6
// fontconfig