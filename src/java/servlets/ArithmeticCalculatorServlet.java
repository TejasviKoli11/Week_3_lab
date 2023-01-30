
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
        
        request.setAttribute("num_one", num1);
        request.setAttribute("num_two", num2);
        request.setAttribute("result", "--");
        
        String operation = request.getParameter("operation");
        
        if(num1 == null || num1.equals("")|| num2 == null || num2.equals("")){
            request.setAttribute("result", "Invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
        }
        else{
            
            int n1 = Integer.parseInt(num1);
            int n2 = Integer.parseInt(num2);
            
            switch (operation) {
                case "+":
                {
                    int answer = n1 + n2;
                    String ans = String.valueOf(answer);
                    request.setAttribute("result", ans);
                    getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
                    break;
                }
                case "-":
                {
                    int answer = n1 - n2;
                    String ans = String.valueOf(answer);
                    request.setAttribute("result", ans);
                    getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
                    break;
                }
                case "*":
                {
                    int answer = n1 * n2;
                    String ans = String.valueOf(answer);
                    request.setAttribute("result", ans);
                    getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
                    break;
                }
                case "/":
                {
                    int answer = n1 / n2;
                    String ans = String.valueOf(answer);
                    request.setAttribute("result", ans);
                    getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
                    break;
                }
                default:
            }
        }
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
       
    }
}

