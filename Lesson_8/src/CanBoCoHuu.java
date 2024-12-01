import java.util.*;

public class CanBoCoHuu extends NhanVien {
    private double luongCoBan;
    private double heSoLuong;

    public CanBoCoHuu(String tenNhanVIen, double luongCoBan, double heSoLuong) {
        super(tenNhanVIen);
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

    @Override
    public double tinhLuong(){
        return heSoLuong * luongCoBan;
    }
}
