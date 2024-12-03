import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Q3 {
    private static boolean equal_pressed = false;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Test");
        Container container = frame.getContentPane();
        final StringBuilder text = new StringBuilder();
        container.setBackground(Color.GRAY);
        container.setLayout(new GridBagLayout());
        //
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 3;
        gbc.gridheight = 1;
        gbc.weightx = 0.1;
        gbc.weighty = 0.1;
        gbc.fill = GridBagConstraints.BOTH;
        JTextField input = new JTextField("");
        input.setHorizontalAlignment(JTextField.RIGHT);
        container.add(input, gbc);
        for (int y = 1; y <= 3; y++) {
            for (int x = 0; x < 3; x++) {
                gbc.gridx = x;
                gbc.gridy = y;
                gbc.gridwidth = 1;
                gbc.gridheight = 1;
                gbc.fill = GridBagConstraints.BOTH;
                JButton button = new JButton("" + ((y - 1) * 3 + x + 1));
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(java.awt.event.ActionEvent e) {

                        if (equal_pressed) {
                            text.setLength(0);
                        }
                        equal_pressed = false;
                        text.append(button.getText());
                        input.setText(text.toString());

                    }
                });
                container.add(button, gbc);
            }
        }
        gbc.gridy = 4;
        gbc.gridx = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        JButton button1 = new JButton("0");
        button1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                if (equal_pressed) {
                    text.setLength(0);
                }
                equal_pressed = false;
                text.append(button1.getText());
                input.setText(text.toString());
            }
        });
        container.add(button1, gbc);
        gbc.gridx = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        JButton button2 = new JButton("+");
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                // System.out.println(text.toString());
                equal_pressed = false;
                text.append(button2.getText());
                input.setText(text.toString());
            }
        });
        // =
        // javasript eval
        container.add(button2, gbc);
        gbc.gridx = 2;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        JButton button3 = new JButton("=");
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                // fail : cant use javascript engine
                // ScriptEngineManager mgr = new ScriptEngineManager();
                // ScriptEngine engine = mgr.getEngineByName("JavaScript");
                // try {
                // Object result = engine.eval(input.getText());
                // input.setText(result.toString());
                // } catch (ScriptException ex) {
                // input.setText("Error");
                // }
                String[] nums = input.getText().split("\\+");
                int sum = 0;
                for (String num : nums) {
                    if (num.isEmpty())
                        continue;
                    sum += Integer.parseInt(num);
                }
                input.setText(String.valueOf(sum));
                text.setLength(0);
                text.append(sum);
                equal_pressed = true;
            }
        });
        container.add(button3, gbc);
        //
        //
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
// sudo apt install libxext6 libxrender1 libxtst6 libxi6 libx11-6 libfreetype6
// fontconfig