/* =============================================================================
 * Aplicació:		Loteria
 * Arxiu:			ExcepcioApostaExistent.java
 * Autor:			José Luis García Mañas
 * Data de creació:	21/10/2009
 * Descripció:		Conté la classe-excepció ExcepcioApostaExistent.
 *					L'excepció es produirà quan una cadena no conté un sol
 *					caràcter.
 * ========================================================================== */

// Paquet
package loteriagrafic;

// Classe ExcepcioApostaExistent
public class ExcepcioApostaExistent extends Exception
{
	// Constructors
	public ExcepcioApostaExistent(){}
	public ExcepcioApostaExistent(String s){super(s);}
}
// =============================================================================
