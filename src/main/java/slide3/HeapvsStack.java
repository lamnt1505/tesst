package slide3;

public class HeapvsStack {//run	time class load vao bo nho heap

	public static void main(String[] args) {//hamf main dc goi JVRT luu vao bn stack
		 	int i = 1 ; //line 2  tao bien local dc luu vao bn stack cua ham main
		 	//Object luu vao bo nho heap obj tham chieu qua bn stack
	        Object obj = new Object(); // line 3
	        HeapvsStack hvs = new HeapvsStack(); // line 4
	        hvs.foo(obj); // line 5 goi ham foo stack luu tren cung vs ham nay
	        //obj khi java truyền giá trị 1 tham chiếu tới object
	}//line 9 khi ham main cham dut ham nay cung tro free
	
	private static void foo(Object param) { // line 6  
        String str = param.toString(); // line 7 khi 1 chuoi str tao tham chieu den str pool
        System.out.println(str);// line 8 stack luu bien tham chieu nay
    }//line 8  khi cham dut  vung nhho  ham foo 0 stack  tro nen free 
}
