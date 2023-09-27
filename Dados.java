package aula2709;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Dados")
public class Dados extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		try {
			String num1 = request.getParameter("num1");
			String num2 = request.getParameter("num2");
			
			PrintWriter writer = response.getWriter();
			
			writer.append("<HTML><BODY>");
			
			int numero1 = Integer.parseInt(num1);
			int numero2 = Integer.parseInt(num2);
			
			writer.append("A soma dos numeros informados é: "+ (numero1+numero2)+"<br>");
			writer.append("A subtração dos numeros informados é: "+ (numero1-numero2)+"<br>");
			writer.append("A divisão dos numeros informados é: "+ (numero1/numero2)+"<br>");
			writer.append("O resto dos numeros informados é: "+ (numero1%numero2)+"<br>");
			writer.append( "</BODY>  </HTML>" );

			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
