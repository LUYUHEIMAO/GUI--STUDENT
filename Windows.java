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
		Windows frm = new Windows();		// 创建窗口
		frm.setSize(350, 250);
		frm.setTitle("学生选课退课系统");
		Container c = frm.getContentPane();
		c.setBackground(new Color(200, 200, 255));		// 设置颜色，这里使用RGB三颜色
		frm.setLayout(null);
		// 创建标签 
		JLabel L1 = new JLabel("学号: ");
		L1.setBounds(40, 50, 55, 20);
		JLabel L2 = new JLabel("密码: ");
		L2.setBounds(40, 80, 55, 20);
		// 创建文本框
		final JTextField t1 = new JTextField(50);
		t1.setBounds(100, 50, 150, 20);	
		final JPasswordField t2 = new JPasswordField(50);
		t2.setBounds(100, 80, 150, 20);
		 // 设置按钮
        Button btn1 = new Button("登录"); 
        btn1.setBounds(50, 130, 100, 20);
        Button btn2 = new Button("注册"); 
        btn2.setBounds(180, 130, 100, 20);
		// 将组件添加到窗口中
		frm.add(t1);
		frm.add(L1);
		frm.add(L2);
		frm.add(t2);
	    frm.add(btn1);
        frm.add(btn2);
        //对按钮添加事件
        btn1.addActionListener(new ActionListener(){
			@SuppressWarnings("null")
			@Override
			public void actionPerformed(ActionEvent e) {	
				//获取文本框的值
				String a_1 = t1.getText().trim();
				char[] a_2 = t2.getPassword();
				//存入
				try {
					Deposit(a_1,a_2);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();}
				//导入对比数据
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
							JOptionPane.showMessageDialog(null,"账号密码不正确！");
							//清空数据
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


