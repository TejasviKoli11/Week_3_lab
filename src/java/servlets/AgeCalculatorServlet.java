
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
public class AgeCalculatorServlet extends HttpServlet {

    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request,response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String n_age = request.getParameter("age");
        
        if(n_age.equals("")){
           request.setAttribute("message", "You must give your current age"); 
           getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request,response);
            
        }
        else{
        int a = Integer.parseInt(n_age);
        int aggee = a + 1;
        n_age = String.valueOf(aggee);
        String msg = "Your age next birthdy will be ";
        String age_msg = msg + n_age;
        request.setAttribute("age", age_msg);
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request,response);
        }
    }

}
