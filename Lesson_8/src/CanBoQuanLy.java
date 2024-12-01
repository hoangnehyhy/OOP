public class CanBoQuanLy extends NhanVien implements QuanLy{
    protected double luongCoBan;
    protected double heSoLuong;
    public CanBoQuanLy(String tenNhanVien, double luongCoBan, double heSoLuong, CongTy CongTy) {
        super(tenNhanVien);
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
        this.CongTy = CongTy;
    }

    @Override
    public double tinhHoaHong(){
        return 0.002 * CongTy.getLoiNhuan;
    }

    @Override
    public double tinhLuong(){
        return luongCoBan * heSoLuong + tinhHoaHong();
    }
}
