package a05_intefaces_p01_entidades;

public class Fatura {

	private Double valorTotal;
	private Double imposto;
	
	public Fatura() {
	}

	public Fatura(Double valorTotal, Double imposto) {
		this.valorTotal = valorTotal;
		this.imposto = imposto;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Double getImposto() {
		return imposto;
	}

	public void setImposto(Double imposto) {
		this.imposto = imposto;
	}

	public String toString() {
		return "Fatura [valorTotal=" + valorTotal + ", imposto=" + imposto + "]";
	}
}
