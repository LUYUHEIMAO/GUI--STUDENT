package Javammi;

import java.awt.Color;
import java.awt.Container;
import java.awt.Color;
import java.awt.Container;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.awt.Button;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.text.View;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;

public class Register extends JFrame{
	Register(){
		super("ѧ��ע��ҳ��");
		setSize(370, 350);
		Container c = getContentPane();
		c.setBackground(new Color(200, 200, 255));		// ������ɫ������ʹ��RGB����ɫ
		setLayout(null);
		// ������ǩ 
		JLabel L1 = new JLabel("ѧ       ��: ");
		L1.setBounds(40, 50, 80, 20);
		JLabel L2 = new JLabel("��       ��: ");
		L2.setBounds(40, 85, 80, 20);
		JLabel L3 = new JLabel("ȷ������: ");
		L3.setBounds(40, 120, 80, 20);
		JLabel L4 = new JLabel("��       �䣺");
		L4.setBounds(40, 155, 80, 20);
		// �����ı���
		final JTextField t1 = new JTextField(50);
		t1.setBounds(120, 50, 150, 20);	
		final JPasswordField t2 = new JPasswordField(50);
		t2.setBounds(120, 85, 150, 20);
		final JPasswordField t3 = new JPasswordField(50);
		t3.setBounds(120, 120, 150, 20);
		final JTextField t4 = new JTextField(50);
		t4.setBounds(120, 155, 150, 20);
		 // ���ð�ť
        Button btn1 = new Button("ȷ��"); 
        btn1.setBounds(50, 210, 100, 20);
        Button btn2 = new Button("����"); 
        btn2.setBounds(180, 210, 100, 20);
		// ��������
		add(t1);
		add(L1);
		add(L2);
		add(t2);
		add(L3);
		add(t3);
		add(L4);
		add(t4);
        add(btn1);
        add(btn2);
      //�԰�ť����¼�
        btn1.addActionListener(new ActionListener(){
			@SuppressWarnings("null")
			@Override
			public void actionPerformed(ActionEvent e) {
				//��ȡ�ı����ֵ
				String a_1 = t1.getText().trim();
				char[] a_2 = t2.getPassword();
				//����
				try {
					Deposit(a_1,a_2);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();}
				JOptionPane.showMessageDialog(null,"�ɹ���");
			}});
        btn2.addActionListener(new ActionListener(){
			@SuppressWarnings("null")
			@Override
			public void actionPerformed(ActionEvent e) {
				//�������
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
			}});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		Register frm = new Register();		// ��������
	
}
	private static void Deposit(String a_1,char[] a_2) throws Exception{
		 String path = "d:/mima.txt";
	        File file = new File(path);
	        BufferedWriter buf = null;
	        buf = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
	        buf.write(a_1+a_2);
	        buf.close(); 
	}
}