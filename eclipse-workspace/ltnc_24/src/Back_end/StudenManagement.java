package Back_end;

import java.util.ArrayList;

public class StudenManagement {
	ArrayList<Struden> sv = new ArrayList<Struden>();
	public void addSV(Struden sr) {
		boolean f = true;
		for(Struden s : sv) {
			if(sr.getIdN().equals(s.getIdN())) {
				f= false;
			}
		}
		if(f) {
			sv.add(sr);
		}
	}
	
	public  Struden sinhVien(String name, String idN) {
		for(Struden s : sv) {
			if(name.equals(s.getName()) && idN.equals(s.getIdN())) {
				return s;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return "StudenManagement [sv=" + sv + "\n " + "]";
	}
	
}
