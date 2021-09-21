package gt.edu.miumg;

import static org.junit.Assert.*;
import org.junit.Test;

import gt.edu.miumg.fabrica.FabricaLenguaje;
import gt.edu.miumg.fabrica.FabricaProductor;

public class TestMultiIdioma {

	@Test
	public void test_español() {
		
		FabricaLenguaje fabricaEs = FabricaProductor.getFabrica("español");
		
		Pregunta preguntas = fabricaEs.getPreguntas();
		
		assertEquals("¿qué hora es?", preguntas.preguntaHora() );
		assertEquals("¿qué tiempo hace?", preguntas.preguntaTiempo() );
		
		Saludo saludoEs = fabricaEs.getSaludos();
		
		assertEquals("buenos días", saludoEs.buenosDias());
		assertEquals("buenas tardes", saludoEs.buenasTardes());
	}
	
	@Test
	public void test_ingles() {
		
		FabricaLenguaje fabricaIn = FabricaProductor.getFabrica("ingles");
		
		Pregunta preguntas = fabricaIn.getPreguntas();
		
		assertEquals("What time is it?", preguntas.preguntaHora() );
		assertEquals("How is the weather?", preguntas.preguntaTiempo() );
		
		Saludo saludoIngl = fabricaIn.getSaludos();
		
		assertEquals("Good Morning", saludoIngl.buenosDias());
		assertEquals("Good Afternoon", saludoIngl.buenasTardes());
	}
	
	@Test
	public void test_aleman() {
		FabricaLenguaje fabricaAle = FabricaProductor.getFabrica("aleman");
		Pregunta preguntas = fabricaAle.getPreguntas();
		
		assertEquals("Wie spät ist es?", preguntas.preguntaHora());
		assertEquals("Wie ist das Wetter heute", preguntas.preguntaTiempo());
		
		Saludo saludoAle = fabricaAle.getSaludos();
		
		assertEquals("Guten Morgen", saludoAle.buenosDias());
		assertEquals("Guten Nachmittag", saludoAle.buenasTardes());
	}
}
