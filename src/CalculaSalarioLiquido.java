import java.util.Scanner;


public class CalculaSalarioLiquido {

	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Horas trabalhadas: ");
		double horas = entrada.nextDouble();
		System.out.print("Salário por hora: ");
		double salarioPorHora = entrada.nextDouble();
		System.out.print("Número de dependentes: ");
		int dependentes = entrada.nextInt();
		
		System.out.println("Salário líquido: "+calcularSalario(horas, salarioPorHora, dependentes));
	}
	
	public static double calcularSalario(double horas, double salarioPorHora, int dependentes) {
		
		double salarioBruto = horas * salarioPorHora + (50 * dependentes);
		
		double descontoInss = 0;
		
		if(salarioBruto <= 1000){
			descontoInss = salarioBruto * 8.5/100;
		}else{
			descontoInss = salarioBruto * 9/100;
		}
		
		double descontoIr = 0;
		
		if(salarioBruto > 500 && salarioBruto < 1000){
			descontoIr = salarioBruto * 5/100;
		}else{
			descontoIr = salarioBruto * 7/100;
		}
		
		double salarioLiquido = (salarioBruto - descontoIr - descontoInss);
		
		return Math.round(salarioLiquido);
	}

}
