package gt.edu.miumg.aleman;

import gt.edu.miumg.Pregunta;

public class PreguntaAleman implements Pregunta {
	
	@Override
	public String preguntaHora() {
		return "Wie spät ist es?";
	}

	@Override
	public String preguntaTiempo() {
		return "Wie ist das Wetter heute";
	}
}
