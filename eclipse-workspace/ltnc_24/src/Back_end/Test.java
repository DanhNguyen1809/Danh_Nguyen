package Back_end;

public class Test {

	
	
	public static void main(String[] args) {
		Point p1 = new Point(8);
		Point p2 = new Point(9);
		Point p3 = new Point(5);
		Point p4 = new Point(7);
		
		Struden s1 = new Struden("Nguyen Dinh Thanh Danh", "1234", "18/9/2003");
		Struden s2 = new Struden("Bao Khang", "3456", "18/9/2003");
		
		Subject sb1 = new Subject("Toan", "12");
		Subject sb2 = new Subject("Toan", "11");
		StudenManagement st = new StudenManagement();
		
		
		
		sb1.addPoint(p4);
		sb1.addPoint(p2);
		s1.addMH(sb1);
		s1.addMH(sb2);
		st.addSV(s1);
		st.addSV(s2);
//		st.sinhVien("Nguyen Dinh Thanh Danh", "1234");
		System.out.println(st);
		
	
	//	System.out.println(s1);
//		System.out.println(sb1);
	}

	
	
}
