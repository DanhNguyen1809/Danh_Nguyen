package Bai_1;

import java.util.ArrayList;

public class TaiKhoanChungKhoan {
	private String soTK;
	private String chuTK;
	private double soTienDu;
	private double soluongCP;
	 ArrayList<GiaoDich> danhsachGD = new ArrayList<>();

	
	public TaiKhoanChungKhoan(String soTK, String chuTK, double soTienDu, double soluongCP) {
		this.soTK = soTK;
		this.chuTK = chuTK;
		this.soTienDu = soTienDu;
		this.soluongCP = soluongCP;
		this.danhsachGD = new ArrayList<>();
	}
	public String getSoTK() {
		return soTK;
	}
	public void setSoTK(String soTK) {
		this.soTK = soTK;
	}
	public String getChuTK() {
		return chuTK;
	}
	public void setChuTK(String chuTK) {
		this.chuTK = chuTK;
	}
	public double getSoTienDu() {
		return soTienDu;
	}
	public void setSoTienDu(double soTienDu) {
		this.soTienDu = soTienDu;
	}
	public double getSoluongCP() {
		return soluongCP;
	}
	public void setSoluongCP(double soluongCP) {
		this.soluongCP = soluongCP;
	}
	
	
	public void addLenhBan(LenhBan lb) {
		danhsachGD.add(lb);
	}
	
	public void addLenhMua(LenhMua lm) {
		danhsachGD.add(lm);
	}
	
	public int coPhieuBan() {
		int result=0;
		for(GiaoDich g : danhsachGD) {
			if(g instanceof LenhBan) {
			result+= ((LenhBan) g).getSoluongBan();
			}
		}
		return result;
	}
	
	public boolean check(GiaoDich g1,GiaoDich g2) {
		if(g1.getClass().getSimpleName().equals(g2.getClass().getSimpleName())) {
			return true;
		}
		return false;
	}
	@Override
	public String toString() {
		return "TaiKhoanChungKhoan [soTK=" + soTK + ", chuTK=" + chuTK + ", soTienDu=" + soTienDu + ", soluongCP="
				+ soluongCP + ", danhsachGD=" + danhsachGD + "]";
	}
	
}
