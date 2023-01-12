import java.util.Scanner;

public class Pagamento {

	public static void main(String[] args) {
		
		float preco=180000;
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Digite o valor da entrada");
		float entrada=teclado.nextFloat();
		if (entrada==preco) {
			System.out.println("Você pagou a vista");}
			else {
		
				
		boolean bool=false;
		do {	
			bool=false;
		
	
		System.out.println("Você deseja pagar de que forma?");
		System.out.println("1 - Para pagar em 24 vezes");
		System.out.println("2 - Para pagar em 48 vezes");
		System.out.println("3 - Para pagar em 72 vezes");
		
		int opcao=teclado.nextInt();
		
		
		switch(opcao){
			
			case 1:	
				System.out.println("Pagamento em 24 vezes no valor de: \n"+ "Entrada:"+ entrada +"\nParcelamento: 24x "+ (preco-entrada)/24);
				bool=false;
				break;
			case 2:	
				System.out.println("Pagamento em 48 vezes no valor de: \n"+ "Entrada:"+ entrada +"\nParcelamento: 48x"+ (preco-entrada)/48);
				bool=false;
				break;
			case 3:	
				System.out.println("Pagamento em 72 vezes no valor de: \n"+ "Entrada:"+ entrada +"\nParcelamento: 72x"+ (preco-entrada)/72);
				bool=false;
				break;
			default:
				System.out.println("Você digitou o valor inválido. Tente novamente");
				bool=true;
				break;
		} 
		}while (bool==true);
		
	}}}