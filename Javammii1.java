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
	return "Teachers(教师信息):  姓名：" + Name + "   工号：" + Num + "   年龄："+ Years+"   性别：" + Sex + "   所授课程：" + Lesson;		
	}

}