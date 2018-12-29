import java.io.IOException;

/**
	 * @title VisitanteGen
	 * 
	 * lista que gera e registra números de cadastro em ordem.
	 * 
	 * @version 1.0
	 * @creationDate 2018, Sep. 27th
	 * @author Gabriel Bittar Domingues
	 */
	public class Program{
	
	public static void main(String[] args) throws IOException {
		
		int dontClose = 3;
		
		System.out.println("+---Gerador de Cadastro---+");
		System.out.println("| Para gerar um novo nú-  |\n| mero insira o dígito 1  |\n"
				          +"| e pressione enter       |\n+-------------------------+");
		System.out.println("| Gera apenas números de  |\n| visitantes              |\n+-------------------------+");
		System.out.println("| Solicitar número?       |\n|                         |\n+-------------------------+");
		System.out.print("\n-->");
		
		Funcoes funcoes = new Funcoes();
		
		funcoes.geraNumero();
		
		//loop infinito para o programa não fechar no próximo dígito no prompt.
		while(dontClose == 3) {
			dontClose = 3;
		}
		
		}
}