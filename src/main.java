
public class main {

	public static void main(String[] args) {
		ReproductorMP3 reproductor = new ReproductorMP3();
		
		reproductor.setState(new ReproduccionDetenida());
		
		reproductor.pressPlay();
		reproductor.pressPlay();
		reproductor.pressPlay();
	}

}
