import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;	

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;



public class S1254013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Frame();
	}

}

class Frame extends JFrame implements WindowListener {
	
	private String filePath="c:\\java\\input.txt";
	private String calnumber="";
	public Frame() {
		setTitle("My Program(S1254013 楊敦傑)");
		setSize(573, 590);
		setLayout(new GridLayout(5, 1, 5, 5));
		
		addWindowListener(this);
		JPanel rrr1 = new JPanel(new GridLayout(1, 5, 5, 5));
		JPanel rrr2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel rrr3 = new JPanel(new GridLayout(1, 3, 5, 5));
		JLabel sum = new JLabel("Sum");
		JLabel calculator = new JLabel("Calculator");
		JLabel BMI = new JLabel("BMI");
		sum.setForeground(Color.blue);
		rrr3.add(BMI);
		calculator.setForeground(Color.blue);
		BMI.setForeground(Color.blue);
		JLabel message = new JLabel("message:");
		JTextArea messageInput = new JTextArea();
		messageInput.setBorder(new LineBorder(Color.BLACK));
		messageInput.setWrapStyleWord(true);
		messageInput.setLineWrap(true);
		JScrollPane scrollPane = new JScrollPane(messageInput);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		JLabel ssum = new JLabel("sum:");
		JLabel rsum = new JLabel("");
		messageInput.addKeyListener(new KeyListener() {
			
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				char c = e.getKeyChar();
				int n=0;
				String ss = messageInput.getText().toString();
				for(int i=0;i<ss.length();i++) {
					if(ss.charAt(i)>='1' && ss.charAt(i)<='9') {
						n+=ss.charAt(i)-'0';
					}
				}
				if(c>='1' && c<='9') {
					n+=c-'0';
				}
				rsum.setText(Integer.toString(n));
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});

		rsum.setForeground(Color.blue);
		rrr1.add(sum);
		rrr1.add(message);
		rrr1.add(scrollPane);
		rrr1.add(ssum);
		rrr1.add(rsum);
		
		// calculator
		JPanel rrow2 = new JPanel(new GridLayout(2, 1, 5, 5));
		JPanel rrow3 = new JPanel(new GridLayout(1, 9, 5, 5));
		JTextField calculatorInput = new JTextField(15);
		calculatorInput.setHorizontalAlignment(JLabel.RIGHT);
		JButton b1=new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		JButton b6 = new JButton("6");
		JButton b7 = new JButton("7");
		JButton b8 = new JButton("8");
		JButton b9 = new JButton("9");
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				calnumber+=b1.getText();
				calculatorInput.setText(calnumber);
			}
		});
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				calnumber+=b2.getText();
				calculatorInput.setText(calnumber);
			}
		});
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				calnumber+=b3.getText();
				calculatorInput.setText(calnumber);
			}
		});
		b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				calnumber+=b4.getText();
				calculatorInput.setText(calnumber);
			}
		});
		b5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				calnumber+=b5.getText();
				calculatorInput.setText(calnumber);
			}
		});
		b6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				calnumber+=b6.getText();
				calculatorInput.setText(calnumber);
			}
		});
		b7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				calnumber+=b7.getText();
				calculatorInput.setText(calnumber);
			}
		});
		b8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				calnumber+=b8.getText();
				calculatorInput.setText(calnumber);
			}
		});
		b9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				calnumber+=b9.getText();
				calculatorInput.setText(calnumber);
			}
		});
		rrow3.add(b1);
		rrow3.add(b2);
		rrow3.add(b3);
		rrow3.add(b4);
		rrow3.add(b5);
		rrow3.add(b6);
		rrow3.add(b7);
		rrow3.add(b8);
		rrow3.add(b9);
		rrow2.add(calculatorInput);
		rrow2.add(rrow3);
		rrr2.add(calculator);
		rrr2.add(rrow2);
		
		
		
		
		// bmi
		JLabel bmireuslt = new JLabel("");
		JPanel dffffJPanel=new JPanel(new BorderLayout());
		JButton excuteButton = new JButton("Execute");
		dffffJPanel.add(excuteButton,BorderLayout.SOUTH);
		excuteButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
					 String line;
					 String amString="";
					 while((line=reader.readLine()) != null) {
						 String[] nn=line.split(" ");
						 double height = Double.parseDouble(nn[0])/100;
						 double w = Double.parseDouble(nn[1]);
						 double bmi = w/(height*height);
						 String text="";
						 if(bmi<18.5) {
							text="體重過輕";
						}else if(18.5<=bmi && bmi <24) {
							text="正常範圍";
						}else if(24<=bmi && bmi <27) {
							text="過重";
						}else if(27<=bmi && bmi <30) {
							text="輕度肥胖";
						}else if(30<=bmi && bmi <35) {
							text="中度肥胖";
						}else if(bmi>=35) {
							text="重度肥胖";
						}
						String anStrin=String.format("%s BMI=%.2f(%s)<br>", line,bmi,text);
						amString+=anStrin;
					 }
					 amString="<html>"+amString+"</html>";
					 bmireuslt.setText(amString);
					 
				}catch(IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		rrr3.add(bmireuslt);
		rrr3.add(dffffJPanel);
		JPanel rrr4 = new JPanel(new FlowLayout());
		JButton closeButton = new JButton("Close");
		closeButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		rrr4.add(closeButton);
		JLabel labelddd = new JLabel("<html>作答情形：<br>姓名：S1254013 楊敦傑 <br>1.視窗畫面：全部完成<br>2.Sum：全部完成<br>3.Calculator：全部完成<br>4:BMI：全部完成<br>5:關閉視窗：全部完成</html>");
		add(rrr1);
		add(rrr2);
		add(rrr3);
		add(rrr4);
		add(labelddd);
		setVisible(true);
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

}