/* =============================================================================
 * Aplicació:		Loteria
 * Arxiu:			FinestraPrincipal.java
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
import javax.swing.*;

// Classe FinestraPrincipal
public class FinestraPrincipal extends JFrame
{
	// Atributs
	private GestioArraiApostes arraiApostes;
	
	// Constructor
	public FinestraPrincipal(ArrayList<Aposta> apostes)
	{
		setUndecorated(true);	// Treiem la barra de títol
		initComponents();
		
		// Assignem l'arrai d'apostes a l'atribut
		arraiApostes = new GestioArraiApostes(apostes);

		// Si l'arxius d'apostes no existeix o està buit, mostrem un missatge
		// informatiu
		if(apostes.isEmpty())
		{
			JOptionPane.showMessageDialog(this, 
					"No s'ha trobat l'arxiu apostes.txt. Es crearà en sortir ", 
					"Arxiu no trobat", JOptionPane.INFORMATION_MESSAGE);
		}
		
		setTitle("Loteria (versió gràfica)");
		setResizable(false);		
		setLocationRelativeTo(null);
	}

	// Mètode iniciar: Inicia la finestra principal
	public void iniciar()
	{
		setVisible(true);
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupMenu = new javax.swing.ButtonGroup();
        panellMenuPrincipal = new javax.swing.JPanel();
        radioMostrar = new javax.swing.JRadioButton();
        radioAfegir = new javax.swing.JRadioButton();
        radioEliminar = new javax.swing.JRadioButton();
        radioModificar = new javax.swing.JRadioButton();
        radioCalcular = new javax.swing.JRadioButton();
        panellDades = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textApostant = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textQuantitat = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        panellBotons = new javax.swing.JPanel();
        botoCercar = new javax.swing.JButton();
        botoFuncio = new javax.swing.JButton();
        panellQuantitatTotal = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        textQuantitatTotal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        botoSortir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panellMenuPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder("Menú principal"));

        grupMenu.add(radioMostrar);
        radioMostrar.setText("Mostrar una aposta");
        radioMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMostrarActionPerformed(evt);
            }
        });

        grupMenu.add(radioAfegir);
        radioAfegir.setText("Afegir una aposta");
        radioAfegir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioAfegirActionPerformed(evt);
            }
        });

        grupMenu.add(radioEliminar);
        radioEliminar.setText("Eliminar una aposta");
        radioEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioEliminarActionPerformed(evt);
            }
        });

        grupMenu.add(radioModificar);
        radioModificar.setText("Modificar una aposta");
        radioModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioModificarActionPerformed(evt);
            }
        });

        grupMenu.add(radioCalcular);
        radioCalcular.setText("Calcular total apostes");
        radioCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panellMenuPrincipalLayout = new javax.swing.GroupLayout(panellMenuPrincipal);
        panellMenuPrincipal.setLayout(panellMenuPrincipalLayout);
        panellMenuPrincipalLayout.setHorizontalGroup(
            panellMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panellMenuPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panellMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioMostrar)
                    .addComponent(radioAfegir)
                    .addComponent(radioEliminar)
                    .addComponent(radioModificar)
                    .addComponent(radioCalcular))
                .addContainerGap())
        );
        panellMenuPrincipalLayout.setVerticalGroup(
            panellMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panellMenuPrincipalLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(radioMostrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioAfegir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioCalcular)
                .addContainerGap())
        );

        panellDades.setBorder(javax.swing.BorderFactory.createTitledBorder("Dades principals"));

        jLabel1.setText("Apostant:");

        textApostant.setEditable(false);

        jLabel2.setText("Quantitat:");

        textQuantitat.setEditable(false);

        jLabel3.setText("euros");

        javax.swing.GroupLayout panellDadesLayout = new javax.swing.GroupLayout(panellDades);
        panellDades.setLayout(panellDadesLayout);
        panellDadesLayout.setHorizontalGroup(
            panellDadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panellDadesLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textApostant, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panellDadesLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textQuantitat, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3))
        );
        panellDadesLayout.setVerticalGroup(
            panellDadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panellDadesLayout.createSequentialGroup()
                .addGroup(panellDadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textApostant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panellDadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textQuantitat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)))
        );

        panellBotons.setBorder(javax.swing.BorderFactory.createTitledBorder("Botons"));

        botoCercar.setText("Cercar");
        botoCercar.setEnabled(false);
        botoCercar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoCercarActionPerformed(evt);
            }
        });

        botoFuncio.setText(" ");
        botoFuncio.setEnabled(false);
        botoFuncio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoFuncioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panellBotonsLayout = new javax.swing.GroupLayout(panellBotons);
        panellBotons.setLayout(panellBotonsLayout);
        panellBotonsLayout.setHorizontalGroup(
            panellBotonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panellBotonsLayout.createSequentialGroup()
                .addComponent(botoCercar, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botoFuncio, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panellBotonsLayout.setVerticalGroup(
            panellBotonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panellBotonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(botoCercar)
                .addComponent(botoFuncio))
        );

        panellQuantitatTotal.setBorder(javax.swing.BorderFactory.createTitledBorder("Quantitat total"));

        jLabel4.setText("Quantitat total apostes:");

        textQuantitatTotal.setEditable(false);

        jLabel5.setText("euros");

        javax.swing.GroupLayout panellQuantitatTotalLayout = new javax.swing.GroupLayout(panellQuantitatTotal);
        panellQuantitatTotal.setLayout(panellQuantitatTotalLayout);
        panellQuantitatTotalLayout.setHorizontalGroup(
            panellQuantitatTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panellQuantitatTotalLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textQuantitatTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panellQuantitatTotalLayout.setVerticalGroup(
            panellQuantitatTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panellQuantitatTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel4)
                .addComponent(textQuantitatTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel5))
        );

        botoSortir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botoSortir.setText("X");
        botoSortir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoSortirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panellMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panellBotons, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panellQuantitatTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panellDades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botoSortir, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panellMenuPrincipal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botoSortir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panellDades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panellBotons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panellQuantitatTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void radioAfegirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioAfegirActionPerformed
	
	// Deshabilitem tot i habilitem només allò que es necessita per afegir una 
	// aposta
	deshabilitarTot();
	textApostant.setEditable(true);
	textQuantitat.setEditable(true);
	botoFuncio.setText("Afegir");
	botoFuncio.setEnabled(true);
}//GEN-LAST:event_radioAfegirActionPerformed

private void botoCercarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoCercarActionPerformed
	
	// Cercarem una aposta 
	
	String apostant = textApostant.getText();
	if(!apostant.equals(""))
	{
		try
		{
			// Cerquem l'aposta al vector d'apostes
			Aposta aposta = arraiApostes.recuperarAposta(apostant);
			textApostant.setEditable(false);
			textQuantitat.setText(aposta.getDinersApostats() + "");

			// En funció de l'acció en la què estem, fem les accions
			// corresponents
			if(radioMostrar.isSelected())
			{
				textQuantitat.setEditable(false);
				grupMenu.clearSelection();
			}
			else if(radioEliminar.isSelected())
			{
				botoFuncio.setText("Eliminar");
				botoFuncio.setEnabled(true);
			}
			else if(radioModificar.isSelected())
			{
				textQuantitat.setEditable(true);				
				botoFuncio.setText("Modificar");
				botoFuncio.setEnabled(true);
			}
		}
		catch(ExcepcioApostaInexistent e)
		{
			JOptionPane.showMessageDialog(this, 
				e.toString(), 
				"Apostant inexistent", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	else
	{
		JOptionPane.showMessageDialog(this, 
				"No s'ha introduït el nom de l'apostant", 
				"Error!", JOptionPane.ERROR_MESSAGE);
	}
}//GEN-LAST:event_botoCercarActionPerformed

private void radioMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMostrarActionPerformed
	deshabilitarTot();
	textApostant.setEditable(true);
	botoCercar.setEnabled(true);
}//GEN-LAST:event_radioMostrarActionPerformed

private void botoFuncioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoFuncioActionPerformed

	// Recuperem les dades de l'apostant i la quantitat apostada
	String apostant = textApostant.getText();
	String quantitat = textQuantitat.getText();

	// En funció de l'acció en la què estem, cridem al mètode corresponent
	if(botoFuncio.getText().equals("Afegir"))
	{
		opcioAfegir(apostant, quantitat);
	}
	else if(botoFuncio.getText().equals("Eliminar"))
	{
		opcioEliminar(apostant);
	}
	else if(botoFuncio.getText().equals("Modificar"))
	{
		opcioModificar(apostant, quantitat);
	}
}//GEN-LAST:event_botoFuncioActionPerformed

private void botoSortirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoSortirActionPerformed
	try
	{
		GestioArxiu.gravarArxiu(arraiApostes.getApostes());
		System.exit(0);
	}
	catch(Exception e)
	{
		JOptionPane.showMessageDialog(this, 
									  e.toString(),  
									  "Error!", 
									  JOptionPane.ERROR_MESSAGE);
	}
}//GEN-LAST:event_botoSortirActionPerformed

private void radioEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioEliminarActionPerformed
	deshabilitarTot();
	textApostant.setEditable(true);
	botoCercar.setEnabled(true);
}//GEN-LAST:event_radioEliminarActionPerformed

private void radioModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioModificarActionPerformed
	deshabilitarTot();
	textApostant.setEditable(true);
	botoCercar.setEnabled(true);
}//GEN-LAST:event_radioModificarActionPerformed

private void radioCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioCalcularActionPerformed

	// Deshabilitem tot i calculem el valor del conjunt de totes les apostes
	deshabilitarTot();
	
	// Recorrem el vector d'apostes i anem acumulant el valor total
	ArrayList<Aposta> apostes = arraiApostes.getApostes();
	Iterator<Aposta> iterador = apostes.iterator();
	int suma = 0;
	while(iterador.hasNext())
	{
		suma += iterador.next().getDinersApostats();
	}
	textQuantitatTotal.setText(suma + "");
}//GEN-LAST:event_radioCalcularActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botoCercar;
    private javax.swing.JButton botoFuncio;
    private javax.swing.JButton botoSortir;
    private javax.swing.ButtonGroup grupMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel panellBotons;
    private javax.swing.JPanel panellDades;
    private javax.swing.JPanel panellMenuPrincipal;
    private javax.swing.JPanel panellQuantitatTotal;
    private javax.swing.JRadioButton radioAfegir;
    private javax.swing.JRadioButton radioCalcular;
    private javax.swing.JRadioButton radioEliminar;
    private javax.swing.JRadioButton radioModificar;
    private javax.swing.JRadioButton radioMostrar;
    private javax.swing.JTextField textApostant;
    private javax.swing.JTextField textQuantitat;
    private javax.swing.JTextField textQuantitatTotal;
    // End of variables declaration//GEN-END:variables

	/* -------------------------------------------------------------------------
	 * Mètode:		deshabilitarTot
	 * Paràmetres:	cap
	 * Retorn:		cap
	 * Descripció:	Deshabilita tots els controls de la finestra principal
	 * ---------------------------------------------------------------------- */
	private void deshabilitarTot()
	{
		textApostant.setText("");
		textApostant.setEditable(false);
		textQuantitat.setText("");
		textQuantitat.setEditable(false);
		botoCercar.setEnabled(false);
		botoFuncio.setText(" ");
		botoFuncio.setEnabled(false);
		textQuantitatTotal.setText("");
	}
	
	/* -------------------------------------------------------------------------
	 * Mètode:		opcioAfegir
	 * Paràmetres:	String apostant		Nom de l'apostant
	 *				String quantitat	Quantitat apostada per l'apostant
	 * Retorn:		cap
	 * Descripció:	Afegeix una aposta. Agafa les dades de l'aposta per
	 *				paràmetre, crea un objecte de la classe Aposta i l'afegeix
	 *				al vector d'apostes.
	 * ---------------------------------------------------------------------- */
	private void opcioAfegir(String apostant, String quantitat)
	{
		try
		{
			// Controlem que hi hagin valors en els dos textfields
			if(!apostant.equals("") &&
			   !quantitat.equals(""))
			{
				// Controlem que l'aposta sigui múltiple de 20
				int quant = Integer.parseInt(quantitat);
				if(quant % 20 == 0)
				{
					// Creem l'aposta i l'afegim al vector
					Aposta aposta = new Aposta(apostant, quant);
					arraiApostes.afegirAposta(aposta);
					
					// Deixem la finestra principal llesta per la següent acció
					deshabilitarTot();
					grupMenu.clearSelection();
				}

// Missatges d'error i informatius per les eventualitats que es puguin donar
				else
				{
					JOptionPane.showMessageDialog(this, 
							"La quantitat apostada no és múltiple de 20.\n" +
							"L'aposta no s'afegirà",
							"Error!", JOptionPane.ERROR_MESSAGE);
				}
			}
			else
			{
				JOptionPane.showMessageDialog(this, 
						"No s'ha introduït el nom de l'apostant o la " +
						"quantitat apostada", 
						"Error!", JOptionPane.ERROR_MESSAGE);
			}
		}
		catch(NumberFormatException e)
		{
			JOptionPane.showMessageDialog(this, 
					"La quantitat introduïda és incorrecta", 
					"Error!", JOptionPane.ERROR_MESSAGE);
		}
		catch(ExcepcioApostaExistent e)
		{
			JOptionPane.showMessageDialog(this, 
					"Ja existeix un apostant amb aquest nom ", 
					"Apostant ja existeix", JOptionPane.INFORMATION_MESSAGE);
		}
	}

	/* -------------------------------------------------------------------------
	 * Mètode:		opcioEliminar
	 * Paràmetres:	String apostant		Nom de l'apostant
	 * Retorn:		cap
	 * Descripció:	Elimina una aposta. Agafa el nom de l'apostant per paràmetre, 
	 *				i l'elimina del vector d'apostes. Si l'apostant no té cap
	 *				aposta, mostra un missatge d'error.
	 * ---------------------------------------------------------------------- */
	private void opcioEliminar(String apostant)
	{
		try
		{
			// Eliminem l'apostant
			arraiApostes.eliminarAposta(apostant);
			
			// Deixem llesta la finestra principal per la següent acció
			deshabilitarTot();
			grupMenu.clearSelection();
		}
		catch(ExcepcioApostaInexistent e)
		{
			JOptionPane.showMessageDialog(this, 
					"No existeix cap apostant amb aquest nom.\n" +
					"L'aposta no s'ha eliminat", 
					"Apostant no existeix", JOptionPane.INFORMATION_MESSAGE);
		}
	}

	/* -------------------------------------------------------------------------
	 * Mètode:		opcioModificar
	 * Paràmetres:	String apostant		Nom de l'apostant
	 *				String quantitat	Quantitat apostada per l'apostant
	 * Retorn:		cap
	 * Descripció:	Modifica una aposta. Agafa les dades de l'apostant rebudes
	 *				per paràmetre i subtitueix la de l'antiga aposta per la nova.
	 *				Si es produeix algun error, es mostra el missatge 
	 *				corresponent.
	 * ---------------------------------------------------------------------- */
	private void opcioModificar(String apostant, String quantitat)
	{
		try
		{
			// Controlem que hi hagin valors en els dos textfields
			if(!apostant.equals("") &&
			   !quantitat.equals(""))
			{
				// Controlem que l'aposta sigui múltiple de 20
				int quant = Integer.parseInt(quantitat);
				if(quant % 20 == 0)
				{
					// Recuperem l'aposta i modifiquem el seu valor
					Aposta aposta = arraiApostes.recuperarAposta(apostant);
					aposta.setDinersApostats(quant);
					
					// Deixem la finestra principal llesta per la següent acció
					deshabilitarTot();
					grupMenu.clearSelection();
				}
				
// Missatges d'error i informatius per les eventualitats que es puguin donar				
				else
				{
					JOptionPane.showMessageDialog(this, 
							"La quantitat apostada no és múltiple de 20.\n" +
							"L'aposta no s'ha modificat",
							"Error!", JOptionPane.ERROR_MESSAGE);
				}
			}
			else
			{
				JOptionPane.showMessageDialog(this, 
						"No s'ha introduït el nom de l'apostant o la quantitat apostada", 
						"Error!", JOptionPane.ERROR_MESSAGE);
			}
		}
		catch(NumberFormatException e)
		{
			JOptionPane.showMessageDialog(this, 
					"La quantitat introduïda és incorrecta", 
					"Error!", JOptionPane.ERROR_MESSAGE);
		}
		catch(ExcepcioApostaInexistent e)
		{
			JOptionPane.showMessageDialog(this, 
					"No existeix cap apostant amb aquest nom ", 
					"Apostant no existeix", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
// =============================================================================