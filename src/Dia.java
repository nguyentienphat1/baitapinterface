import java.util.Scanner;

public class Dia extends TaiLieu{
    private float DungLuong;

    public Dia(String ten, float dungLuong) {
        super(ten);
        DungLuong = dungLuong;
    }

    public Dia() {
        DungLuong = 0.0f;
    }

    public float getDungLuong() {
        return DungLuong;
    }

    public void setDungLuong(float dungLuong) {
        DungLuong = dungLuong;
    }
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap dung luong");
        DungLuong = scanner.nextFloat();
    }
    @Override
    public void xuat(){
        System.out.println("dung luong cua sach la : "+getDungLuong());
    }
}
