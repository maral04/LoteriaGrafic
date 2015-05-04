/* =============================================================================
 * Aplicació:		Loteria
 * Arxiu:			GestioArraiApostes.java
 * Autor:			José Luis García Mañas
 * Data de creació:	21/10/2009
 * Descripció:		Conté la classe GestioArraiApostes, amb el vector d'apostes
 *					i els mètodes que permeten afegir, eliminar i modificar
 *					apostes sobre el vector.
 * ========================================================================== */

// Paquet
package loteriagrafic;

// Imports
import java.util.*;

// Classe GestioArraiApostes
public class GestioArraiApostes
{
	// Atributs
	private ArrayList<Aposta> apostes;
	
	// Constructor
	public GestioArraiApostes(ArrayList<Aposta> apostes)
	{
		this.apostes = apostes;
	}
	
	// Getter
	public ArrayList<Aposta> getApostes()
	{
		return apostes;
	}
	
	/* -------------------------------------------------------------------------
	 * Mètode:		afegirAposta
	 * Paràmetres:	Aposta aposta	Aposta que volem afegir al vector
	 * Retorn:		cap
	 * Descripció:	Afegeix una aposta en el vector d'apostes. Abans de fer-ho,
	 *				comprova que l'apostant no tingui cap aposta. Si l'apostant
	 *				ja té una aposta, el mètode llença una excepció del tipus
	 *				ExcepcioApostaExistent.
	 * ---------------------------------------------------------------------- */
	public void afegirAposta(Aposta aposta) throws ExcepcioApostaExistent
	{
		// Si l'apostant no té cap aposta, s'afegeix l'aposta
		if(!estaEnArrai(aposta))
		{
			apostes.add(aposta);
		}
		// Si l'apostant ja té una aposta, es llença una excepció
		else
		{
			throw new ExcepcioApostaExistent("Aquest apostant ja ha apostat. "
					+ "S'ha d'utilitzar l'opció 'Modificar aposta'");
		}
	}
	
	/* -------------------------------------------------------------------------
	 * Mètode:		eliminarAposta
	 * Paràmetres:	String nomApostant
	 * Retorn:		cap
	 * Descripció:	Elimina una aposta del vector d'apostes. Abans de fer-ho,
	 *				comprova que l'aposta existeix. Si l'aposta no existeix, el 
	 *				mètode llença una excepció del tipus 
	 *				ExcepcioApostaInexistent.
	 * ---------------------------------------------------------------------- */
	public void eliminarAposta(String nomApostant) 
			throws ExcepcioApostaInexistent
	{
		try
		{
			// Recuperem l'aposta i l'eliminem del vector
			Aposta aposta = recuperarAposta(nomApostant);
			apostes.remove(aposta);
		}
		catch(ExcepcioApostaInexistent e)
		{
			throw e;
		}
	}
	
	/* -------------------------------------------------------------------------
	 * Mètode:		recuperarAposta
	 * Paràmetres:	String nomApostant
	 * Retorn:		cap
	 * Descripció:	Recupera una aposta del vector d'apostes. Si l'aposta no 
	 *				existeix, el  mètode llença una excepció del tipus 
	 *				ExcepcioApostaInexistent.
	 * ---------------------------------------------------------------------- */
	public Aposta recuperarAposta(String nomApostant) 
			throws ExcepcioApostaInexistent
	{
		// Declaració de variables
		Aposta aposta = null;
		
		// Recorrem el vector d'apostes cercant l'aposta
		Iterator<Aposta> i = apostes.iterator();		
		while(aposta == null && i.hasNext())
		{
			Aposta a = i.next();
			if(a.getNomApostant().equals(nomApostant))
			{
				aposta = a;
			}
		}
		
		// Si no hem trobat l'aposta, llancem una excepció
		if(aposta == null)
		{
			throw new ExcepcioApostaInexistent("No s'ha trobat l'aposta cercada");
		}
		
		return aposta;
	}
	
	/* -------------------------------------------------------------------------
	 * Mètode:		recuperarAposta
	 * Paràmetres:	Aposta aposta
	 * Retorn:		boolean		True si l'aposta és al vector; false si no.
	 * Descripció:	Cerca una aposta del vector d'apostes. Si l'aposta existeix,
	 *				retorna true; si no, retorna false.
	 * ---------------------------------------------------------------------- */
	private boolean estaEnArrai(Aposta aposta)
	{
		// Declaració de variables
		boolean esta = false;
		
		// Recorrem el vector cercant l'aposta
		Iterator<Aposta> i = apostes.iterator();
		while(esta == false && i.hasNext())
		{
			if(i.next().equals(aposta))
			{
				esta = true;
			}
		}
		
		return esta;
	}
}
// =============================================================================