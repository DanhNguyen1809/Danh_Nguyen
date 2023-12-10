package Bai_1;

public class LenhChuyenNhuong extends GiaoDich{
	private String soTLNhan;
	private int soluongCHuyen;
	
	
	public LenhChuyenNhuong(String maSo, String ngayThucHien, String soTLNhan, int soluongCHuyen) {
		super(maSo, ngayThucHien);
		this.soTLNhan = soTLNhan;
		this.soluongCHuyen = soluongCHuyen;
	}
	public String getSoTLNhan() {
		return soTLNhan;
	}
	public void setSoTLNhan(String soTLNhan) {
		this.soTLNhan = soTLNhan;
	}
	public int getSoluongCHuyen() {
		return soluongCHuyen;
	}
	public void setSoluongCHuyen(int soluongCHuyen) {
		this.soluongCHuyen = soluongCHuyen;
	}
	
	
}
