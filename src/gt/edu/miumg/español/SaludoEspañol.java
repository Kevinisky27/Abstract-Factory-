package gt.edu.miumg.español;

import gt.edu.miumg.Saludo;

public class SaludoEspañol implements Saludo {
	
	@Override
	public String buenosDias() {
		return "buenos días";
	}

	@Override
	public String buenasTardes() {
		return "buenas tardes";
	}

}
