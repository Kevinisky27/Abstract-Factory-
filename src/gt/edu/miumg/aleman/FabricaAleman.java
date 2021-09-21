package gt.edu.miumg.aleman;

import gt.edu.miumg.Pregunta;
import gt.edu.miumg.Saludo;
import gt.edu.miumg.español.PreguntaEspañol;
import gt.edu.miumg.español.SaludoEspañol;
import gt.edu.miumg.fabrica.FabricaLenguaje;

public class FabricaAleman implements FabricaLenguaje {
	@Override
	public Saludo getSaludos() {
		return new SaludoAleman();
	}

	@Override
	public Pregunta getPreguntas() {
		return new PreguntaAleman();
	}
}
