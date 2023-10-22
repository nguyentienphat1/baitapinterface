import java.util.ArrayList;
import java.util.Scanner;

public class Dstailieu {

    ArrayList<TaiLieu> DanhsachTl;

    public ArrayList<TaiLieu> getDanhsachTl() {
        return DanhsachTl;
    }

    public void setDanhsachTl(ArrayList<TaiLieu> danhsachTl) {
        DanhsachTl = danhsachTl;
    }

    public void Them(){
        TaiLieu TL = new Sach() ;
        TL.nhap();
        TaiLieu TL1= new Dia();
        TL1.nhap();
        DanhsachTl.add(TL);
        DanhsachTl.add(TL1);
    }
    public void TimKiem(){
        String timkim;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ten sach can tim");
        timkim = scanner.nextLine();
        int dem=0;
        for (int i =0;i<DanhsachTl.size();i++){
            if (DanhsachTl.get(i).getTen().equals(timkim)){
                dem++;
                System.out.println(" sach can tim kiem : "+DanhsachTl.get(i));
            }else if (dem==0){
                System.out.println("khong co sach phu hop");
            }
        }
    }
    public void xoa(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap  ten sach can xoa");
        String xoa = scanner.nextLine();
        for (int i =0;i<DanhsachTl.size();i++){
            if (DanhsachTl.get(i).getTen().equals(xoa)){
                DanhsachTl.remove(xoa);
            }
        }
    }
    public void Sua(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" chon 1 : them sach ");
        System.out.println(" chon 2 xoa sach ");
        System.out.println("moi chon");
        int chon = scanner.nextInt();
        switch(chon){
            case 1 :
                System.out.println("them bao nhieu sach");
                int baonhieu = scanner.nextInt();
                for (int i=0;i<baonhieu;i++){
                    Them();
                }
                break;
            case 2:
                xoa();
                break;
        }
    }



    public void xuat() {
        for (int i=0;i<DanhsachTl.size();i++){
            DanhsachTl.get(i).xuat();
        }
    }
}
