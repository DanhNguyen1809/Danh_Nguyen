package Back_end;

import java.util.ArrayList;

public class Struden {
	private String name;
	private String idN;
	private String  dayB; //ngay thang nam sinh
	private ArrayList<Subject> arrmH = new ArrayList<Subject>();
	public Struden(String name, String idN, String dayB) {
		super();
		this.name = name;
		this.idN = idN;
		this.dayB = dayB;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdN() {
		return idN;
	}
	public void setIdN(String idN) {
		this.idN = idN;
	}
	public String getDayB() {
		return dayB;
	}
	public void setDayB(String dayB) {
		this.dayB = dayB;
	}
	
	public void addMH(Subject s) {
		boolean f = true;
		
		for(Subject s1 : arrmH) {
			if(s.gettMonHoc().equals(s1.gettMonHoc())) {
				f = false;
				
			}
			
		}
		
		if(f) {
			arrmH.add(s);
		}
	}
	
	@Override
	public String toString() {
		return "Struden [name=" + name + ", idN=" + idN + ", dayB=" + dayB + ", \n" + arrmH + "\n"+ "]";
	}

	

	
}
