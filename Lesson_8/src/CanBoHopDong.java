public class CanBoHopDong extends NhanVien {
    private double luongHopDong;

    public CanBoHopDong(String tenNhanVien, double luongHopDong){
        super(tenNhanVien);
        this.luongHopDong = luongHopDong;
    }

    @Override
    public double tinhLuong(){
        return luongHopDong;
    }
}
