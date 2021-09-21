package gt.edu.miumg.aleman;

import gt.edu.miumg.Saludo;

public class SaludoAleman implements Saludo {
	@Override
	public String buenosDias() {
		return "Guten Morgen";
	}

	@Override
	public String buenasTardes() {
		return "Guten Nachmittag";
	}
}
