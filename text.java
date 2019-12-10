package Javammi;
import Javammi.*;
import java.util.Scanner;
public class text {
	public static void main (String args[]){
		Javammii0 s;
		Javammii1 t;
		Javammii2 c;
		Javammii2 d=null;
		
		s = new Javammii0("张三",2018310701,"男",19,"自181");
		System.out.println("请选择你要选择的课程：1）计算机导论   2）高等数学   3）大学物理");
		Scanner input=new Scanner(System.in);
		int j=input.nextInt();
		if(j==1){
			s.setCourse(new Javammii2("计算机导论",71,"教100",8,2));
			t = new Javammii1("王小明",001,45,"男","计算机导论");
			System.out.println(s.toString());
			System.out.println(t.toString());
		}
		else if(j==2){
			s.setCourse(new Javammii2("高等数学",72,"教104",8,5));
			t = new Javammii1("李三",005,60,"男","高等数学");
			System.out.println(s.toString());
			System.out.println(t.toString());
		}
		else if(j==3){
			s.setCourse(new Javammii2("大学物理",73,"教204",8,4));
			t = new Javammii1("李飒",015,36,"女","大学物理");
			System.out.println(s.toString());
			System.out.println(t.toString());
		}
		

		System.out.println("退：1     不退：0");
		Scanner input1=new Scanner(System.in);
		int i=input1.nextInt();
		if(i==1){
			s.setCourse(d);
			System.out.println(s.toString());
		}
		else
			System.out.println("结束");
	
	}
}
