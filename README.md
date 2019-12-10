# GUI--STUDENT
## 一、实验目的
分析学生选课系统<br>
使用GUI窗体及其组件设计窗体界面<br>
完成学生选课过程业务逻辑编程<br>
基于文件保存并读取数据处理异常
## 二、实验要求
1、设计GUI窗体，支持学生注册、课程新加、学生选课、学生退课、打印学生选课列表等操作。<br>
2、基于事件模型对业务逻辑编程，实现在界面上支持上述操作。<br>
3、针对操作过程中可能会出现的各种异常，做异常处理。<br>
4、基于输入/输出编程，支持学生、课程、教师等数据的读写操作。<br>
5、基于Github提交实验
## 三、实验过程
以学生选课退课系统窗口为第一页面，添加注册和登录按钮。注册按钮切出学生注册页面窗口，添加确定和重置按钮；对确定按钮添加事件，利用io流将数据进行存储进mima.txt；对重置按钮添加事件，按下后清除文本框内信息。对登录按钮添加事件，先利用io流将学号、密码存入new_mima.txt文件，再将new_mima.txt和mima.txt文件导入数组，进行比对，一致则登录进入学生选课页面，反之则提示学号密码错误。在学生选课页面输入选课信息确定选课后进行储存，取消学科后进行删除，查看选课可进入查看选课页面进行查看。
## 四、核心代码
//登录按钮对学号密码比对
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
//将注册信息存入
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
				JOptionPane.showMessageDialog(null,"成功！");
			}});
      	private static void Deposit(String a_1,char[] a_2) throws Exception{
		 String path = "d:/mima.txt";
	        File file = new File(path);
	        BufferedWriter buf = null;
	        buf = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
	        buf.write(a_1+a_2);
	        buf.close(); 
	}
}
//将选课信息导入文本域
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
## 五、流程图
![image](https://github.com/LUYUHEIMAO/GUI--STUDENT/blob/master/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20191210181647.png)
## 六、运行截图
![image](https://github.com/LUYUHEIMAO/GUI--STUDENT/blob/master/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_201912101816471.png)<br>
![image](https://github.com/LUYUHEIMAO/GUI--STUDENT/blob/master/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_201912101816472.png)<br>
![image](https://github.com/LUYUHEIMAO/GUI--STUDENT/blob/master/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_201912101816473.png)<br>
![image](https://github.com/LUYUHEIMAO/GUI--STUDENT/blob/master/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_201912101816474.png)
## 七、编程感想
