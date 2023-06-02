public class CaNhan extends PhongTro {
    private String HoTen;
    private int Tuoi;
    private int NamSinh;
    private int Cccd;


    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int tuoi) {
        Tuoi = tuoi;
    }

    public int getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(int namSinh) {
        NamSinh = namSinh;
    }

    public int getCccd() {
        return Cccd;
    }

    public void setCccd(int cccd) {
        Cccd = cccd;
    }
    public CaNhan(String hoTen, int tuoi, int namSinh, int cccd, int soNgayTro, String loaiPhong, double giaPhong){
        setHoTen(hoTen);
        setTuoi(tuoi);
        setNamSinh(namSinh);
        setCccd(cccd);
        setSoNgayTro(soNgayTro);
        setLoaiPhong(loaiPhong);
        setGiaPhong(giaPhong);
    }
    public void HienThi(){
        System.out.println("tên: "+getHoTen());
        System.out.println("tuổi: "+getTuoi());
        System.out.println("năm sinh: "+getNamSinh());
        System.out.println("cccd: "+getCccd());
        System.out.println("số ngày trọ: "+getSoNgayTro());
        System.out.println("loại phòng: "+getLoaiPhong());
        System.out.println("giá phòng: "+getGiaPhong());
    }
}
