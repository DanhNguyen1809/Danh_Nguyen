package Bai_1;

public class LenhMua extends GiaoDich{
	private int soluongMua;

	public LenhMua(String maSo, String ngayThucHien, int soluongMua) {
		super(maSo, ngayThucHien);
		this.soluongMua = soluongMua;
	}
	public int getSoluongMua() {
		return soluongMua;
	}
	public void setSoluongMua(int soluongMua) {
		this.soluongMua = soluongMua;
	}
	@Override
	public String toString() {
		return "LenhMua [soluongMua=" + soluongMua + "]";
	}
	
}
