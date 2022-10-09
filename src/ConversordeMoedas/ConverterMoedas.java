package ConversordeMoedas;
import javax.swing.JOptionPane;

public class ConverterMoedas {
	
	public static void main(String[] args) {
		
		FuncaoConverter converter = new FuncaoConverter();
		
		while(true) {
			String opcao = JOptionPane.showInputDialog(null, "Escolha uma opção ", "Menu", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Conversor de Moeda", "Conversor de Temperatura"}, "Escolha").toString();
			switch(opcao) {
				case "Conversor de Moeda":
					String option = JOptionPane.showInputDialog(null, "Escolha uma opção ", "Menu", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Converter Dolar", "Converter Euro"}, "Escolha").toString();
					switch(option) {
						case "Converter Dolar":
							String input = JOptionPane.showInputDialog("Insira um valor em reais");
							double valorRecebido = Double.parseDouble(input);
							converter.ConverterReaisParaDolar(valorRecebido);
						case "Converter Euro":
							String inpute = JOptionPane.showInputDialog("Insira um valor em reais");
							double valorRecebidoe = Double.parseDouble(inpute);
							converter.ConverterReaisParaEuro(valorRecebidoe);
				}
					
			}
		
		}
		
	}

}

