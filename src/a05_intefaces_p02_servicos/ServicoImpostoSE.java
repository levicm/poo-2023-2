package a05_intefaces_p02_servicos;

public class ServicoImpostoSE implements ServicoImposto {

	public Double calcularImposto(Double valor) {
		if (valor <= 100) {
			return valor * 0.2;
		} else {
			return valor * 0.15;
		}
	}
}
