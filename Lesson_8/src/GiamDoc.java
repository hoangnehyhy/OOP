import javax.print.Doc;
import java.util.*;

public class GiamDoc extends CanBoQuanLy{
    protected double phuCap;

    public GiamDoc(String tenNhanVien, double luongCoBan, double heSoLuong, double phuCap, CongTy CongTy){
        super(tenNhanVien,luongCoBan, heSoLuong, CongTy);
        this.phuCap = phuCap;
    }

    @Override
    public double tinhHoaHong(){
        return 0.05 * CongTy.getLoiNhuan;
    }

    @Override
    public double tinhLuong(){
        return (heSoLuong * luongCoBan) + tinhHoaHong() + phuCap;
    }
}
