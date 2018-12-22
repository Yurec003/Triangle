public class PointException1 extends Exception {
	private int num = 0;

	PointException1(int m1) {
		super("It isn't triangle!");
		this.num = num;
		num++;
		

	}

	public int getNum() {
		return num;
	}

}