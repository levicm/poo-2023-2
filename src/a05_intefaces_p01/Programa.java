package a05_intefaces_p01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import a05_intefaces_p01_entidades.Aluguel;
import a05_intefaces_p01_entidades.Veiculo;
import a05_intefaces_p01_servicos.ServicoAluguel;

public class Programa {

	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime retirada = LocalDateTime.parse("25/06/2018 10:30", formatter);
		LocalDateTime devolucao = LocalDateTime.parse("25/06/2018 14:40", formatter);

		Veiculo veiculo = new Veiculo("Civic", 10d, 130d);
		Aluguel aluguel = new Aluguel(retirada, devolucao, veiculo);

		ServicoAluguel servicoAluguel = new ServicoAluguel();
		servicoAluguel.processaFatura(aluguel);
		System.out.println(aluguel);
	}

}
