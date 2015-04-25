package com.study;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;

import javax.swing.SwingConstants;

public class Clac2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField = new JTextField();
	private String number1 = new String();
	private String number2 = new String();
	private boolean add;
	private boolean sub;
	private boolean mul;
	private boolean div;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Clac2 frame = new Clac2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	/**
	 * Create the frame.
	 */
	public Clac2() {
		setTitle("\u8BA1\u7B97\u5668");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 278, 359);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setEditable(false);
		textField.setBounds(0, 25, 272, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		// 做退格键时   如果数字的长度大于等于1的话，那么就可以一个一个进行消除，如果没有为空，弹出对话框：请输入数据
		JButton btnNewButton = new JButton("\u2190");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					if(number1.length()>=1){
						number1=number1.substring(0, number1.length()-1);
					textField.setText(number1);
				}else {
					//JOptionPane.showMessageDialog(null,"请输入数据");
					JOptionPane.showMessageDialog(null,"请输入数据");
				}
			}
		});
		btnNewButton.setBounds(6, 123, 49, 30);
		contentPane.add(btnNewButton);

		JButton btnM = new JButton("MC");
		btnM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnM.setBounds(0, 83, 55, 27);
		contentPane.add(btnM);

		JButton button_1 = new JButton("7");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number1 = number1 + "7";
				textField.setText(number1);
			}
		});
		button_1.setBounds(14, 168, 41, 30);
		contentPane.add(button_1);

		JButton button_2 = new JButton("4");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number1 = number1 + "4";
				textField.setText(number1);
			}
		});
		button_2.setBounds(14, 211, 41, 32);
		contentPane.add(button_2);

		JButton button_3 = new JButton("New button");
		button_3.setBounds(14, 213, 33, 30);
		contentPane.add(button_3);

		JButton button_4 = new JButton("1");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number1 = number1 + "1";
				textField.setText(number1);
			}
		});
		button_4.setBounds(14, 250, 41, 30);
		contentPane.add(button_4);

		JButton btnMr = new JButton("MR");
		btnMr.setBounds(53, 83, 57, 26);
		contentPane.add(btnMr);

		JButton btnCe = new JButton("CE");
		btnCe.setBounds(61, 125, 49, 28);
		contentPane.add(btnCe);

		JButton button_7 = new JButton("8");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number1 = number1 + "8";
				textField.setText(number1);
			}
		});
		button_7.setBounds(61, 170, 41, 28);
		contentPane.add(button_7);

		JButton button_8 = new JButton("5");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number1 = number1 + "5";
				textField.setText(number1);
			}
		});
		button_8.setBounds(61, 211, 41, 32);
		contentPane.add(button_8);

		JButton button_9 = new JButton("2");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number1 = number1 + "2";
				textField.setText(number1);
			}
		});
		button_9.setBounds(61, 253, 41, 27);
		contentPane.add(button_9);

		JButton btnMs = new JButton("MS");
		btnMs.setBounds(108, 83, 57, 26);
		contentPane.add(btnMs);
		// 清空按钮  清空符号，数字，文本框
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				add=false;
				sub=false;
				mul=false;
				div=false;
				String number1="";
				String number2="";
				textField.setText("");
				
			}
		});
		btnC.setBounds(108, 125, 49, 28);
		contentPane.add(btnC);

		JButton button_12 = new JButton("9");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number1 = number1 + "9";
				textField.setText(number1);
			}
		});
		button_12.setBounds(108, 170, 41, 28);
		contentPane.add(button_12);

		JButton button_13 = new JButton("6");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number1 = number1 + "6";
				textField.setText(number1);
			}
		});
		button_13.setBounds(108, 211, 41, 32);
		contentPane.add(button_13);

		JButton button_14 = new JButton("3");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number1 = number1 + "3";
				textField.setText(number1);
			}
		});
		button_14.setBounds(108, 253, 41, 27);
		contentPane.add(button_14);

		JButton btnM_1 = new JButton("M+");
		btnM_1.setBounds(165, 82, 55, 29);
		contentPane.add(btnM_1);

		JButton button_16 = new JButton("\u00B1");
		button_16.setBounds(155, 125, 49, 28);
		contentPane.add(button_16);
		// 输入整除
		JButton button_17 = new JButton("/");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				div = true;
				textField.setText("");
				number2 = number1;
				number1 = "";
			}
		});
		button_17.setBounds(155, 170, 49, 28);
		contentPane.add(button_17);
		// 输入乘号
		JButton button_18 = new JButton("*");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mul = true;
				textField.setText("");
				number2 = number1;
				number1 = "";
			}
		});
		button_18.setBounds(155, 211, 41, 32);
		contentPane.add(button_18);
		// 输入减号
		JButton button_19 = new JButton("-");
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sub = true;
				textField.setText("");
				number2 = number1;
				number1 = "";
			}
		});
		button_19.setBounds(155, 250, 41, 30);
		contentPane.add(button_19);

		JButton btnM_2 = new JButton("M-");
		btnM_2.setBounds(224, 81, 48, 30);
		contentPane.add(btnM_2);

		JButton button_21 = new JButton("\u221A");
		button_21.setBounds(218, 124, 54, 28);
		contentPane.add(button_21);
		// 输入%百分号
		JButton button_22 = new JButton("%");
		button_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				{
					//if (number1.length() >= 1) {
						//number1 = Double.parseDouble(number1) / 100 + "";
					if(number1.length()>=1){
						number1=Double.parseDouble(number1)/100+"";
					}
						
						textField.setText(number1);
					}

				}
			}
		);
		button_22.setBounds(221, 168, 51, 30);
		contentPane.add(button_22);

		JButton btnx = new JButton("1/x");
		btnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number1 = number1 + "1/x";
				textField.setText(number1);}}
			
		);
		btnx.setBounds(210, 211, 62, 30);
		contentPane.add(btnx);
		// 做等号运算时     只有number1，number2不能同时为空时才可计算   完成后，符号返回到原先的状态
		JButton button_24 = new JButton("=");
		button_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(number1.equals(""))&&!(number2.equals(""))){
					double a=Double.parseDouble(number2);//
					double b=Double.parseDouble(number1);//9*pi
					number1="";
					number2="";
					double result=0;
					if(add==true){
						result=a+b;
						add=false;
						
					}else if(sub==true){
						result=a-b;
						sub=false;
					}else if(mul==true){
						result=a*b;
						mul=false;
					}else if(div==true){
						result=a/b;
						div=false;
					}
					//处理下double精度失真的问题
					DecimalFormat  df=new DecimalFormat("######0.00");
					textField.setText(df.format(result)+"");}
					else{
						JOptionPane.showMessageDialog(null, "请输入数字");
			
					}
					
				

			}
		});
		button_24.setBounds(206, 250, 66, 76);
		contentPane.add(button_24);

		JButton btnNewButton_1 = new JButton("0");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number1 = number1 + "0";
				textField.setText(number1);
			}
		});
		btnNewButton_1.setBounds(14, 287, 80, 27);
		contentPane.add(btnNewButton_1);

		// 输入小数点 小数点前面必须有数字，不能有多个小数点

		JButton btnNewButton_2 = new JButton(".");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				{
					if (number1.length() >= 1 && !(number1.indexOf(".") >= 1)) {
						number1 = number1 + ".";
						textField.setText(number1);
					} else {
						JOptionPane.showMessageDialog(null, "不合法输入！");
					}

				}
			}
		});
		btnNewButton_2.setBounds(108, 288, 41, 26);
		contentPane.add(btnNewButton_2);
		// 输入加号，
		JButton button_25 = new JButton("+");
		button_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				add = true;
				textField.setText("");
				number2 = number1;
				number1 = "";

			}
		});
		button_25.setBounds(155, 288, 41, 26);
		contentPane.add(button_25);
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 272, 18);
		contentPane.add(menuBar);
		
		JMenu menu = new JMenu("\u6587\u4EF6");
		menuBar.add(menu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("\u5E2E\u52A9");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "计算器2版，开发者：王海玲");
			}
		});
		menu.add(mntmNewMenuItem);
		
		JMenuItem menuItem = new JMenuItem("\u9000\u51FA");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(1);
			}
		});
		menu.add(menuItem);
	}
}
