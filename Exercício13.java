import java.text.DecimalFormat;
import java.util.Scanner;

/*Um motorista acaba de voltar de um feriado prolongado. Antes de sair de viagem e imediatamente após retornar, o motorista encheu o 
 * tanque do veículo e registrou as medidas do odômetro. Em cada parada feita durante a viagem, foi registrado o valor do odômetro e a
 *  quantidade de combustível comprado para reabastecer o veículo (suponha que o tanque foi enchido a cada parada). Descreva um 
 *  algoritmo que leia o número total de reabastecimentos feitos e os dados registrados relativos à compra de combustível. Calcule e 
 *  escreva:
 

a quilometragem obtida por litro de combustível em cada parada;
a quilometragem média obtida por litro de combustível em toda a viagem.

inicio
escreva("NUMERO TOTAL DE REABASTECIMENTO")
leia(reabastecimento)
escreva("Odometro")
leia(odometro)
escreva(Quantidade de combustivel)
leia(combustivel)

double kmL = odometro /litro
double kmMedio = odometro/reabastecimento
double KmMedioL = KmMedio/litro

escreva(kmL)
escreva(KmMedioL)
fim
*/

public class Exercício13{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat decimal = new DecimalFormat("0.00");
		
		System.out.println("Número total de paradas:");
		int paradas = scanner.nextInt();
		System.out.println("Kilometragem total:");
		double km = scanner.nextDouble();
		System.out.println("Quantidade de combustível total:");
		double combustivel = scanner.nextDouble();
		
		double kmL = km/combustivel;
		double KmMedio = km/paradas;
		double KmMedioL = KmMedio/combustivel;
		
		System.out.println("Quilometragem obtida por litro de combustível em cada parada: "+decimal.format(KmMedioL)+ " km/l");
		System.out.println("Quilometragem média obtida por litro de combustível em toda a viagem: "+decimal.format(kmL)+" km/l");
		
		scanner.close();
	}
}