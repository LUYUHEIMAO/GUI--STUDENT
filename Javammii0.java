package Javammi;

public class Javammii0 extends Javammii {
	Javammii2 c;

	String   Clas_s;
	String getClas_s() {
	    return Clas_s;
	  }

		public Javammii0(String name,int num,String sex,int years,String clas_s) {
		this.Name = name;
		this.Num = num;
		this.Sex = sex;
		this.Years = years;
		this.Clas_s = clas_s;
		}

	public String toString() {
	return "Students(学生信息):  姓名：" + Name + "   学号：" + Num + "   性别：" + Sex + "   年龄：" + Years + "   所在班级：" + Clas_s + "   所选课程："+ c;
	}
	public void setName(String name){
		Name = name;
	}
	
	public void setCourse(Javammii2 b){
		this.c = b;
	}

}