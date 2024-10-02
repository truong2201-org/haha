import java.util.Scanner;

public class Xe {
    private String idXe;

    public String getIdXe() {
        return idXe;
    }

    public void setIdXe(String idXe) {
        this.idXe = idXe;
    }
    public void nhapThongTin(){
        Scanner sr=new Scanner(System.in);
        System.out.printf("nhap hang san xuat");
        this.hangSX=sr.nextLine();
        System.out.printf("nam san xuat");
        this.namSX=sr.nextLine();
        System.out.printf("nhap gia ban");
        this.giaBan=sr.nextLong();
        System.out.printf("màu xe ");
        this.mauXe=sr.nextLine();
        sr.nextLine();
    }
    public void hienThongTin(){
        System.out.printf(this.toStringXe());
    }

    public String toStringXe() {
        return "\nXe{" +
                "idXe='" + idXe + '\'' +
                ", hangSX='" + hangSX + '\'' +
                ", namSX='" + namSX + '\'' +
                ", giaBan=" + giaBan +
                ", mauXe='" + mauXe + '\'' +
                '}';
    }

    private String hangSX;

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    private String namSX;
    private long    giaBan;
    private String mauXe;

}
