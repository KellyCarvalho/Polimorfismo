package entities;

public class Funcionario {
	
	private String nome;
	private Integer horas;
	private Double ValorHora;
	
	public Funcionario() {
		
	}

	public Funcionario(String nome, Integer horas, Double valorHora) {
	
		this.nome = nome;
		this.horas = horas;
		ValorHora = valorHora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	public Double getValorHora() {
		return ValorHora;
	}

	public void setValorHora(Double valorHora) {
		ValorHora = valorHora;
	}

	public double pagamento() {
		return ValorHora*horas;
	}


	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("Funcionario: "+nome+"\n");
		sb.append("Quantidades de horas que trabalha: "+horas+"\n");
		sb.append("Valor da hora: "+ValorHora+"\n");
		double pag = pagamento();
		sb.append("Pagamento: "+pag+"\n");
	
		
		return sb.toString();



	}

}
