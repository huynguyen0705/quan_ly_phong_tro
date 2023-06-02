import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isRunning = true;
        while (isRunning) {
            try {
                System.out.println("Nhập số phòng trọ: ");
                Scanner scanner = new Scanner(System.in);
                int soPhong = scanner.nextInt();
                PhongTro[] DsPhong = new PhongTro[soPhong];
                for (int i = 0; i < DsPhong.length; i++) {
                    System.out.println("nhập thông tin phòng trọ thứ " + (i + 1) + ":");
                    System.out.println("nhập họ tên: ");
                    String hoTen = scanner.next();
                    System.out.println("nhập tuổi: ");
                    int tuoi = scanner.nextInt();
                    System.out.println("nhập năm sinh: ");
                    int namSinh = scanner.nextInt();
                    System.out.println("nhập cccd: ");
                    int cccd = scanner.nextInt();
                    System.out.println("nhập số ngày trọ: ");
                    int soNgayTro = scanner.nextInt();
                    System.out.println("nhập loại phòng: ");
                    String loaiPhong = scanner.next();
                    System.out.println("nhập giá phòng: ");
                    double giaPhong = scanner.nextDouble();
                    CaNhan caNhan = new CaNhan(hoTen, tuoi, namSinh, cccd, soNgayTro, loaiPhong, giaPhong);
                    DsPhong[i] = caNhan;
                    caNhan.HienThi();
                }
            } catch (InputMismatchException e) {
                System.out.println("nhập sai kiểu");
            }
        }
    }
}