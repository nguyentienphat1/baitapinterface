import java.util.Scanner;

public class Sach extends TaiLieu{
    private String TacGia;
    private int SoTrang;

    public Sach(String ten, String tacGia, int soTrang) {
        super(ten);
        TacGia = tacGia;
        SoTrang = soTrang;
    }

    public Sach() {
        TacGia = null;
        SoTrang = 0;
    }

    public String getTacGia() {
        return TacGia;
    }

    public void setTacGia(String tacGia) {
        TacGia = tacGia;
    }

    public int getSoTrang() {
        return SoTrang;
    }

    public void setSoTrang(int soTrang) {
        SoTrang = soTrang;
    }
    public void nhap(){
        super.nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap tac gia" );
        TacGia = scanner.nextLine();
        System.out.println(" nhap so trang");
        SoTrang = scanner.nextInt();
    }
    @Override
    public void xuat(){
        System.out.println("ten sach la : "+getTen());
        System.out.println(" tac gia la : "+getTacGia());
        System.out.println("so trang la : "+getSoTrang());
    }
}
