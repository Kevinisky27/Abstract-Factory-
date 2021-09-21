package gt.edu.miumg.ingles;

import gt.edu.miumg.Pregunta;
import gt.edu.miumg.Saludo;
import gt.edu.miumg.fabrica.FabricaLenguaje;

public class FabricaIngles implements FabricaLenguaje {
	
	@Override
	public Saludo getSaludos() {
		return new SaludoIngles();
	}
	
	@Override
	public Pregunta getPreguntas() {
		return new PreguntaIngles();
	}
}
