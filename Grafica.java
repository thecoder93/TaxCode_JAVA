import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane.*;

class Grafica
{
  public static Frame f;

	public static void main(String argv[])
	{

		f = new Frame("Calcolo codice fiscale v1.1.1");
		f.setSize(630,220);
		f.setResizable(false); //Rende il frame non massimizzabile
		f.setLocation(100,50);

		final TextField nome, cognome, comune, codice, anno;

		nome = new TextField(30);
		cognome = new TextField(30);
		comune = new TextField(30);
		codice = new TextField(30);
		codice.setEditable(false);
		anno = new TextField(30);

		Label cog = new Label("Cognome", Label.RIGHT);
		f.add(cog);
		f.add(cognome);
		Label nom = new Label("Nome", Label.RIGHT);
		f.add(nom);
		f.add(nome);
		Label com = new Label("Comune", Label.RIGHT);
		f.add(com);
		f.add(comune);
		Label cod = new Label("Codice fiscale", Label.RIGHT);
		f.add(cod);
		f.add(codice);
		Label ann = new Label("Anno", Label.RIGHT);
		f.add(ann);
		f.add(anno);

		Button cancella = new Button("Cancella");
		Button calcola = new Button("Calcola");
       
  		  final Choice Mesi = new Choice();
		  final Choice giorno = new Choice();
		  final Choice sesso = new Choice();

		Mesi.addItem("Gennaio");
		Mesi.addItem("Febbraio");
		Mesi.addItem("Marzo");
		Mesi.addItem("Aprile");
		Mesi.addItem("Maggio");
		Mesi.addItem("Giugno");
		Mesi.addItem("Luglio");
		Mesi.addItem("Agosto");
		Mesi.addItem("Settembre");
		Mesi.addItem("Ottobre");
		Mesi.addItem("Novembre");
		Mesi.addItem("Dicembre");

		f.add(Mesi);

		giorno.addItem("1");
		giorno.addItem("2");
		giorno.addItem("3");
		giorno.addItem("4");
		giorno.addItem("5");
		giorno.addItem("6");
		giorno.addItem("7");
		giorno.addItem("8");
		giorno.addItem("9");
		giorno.addItem("10");
		giorno.addItem("11");
		giorno.addItem("12");
		giorno.addItem("13");
		giorno.addItem("14");
		giorno.addItem("15");
		giorno.addItem("16");
		giorno.addItem("17");
		giorno.addItem("18");
		giorno.addItem("19");
		giorno.addItem("20");
		giorno.addItem("21");
		giorno.addItem("22");
		giorno.addItem("23");
		giorno.addItem("24");
		giorno.addItem("25");
		giorno.addItem("26");
		giorno.addItem("27");
		giorno.addItem("28");
		giorno.addItem("29");
		giorno.addItem("30");
		giorno.addItem("31");

		f.add(giorno);

		sesso.addItem("M");
		sesso.addItem("F");

		f.add(sesso);

		f.setLayout(null);
			f.add(calcola);
		f.add(cancella);

		//Posizionamento dei bottoni, dei Textfield e delle etichette
		
		cognome.setBounds(35, 50,150,25);
		cog.setBounds(0,30,100,15);

		nome.setBounds(200, 50, 150, 25);
		nom.setBounds(150, 30, 100, 15);

		giorno.setBounds(365, 50, 40, 25);

		Mesi.setBounds(420, 50, 100, 25);

		anno.setBounds(540, 50, 50, 25);
		ann.setBounds(480, 30, 100, 15);

		comune.setBounds(35, 100, 150, 25);
		com.setBounds(0, 80, 100, 15);

		sesso.setBounds(200, 100, 40, 25);

		codice.setBounds(270, 100, 250, 25);
		cod.setBounds(260, 80, 100, 15);

		calcola.setBounds(150, 150, 150, 30);
		cancella.setBounds(350, 150, 150, 30);

		//azione del bottone calcola
		calcola.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String cognome1 = "", nome1 = "", comune1 = "", anno1 = "", mese1 = "", sesso1 = "";

				 int gg;
			         int index_mese;
		                 int index_sesso;
				 int index_giorno;

				cognome1 = cognome.getText();	// Il metodo getText acquisisce il testo contenuto nel TextField

				nome1 = nome.getText();

				comune1 = comune.getText();

				anno1 = anno.getText();
				//getSelectedIndex restituisce un intero che corrisponde all'indice selezionato e lo assegga a 
				index_mese = Mesi.getSelectedIndex(); 
								      // index_mese

				index_sesso = sesso.getSelectedIndex();

				sesso1 = Calcolo_codice.sex(index_sesso);

				index_giorno = giorno.getSelectedIndex();
			index_giorno++;// incremento index_giorno perche l'indice del getSelectedIndex parte da 0. Cosi' i giorni iniziano da 1!
				gg = Calcolo_codice.giorni(index_giorno, sesso1);
				if(cognome1.equals("") || nome1.equals("") || comune1.equals("") || anno1.equals(""))
					JOptionPane.showMessageDialog(null, "Campo mancante");
				else
				{
					String cod = Calcolo_codice.codice_fiscale_finale(cognome1, nome1, gg, index_mese , anno1, sesso1, comune1);
					if(cod.equals(""))
						JOptionPane.showMessageDialog(null, "Comune non trovato! Scrivi il comune con la prima lettera maiuscola. Non sono presenti comuni esteri!");
					else
					codice.setText(cod);
				}
				

			}
			});

				



		//azione del bottone cancella
		cancella.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				cognome.setText("");
				nome.setText("");
				comune.setText("");
				codice.setText("");
				anno.setText("");
			}
		});
		//azione del bottone calcola
		

		//Chiusura finestra
		f.addWindowListener(new WindowAdapter()
				{
					public void windowClosing(WindowEvent e)
		{
			System.exit(0);
		}
				});
		f.setVisible(true);
	}

}
