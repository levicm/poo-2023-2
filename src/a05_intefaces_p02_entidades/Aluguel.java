package a05_intefaces_p02_entidades;

import java.time.LocalDateTime;

public class Aluguel {
	
	private LocalDateTime retirada;
	private LocalDateTime devolucao;
	private Veiculo veiculo;
	private Fatura fatura;
	
	public Aluguel() {
	}

	public Aluguel(LocalDateTime retirada, LocalDateTime devolucao, Veiculo veiculo) {
		this.retirada = retirada;
		this.devolucao = devolucao;
		this.veiculo = veiculo;
	}

	public LocalDateTime getRetirada() {
		return retirada;
	}

	public LocalDateTime getDevolucao() {
		return devolucao;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public Fatura getFatura() {
		return fatura;
	}

	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
	}

	@Override
	public String toString() {
		return "Aluguel [retirada=" + retirada + ", devolucao=" + devolucao + ", veiculo=" + veiculo + ", fatura="
				+ fatura + "]";
	}

	
}
