package Bai_1;

public class LenhBan extends GiaoDich{
	private int soluongBan;
	

	public LenhBan(String maSo, String ngayThucHien, int soluongBan) {
		super(maSo, ngayThucHien);
		this.soluongBan = soluongBan;
	}

	protected int getSoluongBan() {
		return soluongBan;
	}

	protected void setSoluongBan(int soluongBan) {
		this.soluongBan = soluongBan;
	}

	@Override
	public String toString() {
		return "LenhBan [soluongBan=" + soluongBan + "]";
	}
}
