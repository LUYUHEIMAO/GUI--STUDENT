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
	return "    课程名称：" + Name + "   课程编号：" + Num + "   上课地点：" + Place + "   课程时间：" + Time + "小时" + "   课程学分：" +  Score + "分";
	}

}