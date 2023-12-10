package Back_end;

public class Point {
	double point;

	public Point(double point) {
		super();
		this.point = point;
	}

	public double getPoint() {
		return point;
	}

	public void setPoint(double point) {
		this.point = point;
	}

	@Override
	public String toString() {
		return "Point [point=" + point + "]";
	}
	
}
