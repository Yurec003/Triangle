public class Figure {
	private Point[] points;

	Figure(int n) {
		points = new Point[n];
		for (int i = 0; i < n; i++) {
			points[i] = new Point();
		}
	}
	int t;
	public void setCoord( int xx, int yy, int zz) throws PointException1 {
		if (xx + yy < zz) {
			
			points[t].setCoord(xx, yy, zz);
		} else {
			throw new PointException1(t);

		}

	}

}