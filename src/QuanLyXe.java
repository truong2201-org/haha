import java.util.Scanner;

public class QuanLyXe {
    private Xe[]danhSachXe;
    private int tongSoXe;
    private int soluongxe;
    public QuanLyXe(int tongSoXe){
        this.tongSoXe=tongSoXe;
        this.danhSachXe=new Xe[this.tongSoXe];
        this.soluongxe=0;
    }
    public void them(){
        Scanner sr = new Scanner(System.in);
        System.out.printf("nhap loai xe : 1.xeoto, 2.xemay, 3.xetai ");
        int choist=sr.nextInt();
        Xe xe=null;
        switch (choist){
            case 1: xe=new xeOto();
            nhapIDxe(xe);
            xe.nhapThongTin();
            break;
            case 2:xe=new xeMay();
            nhapIDxe(xe);
            xe.nhapThongTin();
            break;
            case 3:xe=new xeTai();
            nhapIDxe(xe);
            xe.nhapThongTin();;
            break;
        }
        this.danhSachXe[this.soluongxe]=xe;
        this.soluongxe++;
    }
    public void timkiem(){
        Scanner sr=new Scanner(System.in);
        System.out.printf("nhap  hang san xuat ");
        String tenhang=sr.nextLine();
        boolean timthay=false;
        Xe xe=null;
        for(int i=0;i<this.soluongxe;i++){
            xe=this.danhSachXe[i];
            if(xe.getHangSX().equalsIgnoreCase(tenhang)){
                System.out.printf(" tai lieu duoc tim thấy");
                xe.hienThongTin();
                timthay=true;

        }
    }if(!timthay)
        {
            System.out.printf("khong tim thay hang "+tenhang);
        }

//        if (danhSachTaiLieu[i] instanceof Sach) {
//            Sach sach = (Sach) danhSachTaiLieu[i]; // Ép kiểu TaiLieu về Sach
//            // So sánh tên tác giả, có thể sử dụng equalsIgnoreCase để không phân biệt hoa thường
//            if (sach.getTenTacGia().equalsIgnoreCase(tenTacGia)) {
//                System.out.println("Da tim thay sach cua tac gia: " + tenTacGia);
//                sach.hienThiThongTin();
//                timThay = true;
//            }
//        }
    }
    public void xoa(){
        Scanner sr =new Scanner(System.in);
        System.out.printf("nhap so can xoa");
        String  macanxoa=sr.nextLine();
        Boolean daxoa=false;
        Xe xe=null;
        for(int i=0;i<this.soluongxe;i++){
            if(this.danhSachXe[i]!=null&&macanxoa.equalsIgnoreCase(this.danhSachXe[i].getIdXe())){
                System.out.printf("da tim thay ma can xoa ");
                this.danhSachXe[i].hienThongTin();
                for(int j=0;j<this.soluongxe-1;j++){
                    this.danhSachXe[j]=this.danhSachXe[j+1];
                }
                this.soluongxe--;
                daxoa=true;
            }
        }
        if(daxoa){
            System.out.printf("da xoa thanh cong");
        }else {
            System.out.printf("khong tim thay "+macanxoa);
        }

    }

    public void hienThongTin(){
        for (int i=0;i<this.soluongxe;i++){
            this.danhSachXe[i].hienThongTin();;
        }
    }

    public void nhapIDxe(Xe xe){
        Scanner sr=new Scanner(System .in);
        String Idxe;
        do{
            System.out.printf("nhap Id xe ");
            Idxe=sr.nextLine();
        }while (Idkhonghople(Idxe));
        xe.setIdXe(Idxe);
    }
    public boolean Idkhonghople(String Idxe){
        for ( int i=0;i<this.soluongxe;i++){
            if(this.danhSachXe[i].getIdXe().equals(Idxe)){
                return true;
            }
        }
        return  false;
    }
}
