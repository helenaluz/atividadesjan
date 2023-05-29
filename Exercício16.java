import java.text.DecimalFormat;
import java.util.Scanner;

/*Dado um determinado grupo de pessoas, descreva um algoritmo que a partir da altura e do gênero (gênero = 'M' ou gênero = 'm' para 
 * masculino; gênero = 'F' e gênero = 'f' para feminino ou gênero = 'O' ou gênero = 'o' para outro) de cada pessoa informe a média da 
 * altura das mulheres e a média de altura do grupo. A leitura deve ser finalizada ao digitar 0 para a altura.
inicio
double altura mulheer
 */

public class Exercício16{
	public static void main(String[] args) {
		
		//DECLARAÇÕES
		Scanner scanner = new Scanner(System.in);
		DecimalFormat decimal = new DecimalFormat("0.00");
		
		
		//ENTRADA DE DADOS
		double countMulher = 0;
		double countGrupo = 0;
		double alturaMulher =0;
		double alturaGrupo = 0;
		double val =0;
		while(true) {
			System.out.println("Insira a altura da pessoa *em metros*: (DIGITE 0 PARA PARAR A ENTRADA DE DADOS)");
			double altura = scanner.nextDouble();
			
			if(altura == 0) {val = 1;break;}
			else {countGrupo++; alturaGrupo += altura;}
			
			System.out.println("Insira o seu genero: (F- Femea |M- Macho |O- Outro)");
			char genero = scanner.next().toLowerCase().charAt(0);
			
			if(genero == 'f') { countMulher++; alturaMulher += altura;}
		}
		
		if(val != 0) {
			
			//PROCESSAMENTO DE DADOS
			double MediaMulher  = alturaMulher/countMulher;
			double MediaGrupo = alturaGrupo/countGrupo;
			
			//SAÍDA DE DADOS
			System.out.println("Média das alturas das mulheres: "+ decimal.format(MediaMulher)+"m.");
			System.out.println("Média das alturas do grupo: "+decimal.format(MediaGrupo)+ "m.");
		}
		
		//FECHAMENTO
		scanner.close();
	}
}