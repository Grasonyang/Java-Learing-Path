
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class S1254013 {
    public static void main(String[] args) {
        new Frame222();
    }
}

class Frame222 extends JFrame {
    private JLabel c1 = new JLabel("");
    private JLabel c2 = new JLabel("");
    private String databaseURL = "jdbc:ucanaccess://c:/dictionary.mdb";

    Frame222() {
        setTitle("電子字典");
        setSize(700, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1, 5, 5));
        JLabel title = new JLabel("電子字典", JLabel.CENTER);
        JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel l1 = new JLabel("英文單字:", JLabel.LEFT);
        JTextField t1 = new JTextField(20);
        JButton b1 = new JButton("查詢");
        b1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                try {
                    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                    try (Connection connection = DriverManager.getConnection(databaseURL)) {
                        String word = t1.getText();
                        String sql = "SELECT * FROM `dictionary` WHERE `eng` = ?";
                        try (PreparedStatement presql = connection.prepareStatement(sql)) {
                            presql.setString(1, word);
                            java.sql.ResultSet rs = presql.executeQuery();
                            if (rs.next()) {
                                c1.setForeground(Color.BLUE);
                                c2.setForeground(Color.BLUE);

                                c1.setText(rs.getString("ch"));
                                c2.setText(rs.getString("sentence"));
                            } else {
                                c1.setForeground(Color.RED);
                                c1.setText("查無此字");
                                c2.setText("");
                            }
                        } catch (SQLException e1) {
                            System.err.println("Wrong: " + e1.getMessage());
                        }
                    } catch (SQLException e1) {
                        System.err.println("Wrong: " + e1.getMessage());
                    }
                } catch (ClassNotFoundException e1) {
                    System.err.println("UCanAccess Driver not found.");
                }
            }

        });
        panel1.add(l1);
        panel1.add(t1);
        panel1.add(b1);
        JPanel panel2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel l2 = new JLabel("中文:", JLabel.LEFT);
        panel2.add(l2);
        panel2.add(c1);
        JPanel panel3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel l3 = new JLabel("例句:", JLabel.LEFT);
        panel3.add(l3);
        panel3.add(c2);
        add(title);
        add(panel1);
        add(panel2);
        add(panel3);
        setVisible(true);
    }
}