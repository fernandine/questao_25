package applicacao;

import java.util.Locale;

import entidade.ContaCorrente;
import entidade.ContaPoupanca;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		ContaCorrente corrente = new ContaCorrente();
		ContaPoupanca poupanca = new ContaPoupanca();

		System.out.println("*******CONTA POUPANÇA*************");
		poupanca.setNumero(1);
		System.out.println("Numero da conta: " + poupanca.getNumero() );
		poupanca.setTitular("Maria");
		System.out.println("Titular: " + poupanca.getTitular());
		poupanca.setSaldo(1100.00);
		System.out.println("Saldo da conta: R$" + String.format("%.2f", poupanca.getSaldo()));
		System.out.println(poupanca);
		System.out.println("*******CONTA CORRENTE*************");
		corrente.setNumero(2);
		System.out.println("Numero da conta: " + corrente.getNumero() );
		corrente.setTitular("Paulo");
		System.out.println("Titular: " + corrente.getTitular());
		corrente.setSaldo(2500.00);
		System.out.println("Saldo da conta: R$" + String.format("%.2f", corrente.getSaldo()));
		System.out.println(corrente);
		
		
	}

}
