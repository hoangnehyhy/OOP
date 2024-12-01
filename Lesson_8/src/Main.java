public class Main {
    public static void main(String[] args) {
        CongTy congTy = new CongTy("Global-ICT Company");


        congTy.setLoiNhuan(1000000);

        NhanVien cb1 = new CanBoCoHuu("Nguyen Duc HOang 1", 5000, 2.5);
        NhanVien cb2 = new CanBoCoHuu("Nguyen Duc Hoang 2", 4000, 2.0);
        NhanVien hd1 = new CanBoHopDong("Nguyen Duc Hoang 3", 3000);

        NhanVien gd = new GiamDoc("Nguyen Duc Hoang 4", 7000, 3.0, 2000, congTy); // 5% lợi nhuận.
        NhanVien tp = new TruongPhong("Nguyen Duc Hoang 5", 6000, 2.5, 1500, congTy); // 0.2% lợi nhuận.

        congTy.themNV(cb1);
        congTy.themNV(cb2);
        congTy.themNV(hd1);
        congTy.themNV(gd);
        congTy.themNV(tp);

        congTy.inThongTin();
        System.out.println("Tổng lương công ty: " + congTy.tinhTongLuong());
    }
}
