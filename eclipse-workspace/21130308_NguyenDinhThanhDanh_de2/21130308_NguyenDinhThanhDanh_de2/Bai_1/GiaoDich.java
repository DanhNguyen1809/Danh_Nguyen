package Bai_1;

import java.util.ArrayList;

public abstract class GiaoDich {
	private String maSo;
	private String ngayThucHien;
	public GiaoDich(String maSo, String ngayThucHien) {
		super();
		this.maSo = maSo;
		this.ngayThucHien = ngayThucHien;
	}
	public String getMaSo() {
		return maSo;
	}
	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}
	public String getNgayThucHien() {
		return ngayThucHien;
	}
	public void setNgayThucHien(String ngayThucHien) {
		this.ngayThucHien = ngayThucHien;
	}
	@Override
	public String toString() {
		return "GiaoDich [maSo=" + maSo + ", ngayThucHien=" + ngayThucHien + "]";
	}

}
