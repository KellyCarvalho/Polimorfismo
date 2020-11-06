package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;
import entities.FuncionarioTerceirizado;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
List<Funcionario> funcionario = new ArrayList<>();


System.out.println("Quantos funcionários deseja adicionar?");
int n = sc.nextInt();

for(int i=0;i<n;i++) {
	System.out.println("Informe o nome do funcionário");
	String nome = sc.next();
	System.out.println("O funcionário é terceirizado? [y/n]");
	char ch = sc.next().charAt(0);
	System.out.println("Informe quantas horas o funcionário trabalha");
	int horas =sc.nextInt();
	System.out.println("Informe o valor por hora que o funcionário recebe");
	double valorHora =sc.nextDouble();
	if(ch=='y') {
		System.out.println("Qual o valor da despesa adicional?");
		double despesaAdicional = sc.nextDouble();
		
		
		Funcionario f = new FuncionarioTerceirizado(nome,horas,valorHora,despesaAdicional);
		funcionario.add(f);
	}else if(ch=='n') {
		Funcionario f = new Funcionario(nome,horas,valorHora);
		funcionario.add(f);
	}
	
	
	
}

	System.out.println(funcionario);





	}

}
