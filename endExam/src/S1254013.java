import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import java.util.Collections;

public class S1254013 {
    public static void main(String[] args) {
        new Frame11();
    }
}

class Frame11 extends JFrame {
    private JTextArea textArea41 = new JTextArea(30, 30);
    private JTextArea textArea42 = new JTextArea(30, 30);

    public Frame11() {
        setSize(537, 590);
        setTitle("My Program (S1254013 楊敦傑)");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 1, 0, 0));
        JScrollPane scrollPane1 = new JScrollPane(textArea41);
        JScrollPane scrollPane2 = new JScrollPane(textArea42);
        JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel title1 = new JLabel("計算機");
        title1.setForeground(Color.BLUE);
        panel1.add(title1);
        JPanel rightPanel = new JPanel(new GridLayout(2, 1));
        JTextField textField = new JTextField();
        textField.setHorizontalAlignment(JTextField.RIGHT);
        rightPanel.add(textField);
        rightPanel.setBorder(new EmptyBorder(0, 70, 0, 0));
        JPanel buttonPanel = new JPanel(new GridLayout(1, 8));
        String[] buttons = { "1", "2", "3", "4", "5", "+", "-", "=" };
        for (String text : buttons) {
            JButton button = new JButton(text);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String command = e.getActionCommand();
                    if (command.equals("=")) {
                        try {
                            int ans = eval(textField.getText());
                            String anss = Integer.toString(ans);
                            textField.setText(anss);
                        } catch (Exception ex) {
                            textField.setText("Error");
                        }
                    } else {
                        textField.setText(textField.getText() + command);
                    }
                }
            });
            buttonPanel.add(button);
        }
        rightPanel.add(buttonPanel);
        panel1.add(rightPanel);

        // row1
        JPanel panel2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel title2 = new JLabel("個人資料");
        title2.setForeground(Color.BLUE);
        panel2.add(title2);

        JPanel rightPanel2 = new JPanel(new GridLayout(3, 2));
        rightPanel2.setBorder(new EmptyBorder(0, 60, 0, 0));
        JPanel row11 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel label1 = new JLabel("學院:");
        JComboBox<String> labelbtn1 = new JComboBox<>(new String[] { "管理學院", "工學院", "文學院" });
        row11.add(label1);
        row11.add(labelbtn1);
        JPanel row12 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel label2 = new JLabel("系所:");
        JComboBox<String> labelbtn2 = new JComboBox<>(new String[] { "資訊管理系", "企業管理系" });
        labelbtn1.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                String text = labelbtn1.getSelectedItem().toString();
                DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
                if (text.equals("管理學院")) {
                    model.addElement("資訊管理系");
                    model.addElement("企業管理系");
                } else if (text.equals("工學院")) {
                    model.addElement("資訊工程系");
                    model.addElement("電機工程系");
                } else if (text.equals("文學院")) {
                    model.addElement("國文系");
                    model.addElement("英語系");
                }
                labelbtn2.setModel(model);
            }
        });
        row12.add(label2);
        row12.add(labelbtn2);
        rightPanel2.add(row11);
        rightPanel2.add(row12);

        // row2
        JPanel row21 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel label21 = new JLabel("學號:");
        JTextField label21ipnut = new JTextField(10);
        row21.add(label21);
        row21.add(label21ipnut);
        JPanel row22 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel label22 = new JLabel("性別:");
        JRadioButton mm = new JRadioButton("男");
        mm.setSelected(true);
        JRadioButton ff = new JRadioButton("女");
        ButtonGroup mmff = new ButtonGroup();
        mmff.add(mm);
        mmff.add(ff);
        row22.add(label22);
        row22.add(mm);
        row22.add(ff);
        rightPanel2.add(row21);
        rightPanel2.add(row22);

        // row3
        JPanel row31 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel label31 = new JLabel("國文:");
        JTextField label31input = new JTextField(5);
        label31input.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
        row31.add(label31);
        row31.add(label31input);
        JPanel row32 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel label32 = new JLabel("英文:");
        JTextField label32input = new JTextField(5);
        label32input.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
        row32.add(label32);
        row32.add(label32input);
        rightPanel2.add(row31);
        rightPanel2.add(row32);
        panel2.add(rightPanel2);

        JPanel panel3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton send = new JButton("送出");
        send.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String college = labelbtn1.getSelectedItem().toString();
                String department = labelbtn2.getSelectedItem().toString();
                String studentId = label21ipnut.getText();
                String gender = mm.isSelected() ? "男" : "女";
                String chineseScore = label31input.getText().toString().equals("") ? "0"
                        : label31input.getText().toString();
                String englishScore = label32input.getText().toString().equals("") ? "0"
                        : label32input.getText().toString();

                String data = String.format("\n%s,%s,%s,%s,%s,%s", college, department, studentId, gender,
                        chineseScore,
                        englishScore);
                System.out.println(data);
                try (BufferedWriter writer = new BufferedWriter(new FileWriter("c:\\java\\input_final.txt", true))) {
                    writer.write(data);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                try (BufferedReader reader = new BufferedReader(new FileReader("c:\\java\\input_final.txt"))) {
                    textArea41.setText("");
                    String line;
                    while ((line = reader.readLine()) != null) {
                        textArea41.append(line + "\n");
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

                try (BufferedReader reader = new BufferedReader(new FileReader("c:\\java\\input_final.txt"))) {
                    ArrayList<String> students = new ArrayList<>();
                    ArrayList<Double> averages = new ArrayList<>();
                    String line;
                    boolean hasValidData = false;
                    while ((line = reader.readLine()) != null) {
                        String[] fields = line.split(",");
                        System.out.println(fields.length);
                        System.out.println(fields[1]);
                        System.out.println(fields[3]);
                        System.out.println(fields[4]);

                        if (fields.length == 5
                                && !(fields[1].isEmpty() || fields[3].isEmpty() || fields[4].isEmpty())) {
                            try {
                                System.out.println("Checked");
                                String name = fields[1];
                                int chinese = Integer.parseInt(fields[3]);
                                int english = Integer.parseInt(fields[4]);
                                double average = (chinese + english) / 2.0;
                                students.add(name);
                                averages.add(average);
                                hasValidData = true;
                            } catch (NumberFormatException ex) {
                                // Skip invalid data
                            }
                        }
                    }

                    if (hasValidData) {
                        for (int i = 0; i < averages.size() - 1; i++) {
                            for (int j = i + 1; j < averages.size(); j++) {
                                if (averages.get(i) < averages.get(j)) {
                                    double tempAvg = averages.get(i);
                                    averages.set(i, averages.get(j));
                                    averages.set(j, tempAvg);
                                    String tempName = students.get(i);
                                    students.set(i, students.get(j));
                                    students.set(j, tempName);
                                }
                            }
                        }
                        textArea42.setText("");
                        for (int i = 0; i < students.size(); i++) {
                            textArea42.append(students.get(i) + ", " + averages.get(i) + "\n");
                        }
                    } else {
                        textArea42.setText("No valid data found.");
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        panel3.add(send);

        JPanel panel4 = new JPanel(new GridLayout(2, 2, 5, 5));
        panel4.setBorder(new EmptyBorder(0, 0, 0, 150));
        JPanel aa = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JLabel label41 = new JLabel("檔案內容");
        aa.add(label41);
        panel4.add(aa);
        panel4.add(scrollPane1);
        JPanel bb = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JLabel label42 = new JLabel("成績排名");
        bb.add(label42);
        panel4.add(bb);
        panel4.add(scrollPane2);

        JPanel panel5 = new JPanel(new BorderLayout());
        JPanel aaa = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton close = new JButton("結束");
        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        aaa.add(close);
        panel5.add(aaa, BorderLayout.NORTH);
        panel5.add(new JLabel(
                "<html>作答情形：<br>姓名：S1254013 楊敦傑 <br>1.視窗畫面：全部完成 <br>2.計算機：全部完成<br>3.個人資料：部分完成(寫入OK，亂碼造成讀取錯誤)<br>4:關閉視窗: 全部完成</html>"),
                BorderLayout.WEST);
        add(panel1);
        add(panel2);
        add(panel3);
        add(panel4);
        add(panel5);
        setVisible(true);
    }

    private int eval(String text) {
        text = text.trim();
        ArrayList<String> adds = new ArrayList<String>(); // 符號
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        StringBuilder num = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '+' || text.charAt(i) == '-') {
                adds.add(String.valueOf(text.charAt(i)));
                numbers.add(Integer.parseInt(num.toString()));
                num = new StringBuilder();
            } else {
                num.append(text.charAt(i));
            }
        }
        numbers.add(Integer.parseInt(num.toString())); // 最後一個數字
        int result = numbers.get(0);
        for (int i = 0; i < adds.size(); i++) {
            if (adds.get(i).equals("+")) {
                result += numbers.get(i + 1);
            } else {
                result -= numbers.get(i + 1);
            }
        }
        return result;
    }
}