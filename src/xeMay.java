import java.util.Scanner;

public class xeMay extends Xe{
    private String phanKhoi;

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sr=new Scanner(System.in);
        System.out.printf("nhap phan khoi xe");
        this.phanKhoi=sr.nextLine();
    }

    @Override
    public void hienThongTin() {
        super.hienThongTin();
        System.out.printf(this.toString());
    }

    @Override
    public String toString() {
        return "xeMay{" +
                "phanKhoi='" + phanKhoi + '\'' +
                '}';
    }
}
