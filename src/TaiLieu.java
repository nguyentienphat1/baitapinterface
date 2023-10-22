import java.util.Scanner;

public abstract class TaiLieu implements Ixuat{
  private String Ten;

    public TaiLieu(String ten) {
        Ten = ten;
    }
    public TaiLieu() {
        Ten = null;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }


    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhap ten tai lieu");
        Ten = scanner.nextLine();
    }
    @Override
    public abstract void xuat();

}
