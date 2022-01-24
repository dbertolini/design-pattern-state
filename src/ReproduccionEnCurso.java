
public class ReproduccionEnCurso implements State{
	public void pressPlay(ReproductorMP3 reproductor) {
		reproductor.setState(new ReproduccionDetenida());
	}
	
	public String getIndicador() {
		return "En curso";
	}
}
