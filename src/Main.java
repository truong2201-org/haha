import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        QuanLyXe quanLyXe=new QuanLyXe(50);
        boolean tieptuc=true;
        while (true){
            System.out.printf("\nnhap yeu cau\n ");
            System.out.printf("1.them xe\n");
            System.out.printf("2.hien thong tin\n");
            System.out.printf("3.xoa xe\n");
            System.out.printf("4.tim kiem hang xe\n");
            System.out.printf("5.thoat\n");
            Scanner sr=new Scanner(System.in);
            int choist=sr.nextInt();
            sr.nextLine();
            switch (choist){
                case 1 :quanLyXe.them();break;
                case 2:quanLyXe.hienThongTin();break;
                case 3:quanLyXe.xoa();break;
                case 4:quanLyXe.timkiem();break;
            }

        }
    }
}