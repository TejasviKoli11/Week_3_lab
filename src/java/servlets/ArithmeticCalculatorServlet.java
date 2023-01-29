
package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Tejasvi
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String num1 = request.getParameter("num_one");
        String num2 = request.getParameter("num_two");
        
        double n1 = Double.parseDouble(num1);
        double n2 = Double.parseDouble(num2);
        
        
        String op = request.getParameter("operation");
        
        if(op.equals("+")){
          double result = n1+n2;
          
          String answer = String.valueOf("result");
          
          request.setAttribute("op", answer);
          
          getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
          
        }
      
            
    
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
    }

}
