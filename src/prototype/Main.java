package prototype;

/**
 * 
 * @author Dione
 *
 */
public class Main {

	public static void main(String[] args) {

		ClassicoRef01 violClassicoPrototype = new ClassicoRef01();
		ClassicoRef01 classicoNovo = (ClassicoRef01) violClassicoPrototype.clonar();

		classicoNovo.setValorVenda(471.50);
		System.out.println(classicoNovo.exibirInfo());

		FolkRef02 violFolkPrototype = new FolkRef02();
		FolkRef02 folkNovo = (FolkRef02) violFolkPrototype.clonar();

		folkNovo.setValorVenda(559.50);
		System.out.println(folkNovo.exibirInfo());

		FletRef03 violFletPrototype = new FletRef03();
		FletRef03 fletNovo = (FletRef03) violFletPrototype.clonar();

		fletNovo.setValorVenda(797.58);
		System.out.println(fletNovo.exibirInfo());

		JumboRef04 violJumboPrototype = new JumboRef04();
		JumboRef04 jumboNovo = (JumboRef04) violJumboPrototype.clonar();

		jumboNovo.setValorVenda(4998.0);
		System.out.println(jumboNovo.exibirInfo());

		SeteCordasRef05 violSeteCordasPrototype = new SeteCordasRef05();
		SeteCordasRef05 seteCordasNovo = (SeteCordasRef05) violSeteCordasPrototype.clonar();

		seteCordasNovo.setValorVenda(1650.0);
		System.out.println(seteCordasNovo.exibirInfo());

		DozeCordasRef06 violDozeCordasPrototype = new DozeCordasRef06();
		DozeCordasRef06 dozeCordasNovo = (DozeCordasRef06) violDozeCordasPrototype.clonar();

		dozeCordasNovo.setValorVenda(1618.68);
		System.out.println(dozeCordasNovo.exibirInfo());

		ZeroRef07 violZeroPrototype = new ZeroRef07();
		ZeroRef07 zeroNovo = (ZeroRef07) violZeroPrototype.clonar();

		zeroNovo.setValorVenda(774.60);
		System.out.println(zeroNovo.exibirInfo());

		DuploZeroRef08 violDuploZeroPrototype = new DuploZeroRef08();
		DuploZeroRef08 duploZeroNovo = (DuploZeroRef08) violDuploZeroPrototype.clonar();

		duploZeroNovo.setValorVenda(600.0);
		System.out.println(duploZeroNovo.exibirInfo());

		TriploZeroRef09 violTriploZeroPrototype = new TriploZeroRef09();
		TriploZeroRef09 triploZeroNovo = (TriploZeroRef09) violTriploZeroPrototype.clonar();

		triploZeroNovo.setValorVenda(800.0);
		System.out.println(triploZeroNovo.exibirInfo());
	}
}
