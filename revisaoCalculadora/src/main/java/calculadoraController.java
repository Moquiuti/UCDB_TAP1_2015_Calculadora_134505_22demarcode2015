

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet({ "/calculadoraController", "/calculadoraServlet", "/calculadoraServler.do" })
public class calculadoraController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Operacao operacao = new Operacao();
		double resultado = operacao.getResultado();
		req.setAttribute("resultado", resultado);
		RequestDispatcher view = req.getRequestDispatcher("Calculadora.jsp");
		view.forward(req, resp);
	
	}
	

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//Criando os Objetos
		Calculadora calculadora = new Calculadora();
		Operacao operacao = new Operacao();
		//System.out.println(req.getAttribute("pvalor"));
		//Atribuindo o Valor Digitado pelo usuário na tela html ao Objeto
		calculadora.setPvalor(req.getParameter("pvalor"));
		calculadora.setSvalor(req.getParameter("svalor"));
		String op = req.getParameter("calcular");
		
		//Chamando o metodo que realizará a operação passando os valores e qual operação realizar
		operacao.realizarOperacao(calculadora,op);
	}

}
