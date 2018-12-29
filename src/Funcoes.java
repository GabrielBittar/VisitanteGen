import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Funcoes{

	protected void geraNumero() {
		
		Scanner input = new Scanner(System.in);
		
		//armazena o comando em "a".
		int a = 0;
		do {
			try {
				a = input.nextInt();
			}catch (InputMismatchException e) {
				System.out.printf("%nComando incorreto. Insira o comando (1)%n");
			}if(a != 1){
				System.out.printf("%nÚnico comando possível é: 1%nCaso não queira solicitar,%nfeche o programa.%n%n");
			}
			input.nextLine();
		}while (a != 1);
		
		if (a == 1) {
			String last = "";
			try {
				//-------------------------------> Lê o TXT no local configurado:
				// (setar o nome e local do FileInputStream de acordo com onde for instalar).
				InputStream is = new FileInputStream("W:\\VisitangeGen\\arq.txt");
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);

				String line = "";
				while (line != null) {
					line = br.readLine();
					if (line != null) {
						last = line;
					}
				}
				String lastToNumber = last;
				char b[] = lastToNumber.toCharArray();
				int number = Integer.parseInt(new String(b));
				System.out.println();
				System.out.println("O número gerado é: " + number);
				br.close();
				//--------------------------------------->escreve:
				Locale brasil = new Locale("pt", "BR");
				Date data = new Date();
				DateFormat f = DateFormat.getDateInstance(DateFormat.FULL, brasil);
				GregorianCalendar clock = new GregorianCalendar();
				SimpleDateFormat formating = new SimpleDateFormat("HH:mm:ss", brasil);

				File file = new File("W:\\VisitangeGen\\arq.txt");
				BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));

				writer.newLine();
				writer.write("+----------------------------------------+");
				writer.newLine();
				writer.write("" + f.format(data));
				writer.newLine();
				writer.write(formating.format(clock.getTime()));
				writer.newLine();
				writer.newLine();
				writer.write("Número cadastrado agora:");
				writer.newLine();
				writer.write(""+number);
				writer.newLine();
				writer.write("Próximo número a usar:");
				writer.newLine();
				int numberEscreve = ++number;
				writer.write(String.valueOf(numberEscreve));
				writer.close();
				
				input.close();
			}
			catch (IOException e) {
				e.printStackTrace();
			} catch (NumberFormatException e) {
				System.out.println("Número com formato errado!\nOu problema no arquivo 'is'");
			}
		}
}
}