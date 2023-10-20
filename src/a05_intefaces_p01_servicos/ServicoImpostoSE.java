package a05_intefaces_p01_servicos;

public class ServicoImpostoSE {

	public Double calcularImposto(Double valor) {
		if (valor <= 100) {
			return valor * 0.2;
		} else {
			return valor * 0.15;
		}
	}
}
