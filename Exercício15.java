import java.text.DecimalFormat;
import java.util.Scanner;

/*Dada uma turma de alunos, contendo seu nome e nota de duas provas descreva um algoritmo para informar a média de cada aluno. 
 * Considere que a leitura dos dados deve ser finalizada quando o nome do aluno for “fim”.
inicio
string nome = null
equanto(nome != "fim"){
	escreva("Informe um nome: (nome=fim para parar)")
	leia(nome)
	escreva("Nota 1:")
	leia(n1)
	escreva("Nota 2:")
	leia(n2)
	double media = (double) (n1+n2)/2}
	escreva("Média: "+media)}
 */
public class Exercício15{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat decimal = new DecimalFormat("0.0");
		
		String nome = null;
		while(true) {
			System.out.println("Informe um nome: (nome=fim para parar)");
			nome = scanner.nextLine();
			if(nome.equals("fim")) break;
			System.out.println("Nota 1: ");
			double n1 = scanner.nextDouble();
			System.out.println("Nota 2: ");
			double n2 = scanner.nextDouble();
			
			double media = (n1+n2)/2;
			
			System.out.println("Média: "+decimal.format(media));
			scanner.nextLine();
		}
		
		scanner.close();
	}
}