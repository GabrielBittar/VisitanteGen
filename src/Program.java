import java.io.IOException;

/**
	 * @title VisitanteGen
	 * 
	 * lista que gera e registra n�meros de cadastro em ordem.
	 * 
	 * @version 1.0
	 * @creationDate 2018, Sep. 27th
	 * @author Gabriel Bittar Domingues
	 */
	public class Program{
	
	public static void main(String[] args) throws IOException {
		
		int dontClose = 3;
		
		System.out.println("+---Gerador de Cadastro---+");
		System.out.println("| Para gerar um novo n�-  |\n| mero insira o d�gito 1  |\n"
				          +"| e pressione enter       |\n+-------------------------+");
		System.out.println("| Gera apenas n�meros de  |\n| visitantes              |\n+-------------------------+");
		System.out.println("| Solicitar n�mero?       |\n|                         |\n+-------------------------+");
		System.out.print("\n-->");
		
		Funcoes funcoes = new Funcoes();
		
		funcoes.geraNumero();
		
		//loop infinito para o programa n�o fechar no pr�ximo d�gito no prompt.
		while(dontClose == 3) {
			dontClose = 3;
		}
		
		}
}