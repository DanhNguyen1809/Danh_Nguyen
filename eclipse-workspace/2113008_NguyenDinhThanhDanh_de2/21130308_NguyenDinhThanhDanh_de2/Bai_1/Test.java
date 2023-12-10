package Bai_1;

public class Test {

	
	public static void main(String[] args) {
		LenhBan lb1 = new LenhBan("112", "12/7/2023", 4);
		LenhBan lb2 = new LenhBan("113","22/7/2023",10);
		LenhBan lb3 = new LenhBan("114","30/7/2023",9);
		LenhBan lb4 = new LenhBan("115","31/7/2023",10);
		LenhBan lb5 = new LenhBan("116","1/8/2023",8);
		
		LenhMua lm1 = new LenhMua( "234", "1/7/2023", 10);
		LenhMua lm2 = new LenhMua("235", "12/7/2023", 1);
		LenhMua lm3 = new LenhMua("236", "18/7/2023", 2);
		LenhMua lm4 = new LenhMua("237", "29/7/2023", 8);
		LenhMua lm5 = new LenhMua("238", "30/7/2023", 7);

		TaiKhoanChungKhoan tk = new TaiKhoanChungKhoan("18092003", "NguyenDinhThanhDAnh", 30000000, 100);
		
		tk.addLenhBan(lb1);
		tk.addLenhBan(lb2);
		tk.addLenhBan(lb3);
		tk.addLenhBan(lb4);
		tk.addLenhBan(lb5);
		
		tk.addLenhMua(lm1);
		tk.addLenhMua(lm2);
		tk.addLenhMua(lm3);
		tk.addLenhMua(lm4);
		tk.addLenhMua(lm5);
		
		
		System.out.println(tk.coPhieuBan());
		System.out.println(tk.check(lm4, lm1));
		
	}
	

}
