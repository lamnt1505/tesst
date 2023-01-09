package slide5;

import slide3.SinhVien;

public class demo {

    Integer a = (5);

    public static void main(String[] args) {
        demo demo1 = new demo();
        demo1.lop();
        int answer = sum(5,5);
        System.out.println(answer);
    }


    public void lop(){
        System.out.println(this.a);
    }

    public static int sum(int x, int y){
        return x+y;
    }
}
