package gt.edu.miumg.ingles;

import gt.edu.miumg.Pregunta;

public class PreguntaIngles implements Pregunta {
	
	@Override
	public String preguntaHora() {
		return "What time is it?";
	}

	@Override
	public String preguntaTiempo() {
		return "How is the weather?";
	}
}
