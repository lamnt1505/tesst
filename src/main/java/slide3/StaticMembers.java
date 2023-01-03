package slide3;



public class StaticMembers {
	public static int id = 1000;
	public static String MESSAGE = "Good Afternoon";
	
	private int mId;
	
	public StaticMembers() {
		mId = id++;
		StaticMembers.showStaticId();
	}
	
	public int getmId() {
		return mId;
	}

	public void setmId(int mId) {
		this.mId = mId;
	}
	
	public static void showStaticId() {
		System.out.println("static id = " + id);
	}
	
	public static void main(String[] args) {
		StaticMembers s1 = new StaticMembers();
		StaticMembers s2 = new StaticMembers();
		StaticMembers s3 = new StaticMembers();
		StaticMembers s4 = new StaticMembers();
		
//		System.out.println("s1 id = " + s1.getmId());
//		System.out.println("s1 id = " + s2.getmId());
//		System.out.println("s1 id = " + s3.getmId());
//		System.out.println("s1 id = " + s4.getmId());
	}

}
