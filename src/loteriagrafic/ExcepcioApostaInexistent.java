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

// Classe ExcepcioApostaInexistent
public class ExcepcioApostaInexistent extends Exception
{
// Constructors
	public ExcepcioApostaInexistent(){}
	public ExcepcioApostaInexistent(String s){super(s);}
}
// =============================================================================
