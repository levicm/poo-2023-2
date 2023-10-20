package a05_intefaces_p02_servicos;

import java.time.Duration;

import a05_intefaces_p02_entidades.Aluguel;
import a05_intefaces_p02_entidades.Fatura;

public class ServicoAluguel {
	
	private ServicoImposto servicoImposto;
	
	public ServicoAluguel(ServicoImposto servicoImposto) {
		this.servicoImposto = servicoImposto;
	}

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
		Double imposto = servicoImposto.calcularImposto(valor);

		// Gerar a fatura e guardar na entidade Aluguel
		Fatura fatura = new Fatura(valor, imposto);
		aluguel.setFatura(fatura);
	}
}



