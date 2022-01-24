
public class ReproduccionDetenida implements State{
	public void pressPlay(ReproductorMP3 reproductor) {
		reproductor.setState(new ReproduccionEnCurso());
	}
	
	public String getIndicador() {
		return "Detenida";
	}
}
