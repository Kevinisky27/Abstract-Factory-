package gt.edu.miumg.fabrica;

import gt.edu.miumg.Pregunta;
import gt.edu.miumg.Saludo;

public interface FabricaLenguaje {
	Saludo getSaludos();
	Pregunta getPreguntas();
}
