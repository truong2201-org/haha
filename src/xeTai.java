import java.util.Scanner;

public class xeTai extends Xe{
    private double trongTai;

    @Override
    public String toString() {
        return "xeTai{" +
                "trongTai=" + trongTai +
                '}';
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sr=new Scanner(System.in);
        System.out.printf("nhap trong tai xe");
        this.trongTai=sr.nextDouble();
        sr.nextLine();
    }

    @Override
    public void hienThongTin() {
        super.hienThongTin();
        System.out.printf(this.toString());
    }
}
