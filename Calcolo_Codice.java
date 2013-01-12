import java.util.*;
import java.io.*;

public class Calcolo_codice
{

  public static String secondo_nome (String cognome) // Questo metodo restituisce la stringa di 3 caratteri del cognome fornito in input il cognome
	{
	 String cons = "",voc = "",codice = "";
	 char c;
	 int x=0,n;
	 
	 while (x<cognome.length())
	 {        
		 c = cognome.charAt(x);
		 if( (c =='A') || (c =='E') || (c =='I') || (c =='O')||(c =='U'))
               
                 voc = voc + cognome.charAt(x);
                         
		 else
                
			 cons = cons + cognome.charAt(x);
               
		 x++;
	 }
	 if(cons.length() >=3)
		 codice = codice + cons.substring(0,3); //Il metodo substring restituisce  la sottostringa da 0 a 3
                        
	 else
	 {
		 if(( cons.length() + voc.length() ) >=3)
		 {
			 n = cons.length();
			 codice = codice + cons.substring(0,n) + voc.substring(0,3-n);
		 }                             
		 else
			 codice = codice + cons.substring(0,cons.length()) + voc.substring(0,voc.length())+'X';
	 }
	 
	 return codice;
  }


	public static String primo_nome (String nome)
	{
		String cons = "",voc = "",codice = "";
		int lc,lv,x;
		char c;
		x=0;
		
		while (x<nome.length())
		{
			c = nome.charAt(x);
			if((c == 'A') || (c == 'E') ||(c == 'I') || (c == 'O') || (c == 'U'))
			
				voc = voc + nome.charAt(x);
			
			else
				cons = cons + nome.charAt(x);
			x=x+1;
		}
		
		lc=cons.length();
		lv=voc.length();
		
		if(lc>3)
		
			codice = codice + cons.substring(0,1)+ cons.substring(2,4);
		
		else switch (lc)
		{
			case 3: codice = codice + cons.substring(0,3);
				break;
			case 2:
			{ 
					if(lv>=1)
					
						codice = codice + cons.substring(0,2) + voc.substring(0,1);
					else
						codice = codice + cons.substring(0,2)+'X';
			}
			break;
			case 1:
			{
				if(lv>=2)
				
					codice = codice + cons.substring(0,1) + voc.substring(0,2);
				else 
					codice = codice + cons.substring(0,1) + voc.substring(0,1)+'X';
                               
                         }
		}
		return codice;
	}

	public static String an(String anno_nascita)
	{
		String ann = "";
		ann = anno_nascita.substring(2,4);

		return ann;
	}
	
	public static String Mensile(int index)
	  {
		  String cmese = "";
		  
		  if (index == 0){ cmese="A";}
		  if (index == 1){ cmese="B";}
		  if (index == 2){ cmese="C";}
		  if (index == 3){ cmese="D";}
		  if (index == 4){ cmese="E";}
		  if (index == 5){ cmese="H";}
		  if (index == 6){ cmese="L";}
		  if (index == 7){ cmese="M";}
		  if (index == 8){ cmese="P";}
		  if (index == 9){ cmese="R";}
		  if (index == 10){ cmese="S";}
		  if (index == 11){ cmese="T";}
								          

		  return cmese;
	  }

	public static String sex(int index)
	{
		String sesso = "";
		if(index == 0) { sesso = "M"; }
		if(index == 1) { sesso = "F"; }

		return sesso;
	}


	public static int giorni(int giorno, String sesso)
	{	
		if((sesso.equals("F")))
			giorno = giorno+40;

		return giorno;
	}

	public static String eliminaSpazi(String s)
	{
		
		String s1 = "";
		
		s1 = s.replaceAll(" ","");
		return s1;
	}

	public static char codiceControllo(String codice15cifre)
	{
		char caratterediControllo = '\0';

		char c = '\0';
		int numeroditabellap = 0;
		int numeroditabellad = 0;
		int numerodadividere = 0;
		int risultato;
		int x=1; // x parte da zero perche' qui si tengono conto i caratteri di posizione pari

		while(x<codice15cifre.length())
		{
			c =  codice15cifre.charAt(x);
			// in questo caso la tabella del codice fiscale e' quella pari
			if(c == '0') { numeroditabellap = 0; }
			if(c == '1') { numeroditabellap = 1; }
			if(c == '2') { numeroditabellap = 2; }
			if(c == '3') { numeroditabellap = 3; }
			if(c == '4') { numeroditabellap = 4; }
			if(c == '5') { numeroditabellap = 5; }
			if(c == '6') { numeroditabellap = 6; }
			if(c == '7') { numeroditabellap = 7; }
			if(c == '8') { numeroditabellap = 8; }
			if(c == '9') { numeroditabellap = 9; }
			if(c == 'A') { numeroditabellap = 0; }
			if(c == 'B') { numeroditabellap = 1 ;}
			if(c == 'C') { numeroditabellap = 2; }
			if(c == 'D') { numeroditabellap = 3; }
			if(c == 'E') { numeroditabellap = 4; }
			if(c == 'F') { numeroditabellap = 5; }
			if(c == 'G') { numeroditabellap = 6; }
			if(c == 'H') { numeroditabellap = 7; }
			if(c == 'I') { numeroditabellap = 8; }
			if(c == 'J') { numeroditabellap = 9; }
			if(c == 'K') { numeroditabellap = 10; }
			if(c == 'L') { numeroditabellap = 11; }
			if(c == 'M') { numeroditabellap = 12; }
			if(c == 'N') { numeroditabellap = 13; }
			if(c == 'O') { numeroditabellap = 14; }
			if(c == 'P') { numeroditabellap = 15; }
			if(c == 'Q') { numeroditabellap = 16; }
			if(c ==	'R') { numeroditabellap = 17; }
			if(c == 'S') { numeroditabellap = 18; }
			if(c == 'T') { numeroditabellap = 19; }
			if(c == 'U') { numeroditabellap = 20; }
			if(c == 'V') { numeroditabellap = 21; }
			if(c == 'W') { numeroditabellap = 22; }
			if(c == 'X') { numeroditabellap = 23; }
			if(c == 'Y') { numeroditabellap = 24; }
			if(c == 'Z') { numeroditabellap = 25; }

			numerodadividere = numerodadividere + numeroditabellap; // il numero di tabella e' un numero deciso nell'algoritmo del codice fiscale
			x = x+2; // la x viene incrementata di 2 perche' teniamo conto dei caratteri di posizione pari, quindi presi a due a due
		}

	       int y = 0; //x parte da 1 perche qui si tiene conto dei caratteri di posizione dispari
		char car = '\0'; 
	//	numeroditabella = 0;
		while(y<codice15cifre.length())
		{
			car = codice15cifre.charAt(y);
			//in questo caso la tabella del codice fiscale e' quella dispari
			if(car == '0') { numeroditabellad = 1; }
			if(car == '1') { numeroditabellad = 0; }
			if(car == '2') { numeroditabellad = 5; }
			if(car == '3') { numeroditabellad = 7; }
			if(car == '4') { numeroditabellad = 9; }
			if(car == '5') { numeroditabellad = 13; }
			if(car == '6') { numeroditabellad = 15; }
			if(car == '7') { numeroditabellad = 17; }
			if(car == '8') { numeroditabellad = 19; }
			if(car == '9') { numeroditabellad = 21; }
			if(car == 'A') { numeroditabellad = 1; }
			if(car == 'B') { numeroditabellad = 0 ;}
			if(car == 'C') { numeroditabellad = 5; }
			if(car == 'D') { numeroditabellad = 7; }
			if(car == 'E') { numeroditabellad = 9; }
			if(car == 'F') { numeroditabellad = 13; }
			if(car == 'G') { numeroditabellad = 15; }
			if(car == 'H') { numeroditabellad = 17; }
			if(car == 'I') { numeroditabellad = 19; }
			if(car == 'J') { numeroditabellad = 21; }
			if(car == 'K') { numeroditabellad = 2; }
			if(car == 'L') { numeroditabellad = 4; }
			if(car == 'M') { numeroditabellad = 18; }
			if(car == 'N') { numeroditabellad = 20; }
			if(car == 'O') { numeroditabellad = 11; }
			if(car == 'P') { numeroditabellad = 3; }
			if(car == 'Q') { numeroditabellad = 6; }
			if(car == 'R') { numeroditabellad = 8; }
			if(car == 'S') { numeroditabellad = 12; }
			if(car == 'T') { numeroditabellad = 14; }
			if(car == 'U') { numeroditabellad = 16; }
			if(car == 'V') { numeroditabellad = 10; }
			if(car == 'W') { numeroditabellad = 22; }
			if(car == 'X') { numeroditabellad = 25; }
			if(car == 'Y') { numeroditabellad = 24; }
			if(car == 'Z') { numeroditabellad = 23; }
			numerodadividere = numerodadividere + numeroditabellad;

			y = y+2;//x parte da 1 quindi incrementiamo di 2 per prenderci le posizioni dispari

		}
		risultato = numerodadividere % 26; // ci serve il resto della divisione per 26. Il 26 e' un numero fisso presente nell'algoritmo del codice fiscale.
		if(risultato == 0) { caratterediControllo = 'A'; }
		if(risultato == 1) { caratterediControllo = 'B'; }
		if(risultato == 2) { caratterediControllo = 'C'; }
		if(risultato == 3) { caratterediControllo = 'D'; }
		if(risultato == 4) { caratterediControllo = 'E'; }
		if(risultato == 5) { caratterediControllo = 'F'; }
		if(risultato == 6) { caratterediControllo = 'G'; }
		if(risultato == 7) { caratterediControllo = 'H'; }
		if(risultato == 8) { caratterediControllo = 'I'; }
		if(risultato == 9) { caratterediControllo = 'J'; }
		if(risultato == 10) { caratterediControllo = 'K'; }
		if(risultato == 11) { caratterediControllo = 'L'; }
		if(risultato == 12) { caratterediControllo = 'M'; }
		if(risultato == 13) { caratterediControllo = 'N'; }
		if(risultato == 14) { caratterediControllo = 'O'; }
		if(risultato == 15) { caratterediControllo = 'P'; }
		if(risultato == 16) { caratterediControllo = 'Q'; }
		if(risultato == 17) { caratterediControllo = 'R'; }
		if(risultato == 18) { caratterediControllo = 'S'; }
		if(risultato == 19) { caratterediControllo = 'T'; }
		if(risultato == 20) { caratterediControllo = 'U'; }
		if(risultato == 21) { caratterediControllo = 'V'; }
		if(risultato == 22) { caratterediControllo = 'W'; }
		if(risultato == 23) { caratterediControllo = 'X'; }
		if(risultato == 24) { caratterediControllo = 'Y'; }
		if(risultato == 25) { caratterediControllo = 'Z'; }

		return caratterediControllo;
	}

	public static String codiciComuni(String comune) //Questo metodo legge dal file listacomuni.txt
	{
		String s = "";
		String cod = "";
		String com = "";
		FileReader f = null;
		BufferedReader fIN = null;

		try
		{
			f = new FileReader("listacomuni.txt");
			fIN = new BufferedReader(f);
		}
		catch(IOException e)
		{
			System.out.println("Errore");
		}
		try
		{
			s = fIN.readLine();
			while(s != null) // il while scorre tutto il file listacomuni.txt
			{
				StringTokenizer st = new StringTokenizer(s, ";"); //StringTokenizer e' una classe che consente di dividere una stringa in pezzi
				
				int i;
				for(i=0; i<2; i++) // questo for prende il token numero 2 e lo assegna a com
					com = st.nextToken();
				if(com.equals(comune)) //l'if controlla se il token numero 2 e' uguake al comune dato in input
				{
					StringTokenizer c = new StringTokenizer(s, ";"); //istanzio un altro Stringokenizer 
					int j;
					for(j=0; j<7; j++)// questo for pre il token numero 7 e lo assegna a cod che contiene il codice del comune che sara' restituito
						          // al metodo
						cod = c.nextToken();
				}
				s = fIN.readLine();// se il token numero due non e' uguale a quello della prima riga si passa alla seconda acquisendola con readLine()
						   // Accade la stesso cosa fino alla fine del file
			}

		}
		catch(IOException e)
		{
			System.out.println("Error");
		}
		try
		{
			f.close();
		}
		catch(IOException e)
		{
			System.out.println("Error");
		}
		return cod;
	}

	public static String codice_fiscale_finale (String cognome, String nome, int giorno, int index, String years, String sesso, String comune)
	{
		String er = "";
		cognome = Calcolo_codice.eliminaSpazi(cognome);
		cognome = cognome.toUpperCase();

		nome = Calcolo_codice.eliminaSpazi(nome);
		nome = nome.toUpperCase();

		years = Calcolo_codice.an(years);
		
		comune = Calcolo_codice.codiciComuni(comune);
		if(comune.equals(""))
			return er;
		else
		{
		comune = comune.toUpperCase();

		String m = Calcolo_codice.Mensile(index);

		String p1 = Calcolo_codice.secondo_nome(cognome);
		String p2 = Calcolo_codice.primo_nome(nome);

		String cod ="";

		if(giorno == 1 || giorno == 2 || giorno == 3 || giorno == 4 || giorno == 5 || giorno == 6 || giorno == 7 || giorno == 8 || giorno == 9)
			 cod = p1+ p2+ years + m +"0"+ giorno + comune;
		else
			cod = p1+ p2+ years + m + giorno + comune;	
		char c = Calcolo_codice.codiceControllo(cod);

		String cf = "";

		if(giorno == 1 || giorno == 2 || giorno == 3 || giorno == 4 || giorno == 5 || giorno == 6 || giorno == 7 || giorno == 8 || giorno == 9)
			 cf = p1+ " " + p2+ " " + years + m +"0"+ giorno + comune + c;
		else
			cf = p1+ " " + p2+ " " + years + m +  giorno +comune + c;

		return cf;
		}
	}

}
