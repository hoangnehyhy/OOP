import java.util.ArrayList;

public class CongTy {
    public static double getLoiNhuan;
    private String tenCongTy;
    private ArrayList<NhanVien> danhSachNhanVien;
    private double loiNhuan;
    private int SO_NV_MAX = 100;

    public CongTy(String tenCongTy) {
        this.tenCongTy = tenCongTy;
        this.danhSachNhanVien = new ArrayList<>();
        this.loiNhuan = 0;
    }

    public boolean themNV(NhanVien nv) {
        if (danhSachNhanVien.size() < SO_NV_MAX) {
            return danhSachNhanVien.add(nv);
        }
        System.out.println("Số nhân viên đã đạt mức tối đa!");
        return false;
    }

    public void setLoiNhuan(double loiNhuan) {
        this.loiNhuan = loiNhuan;
    }

    public double getLoiNhuan() {
        return loiNhuan;
    }

    public void inThongTin() {
        System.out.println("Công ty: " + tenCongTy);
        for (NhanVien nv : danhSachNhanVien) {
            nv.inThongTin();
        }
    }

    public double tinhTongLuong() {
        double tongLuong = 0;
        for (NhanVien nv : danhSachNhanVien) {
            tongLuong += nv.tinhLuong();
        }
        return tongLuong;
    }
}
