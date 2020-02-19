
public class Point {
	long x;
	private long y;
	private long z;
	
	public Point(long x, long y, long z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public long getX() {
		return x;
	}

	public long getY() {
		return y;
	}

	public long getZ() {
		return z;
	}
	
	
	public void setX(long x) {
		this.x = x;
	}

	static Point translate(int newPoint, String originalPoint) {
		Point originalPoint;
		Point p = new Point(originalPoint.x,originalPoint.y,originalPoint.z); 
		if (originalPoint == "x") {
			p.x += newPoint;
		}else if (originalPoint == "y") {
			p.y += newPoint;
		}else if (originalPoint == "z"){
			p.z += newPoint;
		}
	
		return p;
		
	}
}
