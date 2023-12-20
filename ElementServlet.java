
package Perform;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ElementServlet")
public class ElementServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve data from the form
        String element1 = request.getParameter("element1");
        String element2 = request.getParameter("element2");

        // Process the data (You can perform any logic here)
        String result = "Element 1: " + element1 + "<br>Element 2: " + element2;

        // Set the response content type
        response.setContentType("text/html");

        // Send the response back to the client
        response.getWriter().println("<html><body><h2>Result</h2>" + result + "</body></html>");
    }
}
