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
	return "Students(ѧ����Ϣ):  ������" + Name + "   ѧ�ţ�" + Num + "   �Ա�" + Sex + "   ���䣺" + Years + "   ���ڰ༶��" + Clas_s + "   ��ѡ�γ̣�"+ c;
	}
	public void setName(String name){
		Name = name;
	}
	
	public void setCourse(Javammii2 b){
		this.c = b;
	}

}