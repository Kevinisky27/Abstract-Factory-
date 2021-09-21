package gt.edu.miumg.ingles;

import gt.edu.miumg.Saludo;

public class SaludoIngles implements Saludo {
	
	@Override
	public String buenosDias() {
		return "Good Morning";
	}

	@Override
	public String buenasTardes() {
		return "Good Afternoon";
	}

}
