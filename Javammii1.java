package Javammi;

public class Javammii1 extends Javammii {
	String Lesson;
	String getLesson() {
	    return Lesson;
	  }
	public Javammii1(String name,int num,int years,String sex,String Lesson) {
		this.Name = name;
		this.Num = num;
		this.Years = years;
		this.Sex = sex;
		this.Lesson = Lesson;
		}
	public String toString() {
	return "Teachers(��ʦ��Ϣ):  ������" + Name + "   ���ţ�" + Num + "   ���䣺"+ Years+"   �Ա�" + Sex + "   ���ڿγ̣�" + Lesson;		
	}

}