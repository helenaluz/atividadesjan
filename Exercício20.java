import java.text.DecimalFormat;
import java.util.Scanner;

/*Um determinado material radioativo perde metade de sua massa a cada 50 segundos. Dada a sua massa inicial em Kg, descreva um 
algoritmo que determine o tempo necessário para que essa massa se torne menor que 0,5 gramas. Escreva a massa inicial, a massa 
final e o tempo.

inicio
escreva("Massa incial em Kg: ")
leia(m0)
double t  = 0;
double m1 = m0;
enquanto(massaFinal >= 0.0005) {
        m1 = m1 / 2
        t = t + 50}
double m = m0/Math.pow(2,t)
escreva("Massa inicial: "+m0)
escreva("Massa final: "+m)
escreva("Tempo: "+t))
fim

*/
public class Exercício20{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat decimal = new DecimalFormat("0.00");
		System.out.println("Massa incial em g: ");
		double m0 = scanner.nextDouble();
		double t = 0;
        double m1 = m0;
        while (m1 >= 0.5) {
            m1 = m1 / 2;
            t = t + 50;
        }
        
        System.out.println("Massa inicial: " +decimal.format(m0) + " g");
        System.out.println("Massa final: " + decimal.format(m1) + " g");
        System.out.println("Tempo necessário: " + decimal.format(t) + " segundos");
		scanner.close();
	}
}
