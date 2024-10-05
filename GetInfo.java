package EmployeePayroll;

public class GetInfo {
	
	String name,pos;
	int idNum;
	int numDays,rate,hp,ss,pen;
	
	GetInfo(String name, String pos, int idNum,
			int numDays, int rate,
			int hp, int ss, int pen){
		
		this.name = name;
		this.pos = pos;
		this.idNum = idNum;
		this.numDays = numDays;
		this.rate = rate;
		this.hp = hp;
		this.ss = ss;
		this.pen = pen;
		
	}
}
