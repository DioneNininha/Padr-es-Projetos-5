package prototype;

/**
 * 
 * @author Dione
 *
 */
public abstract class FabricaViolaoPrototype {

	protected double valorVenda;

	public abstract String exibirInfo();

	public abstract FabricaViolaoPrototype clonar();

	public double getValorVenda() {

		return valorVenda;
	}

	public void setValorVenda(double valorVenda) {

		this.valorVenda = valorVenda;
	}
}
