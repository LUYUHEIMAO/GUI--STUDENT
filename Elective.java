package Javammi;

import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Elective extends JFrame{
	int i = 0;
	Elective(){
		super("ѧ��ѡ��ҳ��");
		setSize(380, 460);
		Container c = getContentPane();
		c.setBackground(new Color(200, 200, 255));		// ������ɫ������ʹ��RGB����ɫ
		setLayout(null);
		// ������ǩ 
		JLabel L1 = new JLabel("��      ��: ");
		L1.setBounds(40, 50, 80, 20);
		JLabel L2 = new JLabel("ѧ      ��: ");
		L2.setBounds(40, 80, 80, 20);
		JLabel L3 = new JLabel("��      ��: ");
		L3.setBounds(40, 110, 80,20);
		JLabel L4 = new JLabel("ѡ      ��: ");
		L4.setBounds(40, 140, 80, 20);
		JLabel L5 = new JLabel("�γ����: ");
		L5.setBounds(40, 170, 80, 20);
		JLabel L6 = new JLabel("��ʦ����: ");
		L6.setBounds(40, 200, 80, 20);
		JLabel L7 = new JLabel("�Ͽεص�: ");
		L7.setBounds(40, 230, 80, 20);
		JLabel L8 = new JLabel("��      ʱ: ");
		L8.setBounds(40, 260, 80, 20);
		JLabel L9 = new JLabel("ѧ      ��: ");
		L9.setBounds(40, 290, 80, 20);
		// �����ı���
		final JTextField t1 = new JTextField(50);
		t1.setBounds(120, 50, 150, 20);	
		final JTextField t2 = new JTextField(50);
		t2.setBounds(120, 80, 150, 20);
		final JTextField t3 = new JTextField(50);
		t3.setBounds(120, 110, 150, 20);
		final JTextField t4 = new JTextField(50);
		t4.setBounds(120, 140, 150, 20);
		final JTextField t5 = new JTextField(50);
		t5.setBounds(120, 170, 150, 20);
		final JTextField t6 = new JTextField(50);
		t6.setBounds(120, 200, 150, 20);
		final JTextField t7 = new JTextField(50);
		t7.setBounds(120, 230, 150, 20);
		final JTextField t8 = new JTextField(50);
		t8.setBounds(120, 260, 150, 20);
		final JTextField t9 = new JTextField(50);
		t9.setBounds(120, 290, 150, 20);
		 // ���ð�ť
        Button btn1 = new Button("ȷ��ѡ��"); 
        btn1.setBounds(50, 340, 100, 20);
        Button btn2 = new Button("ȡ��ѡ��"); 
        btn2.setBounds(180, 340, 100, 20);
        Button btn3 = new Button("�鿴ѡ��"); 
        btn3.setBounds(115, 380, 100, 20);
		// ��������
		add(t1);
		add(L1);
		add(L2);
		add(t2);
		add(L3);
		add(t3);
		add(L4);
		add(t4);
		add(L5);
		add(t5);
		add(L6);
		add(t6);
		add(L7);
		add(t7);
		add(L8);
		add(t8);
		add(L9);
		add(t9);
        add(btn1);
        add(btn2);
        add(btn3);
      //�԰�ť����¼�
        btn1.addActionListener(new ActionListener(){
			@SuppressWarnings("null")
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//��ȡ�ı����ֵ
				String a_1 = t1.getText().trim();
				String a_2 = t2.getText().trim();
				String a_3 = t3.getText().trim();
				String a_4 = t4.getText().trim();
				String a_5 = t5.getText().trim();
				String a_6 = t6.getText().trim();
				String a_7 = t7.getText().trim();
				String a_8 = t8.getText().trim();
				String a_9 = t9.getText().trim();
				//����
				try {
					Deposit(a_1,a_2,a_3,a_4,a_5,a_6,a_7,a_8,a_9);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}JOptionPane.showMessageDialog(null,"ѡ�γɹ���");
			}});
        btn2.addActionListener(new ActionListener(){
			@SuppressWarnings("null")
			@Override
			public void actionPerformed(ActionEvent e) {
				//��ȡ�ı����ֵ
				String a_1 = t1.getText().trim();
				String a_2 = t2.getText().trim();
				String a_3 = t3.getText().trim();
				String a_4 = t4.getText().trim();
				try {
					Deposit_1(a_1,a_2,a_3,a_4);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}JOptionPane.showMessageDialog(null,"ȡ���ɹ���");
			}});
        btn3.addActionListener(new ActionListener(){
			@SuppressWarnings("null")
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					View m = new View();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}});
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);}
	public static void main(String[] args) {
		Elective frm = new Elective();		// ��������	
}
	private static void Deposit(String a_1,String a_2,String a_3,String a_4,String a_5,String a_6,String a_7,String a_8,String a_9) throws Exception{
		 String path = "d:/test.txt";
	        File file = new File(path);
	        BufferedWriter buf = null;
	        buf = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
	        buf.write("����:"+a_1+"   ѧ��:"+a_2+"   �Ա�:"+a_3+"   �γ�����:"+a_4+"\n�γ����:"+a_5+"   ��ʦ����:"+a_6+"   �Ͽεص�:"+a_7+"   ��ʱ:"+a_8+"Сʱ"+"   ѧ��:"+a_9);
	        buf.close(); 
	}
	private static void Deposit_1(String a_1,String a_2,String a_3,String a_4) throws Exception{
		 String path = "d:/test.txt";
	        File file = new File(path);
	        BufferedWriter buf = null;
	        buf = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
	        buf.write("����:"+a_1+"   ѧ��:"+a_2+"   �Ա�:"+a_3+"   �γ�����:"+a_4+"\n�γ����:null");
	        buf.close(); 
	}
}	

