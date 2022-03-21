package entidade;

public class ContaPoupanca extends Conta{

	public double rendimento() {
		return getSaldo() * 0.07;
	}
	@Override
	public String toString() {
		return "Rendimento Mensal: R$ " + String.format("%.2f", rendimento());
	}
	
}
