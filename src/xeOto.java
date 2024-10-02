import java.util.Scanner;

public class xeOto extends Xe{
    private int soChoNgoi;
    private String kieuDongCo;

    @Override
    public String toString() {
        return "xeOto{" +
                "soChoNgoi=" + soChoNgoi +
                ", kieuDongCo='" + kieuDongCo + '\'' +
                '}';
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sr=new Scanner(System.in);
        System.out.printf("nhap so cho ngoi cua xe");
        this.soChoNgoi=sr.nextInt();
        System.out.printf("nhap kieu dong co");
        this.kieuDongCo=sr.nextLine();
        sr.nextLine();
    }

    @Override
    public void hienThongTin() {
        super.hienThongTin();
        System.out.printf(this.toString());
    }
}
