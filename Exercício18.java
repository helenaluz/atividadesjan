import java.text.DecimalFormat;
import java.util.Scanner;

/*Foi feita uma pesquisa de audiência de canal de TV em n casas de um determinado bairro de uma cidade, em um certo dia do mês. Na 
 * pesquisa foi utilizado um coletor de dados portátil. Para cada casa visitada, foi fornecido o número do canal (4, 5, 9, 12) e o 
 * número de pessoas que estavam assistindo a TV naquele horário, considerando que em cada casa só existia uma televisão. Em casas 
 * onde a televisão estava desligada, foi registrado zero para o número do canal e para o número de pessoas. Baseado nisto descreva 
 * um algoritmo que calcule e escreva, para cada emissora, o percentual de audiência. A leitura deve ser finalizada quando for 
 * informado canal 0.
 * 
 inicio
 int countTotal = 0;
 int count4 = 0;
 int count5 = 0;
 int count9 = 0;
 int count12 = 0;
 
 enquanto(true){
 	escreva("Qual canal está assistindo? - Insira 0 para sair")
 	ler(canal)
 	countTotal++
 	se(canal == 0) break;
 	escolha(canal){
 	 	caso 4: count4++
 	 	caso5: count5++
 	 	caso9: count9++
 	 	caso12: count12++
 	 	default: break;}
 	}
 	
 	double percent4 = (count4*100)/countTotal;
 	double percent5 = (count5*100)/countTotal;
 	double percent9 = (count9*100)/countTotal;
 	double percent12 = (count12*100)/countTotal;
 	
 	escreva("Percentual de audiencia da emissor 4: "+percent4+"%")
 	escreva("Percentual de audiencia da emissor 5 "+percent5+"%")
 	escreva("Percentual de audiencia da emissor 9: "+percent9+"%")
 	escreva("Percentual de audiencia da emissor 12: "+percent12+"%")
 */

public class Exercício18{
	public static void main(String[] args) {
		
		//DECLARAÇÕES
		Scanner scanner = new Scanner(System.in);
		DecimalFormat decimal = new DecimalFormat("0.00");
		
		//ENTARDA DE DADOS
		 int countTotal = 0;
		 int count4 = 0;
		 int count5 = 0;
		 int count9 = 0;
		 int count12 = 0;
		 
		 while(true) {
			 System.out.println("Qual canal está assistindo? - Insira 0 para sair");
			 int canal  = scanner.nextInt();
			 if (canal == 0) break;
			 switch(canal) {
			 case 4: count4++;break;
			 case 5: count5++;break;
			 case 9: count9++;break;
			 case 12: count12++;break;
			 default: break;
			 } 
		 }
		 
		 //PROCESSAMENTO DE DADOS
		 double percent4 = (count4*100)/countTotal;
		 double percent5 = (count5*100)/countTotal;
		 double percent9 = (count9*100)/countTotal;
		 double percent12 = (count12*100)/countTotal;
		 
		 //SAÍDA DE DADOS
		 System.out.println("Percentual de audiencia da emissor 4: "+decimal.format(percent4)+"%");
		 System.out.println("Percentual de audiencia da emissor 5 "+decimal.format(percent5)+"%");
		 System.out.println("Percentual de audiencia da emissor 9: "+decimal.format(percent9)+"%");
		 System.out.println("Percentual de audiencia da emissor 12: "+decimal.format(percent12)+"%");
		 
		 
		 //FECHAMENTO
		 scanner.close();
	}
}