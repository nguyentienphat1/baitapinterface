import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


    TaiLieu tl2 = new Sach();
    TaiLieu tl3 = new Dia();
    Dstailieu Tl4 = new Dstailieu();
    ArrayList<TaiLieu> ds =new ArrayList<>();
    for (int i =0;i<1;i++){

        tl2.nhap();
        tl3.nhap();
//        tl2.xuat();
//        tl3.xuat();
//        Tl4.xuat();
//        Tl4.TimKiem();
        ds.add(tl2);
        ds.add(tl3);

     }




    for (int i=0;i< ds.size();i++){
    ds.get(i).nhap();
    Tl4.TimKiem();
    ds.get(i).xuat();
    Tl4.xuat();
    }
    }
}