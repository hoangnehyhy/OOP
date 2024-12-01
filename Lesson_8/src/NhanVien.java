import java.util.*;

public abstract class NhanVien {
    protected String tenNhanVien;
    protected CongTy CongTy ;

    public NhanVien(String tenNhanVIen) {
        this.tenNhanVien = tenNhanVIen;
    }

    public abstract double tinhLuong();
    public void inThongTin(){
        System.out.println("Tên nhân viên: " + tenNhanVien +", Lương: " + tinhLuong());
    }

}
