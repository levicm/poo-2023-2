package a05_intefaces_p01_servicos;

import java.time.Duration;

import a05_intefaces_p01_entidades.Aluguel;
import a05_intefaces_p01_entidades.Fatura;

public class ServicoAluguel {

	public void processaFatura(Aluguel aluguel) {
		// Encontrar o tempo do aluguel
		long minutos = Duration.between(aluguel.getRetirada(), aluguel.getDevolucao()).toMinutes();
		double horas = Math.ceil(minutos / 60d);

		// Calcular o valor básico
		Double valor;
		if (horas <= 12) {
			valor = aluguel.getVeiculo().getValorHora() * horas;
		} else {
			double dias = Math.ceil(horas / 24d);
			valor = aluguel.getVeiculo().getValorDia() * dias;
		}

		// Calcular o imposto
		Double imposto = new ServicoImpostoSE().calcularImposto(valor);

		// Gerar a fatura e guardar na entidade Aluguel
		Fatura fatura = new Fatura(valor, imposto);
		aluguel.setFatura(fatura);
	}
}



