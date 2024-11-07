package b1;

 	class NhanVien{
    public String tenNhanVien;
    public double luongCoBan;
    public double heSoLuong;
    public double LUONG_MAX;
    /* set-get tenNhanVien */
    public boolean setTenNhanVien(String tnv) {
        if(tnv.trim().equals("")){
            System.out.println("Khong the thiet lap duoc ten nhan vien la rong");
            return false;
        }
        else{
            tenNhanVien = tnv;
            return true;
        }
    }
 
    public String getTenNhanVien(){
        return tenNhanVien;
    }
    /* set-get luongCoBan */
    public boolean setLuongCoBan(double lcb) {
        if(lcb <= 0){
            System.out.println("Khong the thiet lap duoc luong co ban <= 0");
            return false;
        }
        if(lcb*heSoLuong <= LUONG_MAX){
            luongCoBan = lcb;
            return true;
        }
        else{
            System.out.println("Khong the thiet lap duoc luong co ban");
            return false;
        }
    }
    public double getLuongCoBan() {
        return luongCoBan;
    }
    /* set-get heSoLuong */
    public boolean setHeSoLuong(double hsl) {
        if(hsl <= 0){
            System.out.println("Khong the thiet lap duoc he so luong <= 0");
            return false;
        }
        if(luongCoBan*hsl <= LUONG_MAX){
            heSoLuong = hsl;
            return true;
        }
        else{
            System.out.println("Khong the thiet lap duoc he so luong");
            return false;
        }
    }
    public double getHeSoLuong() {
        return heSoLuong;
    }
    /* set-get LUONG_MAX */
    public void setLUONG_MAX(double lm) {
        LUONG_MAX = lm;
    }
    public double getLUONG_MAX() {
        return LUONG_MAX;
    }
    /* cac phuong thuc khac */
    public double tinhLuong(){
        return luongCoBan*heSoLuong;
    }
    public boolean tangLuong(double hsl_moi){
        if(hsl_moi<=0) {
            System.out.println("Khong the thiet lap duoc he so luong moi do < 0");
            return false;
        }
        if(hsl_moi*luongCoBan > LUONG_MAX){
            System.out.println("Khong tang luong cho nhan vien "+tenNhanVien+" vi vuot qua gioi han luong");
            return false;
        }
        else{
            heSoLuong = hsl_moi;
            return true;
        }
    }
    public void inInformation(){
        System.out.println("Nhan vien co ten:'"+this.tenNhanVien+"' co luong co ban "+this.luongCoBan+" co he so luong "+this.heSoLuong+" co luong la "+tinhLuong());
    }
}	
public class Lithuyet_1 {
	public static void main(String args[]) {
		NhanVien T1 = new NhanVien();
        NhanVien T2 = new NhanVien();
        NhanVien T3 = new NhanVien();
        T1.setTenNhanVien("Quoc Tuan");
        T2.setTenNhanVien("Trong Tuan");
        T3.setTenNhanVien("   ");
        T3.setTenNhanVien("Hoang Duc");
        T1.setLuongCoBan(2000000);
        T2.setLuongCoBan(2000000);
        T3.setLuongCoBan(2000000);
        T1.setHeSoLuong(6.5);
        T2.setHeSoLuong(5.1);
        T3.setHeSoLuong(5.1);        
        T1.tangLuong(16.5);
        T2.tangLuong(7.5);
        T1.inInformation();
        T2.inInformation();
        T3.inInformation();
	}
}
