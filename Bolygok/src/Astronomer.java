import java.util.List;
import java.util.Random;

public class Astronomer {
	
	private String name;
	private List<Planet> planets;
	
	public Astronomer(String name, List<Planet> planets) {
		super();
		this.name = name;
		this.planets = planets;
	}

	public List<Planet> getPlanets() {
		return planets;
	}
	
	public void observeTheSky() {
		
		List<Planet> lista;
		Planet p;
		Point movepos;
		Point pos;
		Random r = new Random();

		for (int i = 0; i < 10; i++) {
			int n = r.nextInt(1);
			
			pos = Point.translate(10, );
			p = new Planet(n, "Gali"+i, pos);
			lista.add(p);
		}
		
	}
}
