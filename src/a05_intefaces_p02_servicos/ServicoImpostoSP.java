package a05_intefaces_p02_servicos;

public class ServicoImpostoSP implements ServicoImposto {

	public Double calcularImposto(Double valor) {
		if (valor <= 100) {
			return valor * 0.22;
		} else {
			return valor * 0.17;
		}
	}
}
