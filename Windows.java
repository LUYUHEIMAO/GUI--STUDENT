package Javammi;
import java.awt.Color;
import java.awt.Container;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
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



@SuppressWarnings("serial")
public class Windows extends JFrame{
	public static void main(String[] args) {
		Windows frm = new Windows();		// ��������
		frm.setSize(350, 250);
		frm.setTitle("ѧ��ѡ���˿�ϵͳ");
		Container c = frm.getContentPane();
		c.setBackground(new Color(200, 200, 255));		// ������ɫ������ʹ��RGB����ɫ
		frm.setLayout(null);
		// ������ǩ 
		JLabel L1 = new JLabel("ѧ��: ");
		L1.setBounds(40, 50, 55, 20);
		JLabel L2 = new JLabel("����: ");
		L2.setBounds(40, 80, 55, 20);
		// �����ı���
		final JTextField t1 = new JTextField(50);
		t1.setBounds(100, 50, 150, 20);	
		final JPasswordField t2 = new JPasswordField(50);
		t2.setBounds(100, 80, 150, 20);
		 // ���ð�ť
        Button btn1 = new Button("��¼"); 
        btn1.setBounds(50, 130, 100, 20);
        Button btn2 = new Button("ע��"); 
        btn2.setBounds(180, 130, 100, 20);
		// �������ӵ�������
		frm.add(t1);
		frm.add(L1);
		frm.add(L2);
		frm.add(t2);
	    frm.add(btn1);
        frm.add(btn2);
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
				//����Ա�����
				FileReader fr,fr_1;
				try {
					fr = new FileReader("d:/mima.txt");
					char[] ch = new char[27];
					fr.read(ch);
					fr_1 = new FileReader("d:/new_mima.txt");
					char[] ch_1 = new char[27];
					fr_1.read(ch_1);
					for(int i = 0;i < 27;i++){
						if(ch[i] == ch_1[i]){
							System.out.println(i);
							}
						else{
							JOptionPane.showMessageDialog(null,"�˺����벻��ȷ��");
							//�������
							t1.setText("");
							t2.setText("");
							break;
						}
						if(i == 26){
							Elective m = new Elective();
						}
					}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				
				
				
			}});
        btn2.addActionListener(new ActionListener(){
			@SuppressWarnings("null")
			@Override
			public void actionPerformed(ActionEvent e) {
				Register m = new Register();
//				m.Register();
			}});
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setVisible(true);
	}
	private static void Deposit(String a_1,char[] a_2) throws Exception{
		 String path = "d:/new_mima.txt";
	        File file = new File(path);
	        BufferedWriter buf = null;
	        buf = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
	        buf.write(a_1+a_2);
	        buf.close(); 
	}

}


