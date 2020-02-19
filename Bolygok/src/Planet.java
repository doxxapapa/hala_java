
public final class Planet {
	private Point position;
	private double radius;
	private String name;
	
	public Planet( double radius,String name,Point position) {
		super();
		this.position = position;
		this.radius = radius;
		this.name = name;
	}

	public Point getPosition() {
		return position;
	}

	public double getRadius() {
		return radius;
	}

	public String getName() {
		return name;
	}
	
	
}
