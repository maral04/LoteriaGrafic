/* =============================================================================
 * Aplicació:		Loteria
 * Arxiu:			Aposta.java
 * Autor:			José Luis García Mañas
 * Data de creació:	21/10/2009
 * Descripció:		Conté la classe Aposta, amb els seus atributs i mètodes.
 * ========================================================================== */

// Paquet
package loteriagrafic;

// Classe Aposta
public class Aposta
{
	// Atributs
	private String nomApostant;
	private int	   dinersApostats;

	// Constructor
	public Aposta(String nomApostant, int dinersApostats)
	{
		this.nomApostant	= nomApostant;
		this.dinersApostats = dinersApostats;
	}

	// Getters
	public String getNomApostant()
	{
		return nomApostant;
	}
	
	public int getDinersApostats()
	{
		return dinersApostats;
	}
	
	// Setters
	public void setDinersApostats(int dinersApostats)
	{
		this.dinersApostats = dinersApostats;
	}
	
	// Mètode equals
	public boolean equals(Aposta altraAposta)
	{
		return nomApostant.equals(altraAposta.nomApostant);
	}
	
	// Mètode toString
	public String toString()
	{
		return nomApostant + ": " + dinersApostats;
	}
}
// =============================================================================