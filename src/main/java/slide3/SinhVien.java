package slide3;

public class SinhVien {
    private String ten ;
    private Integer tuoi ;
    private String lop ;

    public  SinhVien(String ten,String lop,Integer tuoi){
        this.ten = ten;
        this.tuoi = tuoi;
        this.lop = lop;
    }

    public void showSinhVien(){
        System.out.println(ten + " " + tuoi + " " + lop);
    }
    public void DoiLop(String lop){
        this.lop = lop;
        System.out.println(ten + " " + tuoi + " " + this.lop);
    }

    public static void main(String [] args){
        SinhVien sv1 = new SinhVien("Loc","Hoa", 12);
        SinhVien sv2 = new SinhVien("Lam","IT", 13);
        SinhVien sv3 = new SinhVien("Ky","TKTW", 14);
        String sv[] = {"sv1","sv2","sv3"};

        sv1.showSinhVien();
        sv1.DoiLop("TKTW");
    }
}
