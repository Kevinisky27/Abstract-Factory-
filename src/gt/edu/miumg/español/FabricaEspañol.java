package gt.edu.miumg.español;

import gt.edu.miumg.Pregunta;
import gt.edu.miumg.Saludo;
import gt.edu.miumg.fabrica.FabricaLenguaje;

public class FabricaEspañol implements FabricaLenguaje{

	@Override
	public Saludo getSaludos() {
		return new SaludoEspañol();
	}

	@Override
	public Pregunta getPreguntas() {
		return new PreguntaEspañol();
	}
}
