package Javammi;

public class Javammii2 extends Javammii {
	String Place;
	String getPlace() {
	    return Place;
	  }
	float Time;
	float getTime() {
	    return Time;
	  }
	float Score;
	float getScore() {
	    return Score;
	  }
	public Javammii2(String name,int num,String place,float time,float score) {
		this.Name = name;
		this.Num = num;
		this.Place = place;
		this.Time = time;
		this.Score = score;
		}		
	public String toString() {
	return "    �γ����ƣ�" + Name + "   �γ̱�ţ�" + Num + "   �Ͽεص㣺" + Place + "   �γ�ʱ�䣺" + Time + "Сʱ" + "   �γ�ѧ�֣�" +  Score + "��";
	}

}