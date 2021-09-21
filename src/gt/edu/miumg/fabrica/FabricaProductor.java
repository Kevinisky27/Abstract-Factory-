package gt.edu.miumg.fabrica;

import gt.edu.miumg.aleman.FabricaAleman;
import gt.edu.miumg.español.FabricaEspañol;
import gt.edu.miumg.ingles.FabricaIngles;

public class FabricaProductor {
	
	public static FabricaLenguaje getFabrica(String idioma) {
		if(idioma == "español") {
			return new FabricaEspañol();
		}
		else if(idioma == "ingles") {
			return new FabricaIngles();
		}
		else if (idioma == "aleman") {
			return new FabricaAleman();
		}
		else {
			return null;
		}
	}
}
