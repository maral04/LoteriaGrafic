/* =============================================================================
 * Aplicació:		Loteria
 * Arxiu:			ExcepcioApostaInexistent.java
 * Autor:			José Luis García Mañas
 * Data de creació:	21/10/2009
 * Descripció:		Conté la classe-excepció ExcepcioApostaInexistent.
 *					L'excepció es produirà quan una cadena no conté un sol
 *					caràcter.
 * ========================================================================== */

// Paquet
package loteriagrafic;

// Imports
import java.util.ArrayList;

// Classe Principal
public class Principal
{
	// Mètode main
	public static void main(String[] args)
	{
		// LLegim l'arxiu d'apostes
		ArrayList<Aposta> apostes = GestioArxiu.llegirArxiu();
		
		// Creem la finestra principal i la iniciem
		FinestraPrincipal fp = new FinestraPrincipal(apostes);
		fp.iniciar();
	}
}
// =============================================================================

