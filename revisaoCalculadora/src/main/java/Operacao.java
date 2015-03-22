
public class Operacao {
	public static double resultado;
	
	//metodo que de fato vai realizar as operacoes
	public void realizarOperacao(Calculadora calculadora, String op) {
		// TODO Auto-generated method stub
		double pvalor, svalor;
		pvalor = Double.parseDouble(calculadora.getPvalor());
		svalor = Double.parseDouble(calculadora.getSvalor());
		
		if(filtroOperacao(op) == 1) resultado = pvalor  + svalor;
		else if(filtroOperacao(op) == 2) resultado = pvalor - svalor;
		else if(filtroOperacao(op) == 3) resultado = pvalor * svalor;
		else if(filtroOperacao(op) == 4) resultado = pvalor / svalor;
		else System.out.println("Coloca a Poha de um valor Valido");
		
	}
	
	//metodo que vai detectar qual operacao o usuario deseja realizar
	public int filtroOperacao(String op){
		if(op.equals("somar")) return 1;
		else if(op.equals("subtrair")) return 2;
		else if(op.equals("multiplicar")) return 3;
		else if(op.equals("dividir")) return 4;
		else return 0;
	}
	
	//metodo que retorna o resultado da operacao para o servlet
	public double getResultado(){
		return resultado;
	}
}
