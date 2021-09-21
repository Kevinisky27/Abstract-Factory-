package gt.edu.miumg.español;

import gt.edu.miumg.Pregunta;

public class PreguntaEspañol implements Pregunta{
	
	@Override
	public String preguntaHora() {
		return "¿qué hora es?";
	}

	@Override
	public String preguntaTiempo() {
		return "¿qué tiempo hace?";
	}

}
