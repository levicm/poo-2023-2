package a05_intefaces_p02_entidades;

public class Veiculo {
	
	private String modelo;
	private Double valorHora;
	private Double valorDia;
	
	public Veiculo() {
	}

	public Veiculo(String modelo, Double valorHora, Double valorDia) {
		this.modelo = modelo;
		this.valorHora = valorHora;
		this.valorDia = valorDia;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Double getValorHora() {
		return valorHora;
	}

	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}

	public Double getValorDia() {
		return valorDia;
	}

	public void setValorDia(Double valorDia) {
		this.valorDia = valorDia;
	}

	@Override
	public String toString() {
		return "Veiculo [modelo=" + modelo + ", valorHora=" + valorHora + ", valorDia=" + valorDia + "]";
	}
}
