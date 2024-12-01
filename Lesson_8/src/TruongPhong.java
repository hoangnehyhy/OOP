import java.util.*;

public class TruongPhong extends CanBoQuanLy{
    protected double phuCap;

    public TruongPhong(String tenNhanVien, double luongCoBan, double heSoLuong,double phuCap, CongTy CongTy) {
        super(tenNhanVien, luongCoBan, heSoLuong, CongTy);
        this.phuCap = phuCap;
    }

    @Override
    public double tinhHoaHong(){
        return 0;
    }

    @Override
    public double tinhLuong(){
        return (luongCoBan * heSoLuong) + phuCap;
    }

}