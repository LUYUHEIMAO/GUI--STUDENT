package Javammi;
import Javammi.*;
import java.util.Scanner;
public class text {
	public static void main (String args[]){
		Javammii0 s;
		Javammii1 t;
		Javammii2 c;
		Javammii2 d=null;
		
		s = new Javammii0("����",2018310701,"��",19,"��181");
		System.out.println("��ѡ����Ҫѡ��Ŀγ̣�1�����������   2���ߵ���ѧ   3����ѧ����");
		Scanner input=new Scanner(System.in);
		int j=input.nextInt();
		if(j==1){
			s.setCourse(new Javammii2("���������",71,"��100",8,2));
			t = new Javammii1("��С��",001,45,"��","���������");
			System.out.println(s.toString());
			System.out.println(t.toString());
		}
		else if(j==2){
			s.setCourse(new Javammii2("�ߵ���ѧ",72,"��104",8,5));
			t = new Javammii1("����",005,60,"��","�ߵ���ѧ");
			System.out.println(s.toString());
			System.out.println(t.toString());
		}
		else if(j==3){
			s.setCourse(new Javammii2("��ѧ����",73,"��204",8,4));
			t = new Javammii1("���",015,36,"Ů","��ѧ����");
			System.out.println(s.toString());
			System.out.println(t.toString());
		}
		

		System.out.println("�ˣ�1     ���ˣ�0");
		Scanner input1=new Scanner(System.in);
		int i=input1.nextInt();
		if(i==1){
			s.setCourse(d);
			System.out.println(s.toString());
		}
		else
			System.out.println("����");
	
	}
}
