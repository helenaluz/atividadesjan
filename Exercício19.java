import java.text.DecimalFormat;
import java.util.Scanner;

/*Uma loja de departamentos oferece para seus clientes um determinado desconto de acordo com o valor da compra efetuada. O desconto é 
 * de 20% caso o valor da compra seja maior que R$ 500,00 e de 15% caso seja menor ou igual. Descreva um algoritmo que leia o valor da 
 * compra e escreva o total a pagar a cada compra. Informe também o valor total recebido pela loja ao final do dia. A leitura deve ser 
 * finalizada com a leitura 0 para o valor da compra.
 * 
 inicio
double desc = 1.0;
double total  = 0;
 equanto(verdadeiro){
 	escreva("Preço: ")
 	leia(preço)
 	se(preço == 0) break;
 	desc = preço>500.00 ? 0.8 : 0.75;
 	preço  = preço *desc;
 	escreva("Total á pagar"+preço)
 	total += preço}
 escreva("Total da loja no fim do dia: R$"+total)
 */

public class Exercício19{
	public static void main(String[] args) {
		//DECLARAÇÕES
		Scanner scanner = new Scanner(System.in);
		DecimalFormat decimal = new DecimalFormat("0.00");
		
		//ENTRADA DE DADOS
		double desc = 1.0;
		double total  = 0;
		while(true) {
			System.out.println("Preço: ");
			double preço = scanner.nextDouble();
			if(preço == 0) break;
			desc = preço>500.00 ? 0.8 : 0.85;
			preço  = preço *desc;
			System.out.println("Total à pagar: R$"+decimal.format(preço));
			total += preço;
		}
		
		//SAÍDA DE DADOS
		System.out.println("Total da loja: R$"+decimal.format(total));
		//FECHAMENTO
		scanner.close();
	}
}