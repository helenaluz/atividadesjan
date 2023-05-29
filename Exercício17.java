import java.text.DecimalFormat;
import java.util.Scanner;

/*Descreva um algoritmo que leia o número de inscrição e a altura de um atleta em uma competição e informe:

o número de inscrição e a altura do atleta mais alto;
o número de inscrição e a altura do atleta mais baixo;
a altura média do grupo de atletas.
A leitura deve ser finalizada ao digitar 0 para o número de inscrição.

inicio
double Maior  = 0;
double Menor = 3000;
double count = 0;
double alturaTotal = 0;
double Alto = 0;
double baixo = 0;
int AltoIns = 0;
int BaixoIns = 0;
int val = 0;
enquanto(true){
	escreva("Qual é o número de inscrição? (Insira 0 para sair)")
	leia(inscrição)
	se(inscrição == 0) {val = 1; break;}
	senao count++
	
	escreva("Qual é a altura?")
	leia(altura)
	AlturaTotal += altura
	se(altura > Maior){
		Alto  =  altura
		AltoIns = inscrição}
	se( altura < Menor){
		Baixo = altura
		BaixoIns = inscrição}
	}
double media = alturaTotal / count;
escreva(BaixoIns + " é o atleta mais baixo, com "+Baixo"m de altura.")
escreva(AltoIns + " é o atleta mais alto, com "+Alto+"m de altua.")
escreva(A média total do grupo é: "+media+"m.")
*/

public class Exercício17{
	public static void main(String[] args) {
		
		//DECLARAÇÕES
		Scanner scanner = new Scanner(System.in);
		DecimalFormat decimal = new DecimalFormat("0.00");
		
		//ENTRADA DE DADOS
		double Maior  = 0;
		double Menor = 3000;
		double count = 0;
		double alturaTotal = 0;
		double Alto = 0;
		double baixo = 0;
		int AltoIns = 0;
		int BaixoIns = 0;
		
		while(true) {
			System.out.println("Qual é o número de inscrição? (Insira 0 para sair)");
			int inscrição = scanner.nextInt();
			if(inscrição == 0) break;
			else count++;
			
			System.out.println("Qual é a altura em metros?");
			double altura = scanner.nextDouble();
			alturaTotal +=altura;
			if(altura > Maior) {
				Maior = altura;
				Alto = altura;
				AltoIns = inscrição;
			}
			if(altura < Menor) {
				Menor = altura;
				baixo = altura;
				BaixoIns = inscrição;
			}
			
		}
		//PROCESSAMENTO DE DADOS
		double media = alturaTotal/(double)count;
		
		
		//SAÍDA DE DADOS
		System.out.println(BaixoIns + " é o atleta mais baixo, com "+decimal.format(baixo)+"m de altura.");
		System.out.println(AltoIns + " é o atleta mais alto, com "+decimal.format(Alto)+"m de altura.");
		System.out.println("A média total do grupo é: "+decimal.format(media)+"m.");
		
		scanner.close();
		
	}
}