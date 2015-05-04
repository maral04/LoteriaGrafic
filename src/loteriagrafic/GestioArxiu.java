/* =============================================================================
 * Aplicació:		Loteria
 * Arxiu:			GestioArxiu.java
 * Autor:			José Luis García Mañas
 * Data de creació:	21/10/2009
 * Descripció:		Conté la classe GestioArxiu, amb els mètodes necessaris per
 *					accedir als arxius.
 * ========================================================================== */

// Paquet
package loteriagrafic;

// Imports
import java.io.*;
import java.util.*;

// Classe GestioARxiu
public class GestioArxiu
{
	/* -------------------------------------------------------------------------
	 * Mètode:		llegirArxiu
	 * Paràmetres:	cap
	 * Retorn:		ArrayList<Aposta>	Vector amb les apostes efectuades
	 * Descripció:	Llegeix les apostes des de l'arxiu apostes.txt i les carrega
	 *				en un ArrayList, que és el que retorna. Si l'arxiu no 
	 *				existeix, retornarà l'ArrayList buit.
	 * ---------------------------------------------------------------------- */
	public static ArrayList<Aposta> llegirArxiu()
	{
		// Creem l'ArrayList d'apostes
		ArrayList<Aposta> apostes = new ArrayList<Aposta>();
		
		try
		{
			// Ens preparem per llegir des de l'arxiu
			FileReader fr = new FileReader("apostes.txt");
			BufferedReader br = new BufferedReader(fr);
			
			// Llegim el número d'apostes totals
			String strNumApostes = br.readLine();
			int numApostes = Integer.parseInt(strNumApostes);
			
			// I llegim cadascuna de les apostes, guardant-les a l'ArrayList
			for(int i = 0; i < numApostes; i++)
			{
				String nomApostant = br.readLine();
				String strDiners = br.readLine();
				int dinersApostats = Integer.parseInt(strDiners);
				Aposta aposta = new Aposta(nomApostant, dinersApostats);
				apostes.add(aposta);
			}
			
			// Finalment, tanquem l'arxiu
			fr.close();
		}
		
		// Tant si no existeix l'arxiu com si la seva lectura dóna un error,
		// retornarem l'ArrayList buit
		catch(FileNotFoundException e){}
		catch(IOException e){}
		
		return apostes;
	}
	
	
	
	/* -------------------------------------------------------------------------
	 * Mètode:		gravarArxiu
	 * Paràmetres:	ArrayList<Aposta>	Vector d'apostes
	 * Retorn:		cap
	 * Descripció:	Grava l'ArrayList d'apostes rebut com a paràmetre en l'arxiu
	 *				apostes.txt. Si no s'ha pogut gravar l'arxiu, es llença una
	 *				excepció del tipus Exception.
	 * ---------------------------------------------------------------------- */
	public static void gravarArxiu(ArrayList<Aposta> apostes) throws Exception
	{
		try
		{
			// Obrim l'arxiu per gravar
			FileWriter fw = new FileWriter("apostes.txt");
			
			// Gravem el número d'apostes
			fw.write(apostes.size() + "\n");

			// Gravem les diferents apostes
			Iterator<Aposta> i = apostes.iterator();
			while(i.hasNext())
			{
				Aposta aposta = i.next();
				fw.write(aposta.getNomApostant() + "\n");
				fw.write(aposta.getDinersApostats() + "\n");
			}
			
			// Tanquem l'arxiu
			fw.close();
		}
		catch(IOException e)
		{
			throw new Exception("No s'ha pogut gravar a l'arxiu apostes.txt");
		}
	}
}
// =============================================================================