package Back_end;

import java.util.ArrayList;

public class Subject {
	String tMonHoc;
	String idMH;
	ArrayList<Point> points = new ArrayList<Point>();
	public Subject(String tMonHoc, String idMH) {
		this.tMonHoc = tMonHoc;
		this.idMH = idMH;

	}
	public String gettMonHoc() {
		return tMonHoc;
	}
	public void settMonHoc(String tMonHoc) {
		this.tMonHoc = tMonHoc;
	}
	public String getIdMH() {
		return idMH;
	}
	public void setIdMH(String idMH) {
		this.idMH = idMH;
	}

	
	public void addPoint(Point p) {
		if(p.getPoint()>=0 && p.getPoint()<=10) {
			points.add(p);
		}
	}
	
	public double diemTB() {
		double result=0;
		double sum = 0;
		for(Point p : points) {
			sum += p.getPoint() ;
			result = sum/points.size();
		}
		
		return result;
	}
	@Override
	public String toString() {
		return "Subject [tMonHoc=" + tMonHoc + ", idMH=" + idMH  + ", points=" + points + "]";
	}
	
}
