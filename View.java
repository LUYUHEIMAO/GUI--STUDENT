package Javammi;

import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class View extends JFrame{
	View() throws IOException{
		super("�鿴ѡ��ҳ��");
		setSize(500, 500);
		Container c = getContentPane();
		c.setBackground(new Color(200, 200, 255));		// ������ɫ������ʹ��RGB����ɫ
		setLayout(null);
		//�����ı���
		final TextArea textArea = new TextArea();
		textArea.setBounds(50, 50, 350, 350);
		 // ���ð�ť
        Button btn = new Button("�鿴");
        btn.setBounds(185, 25, 100, 20);
		// �������ӵ�������
		add(btn);
		add(textArea);
		//�԰�ť����¼�
		btn.addActionListener(new ActionListener(){
			@SuppressWarnings("null")
			@Override

			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				File file = new File("d:/test.txt");
				if (file.exists() && file.isFile()) {
				try {
				BufferedReader input = new BufferedReader(
				new FileReader(file));
				String text;
				while ((text = input.readLine()) != null)
				textArea.setText(textArea.getText() + text + "\n");
				} catch (IOException ioException) {
				System.err.println("File Error!");
				}}}}); 	
			
		
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) throws IOException {
		View frm = new View();		// ��������	
}}
