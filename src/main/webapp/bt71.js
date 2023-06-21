import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormProcessing extends HttpServlet {
  private static final long serialVersionUID = 1L;

  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    // Lấy giá trị từ các thành phần của form
    String textFieldValue = request.getParameter("text-field");
    String hiddenFieldValue = request.getParameter("hidden-field");
    String checkBoxValue = request.getParameter("check-box");
    String listBoxValue = request.getParameter("list-box");
    String radioButtonValue = request.getParameter("radio-button");

    // Hiển thị giá trị trên màn hình
    response.setContentType("text/html");
    response.getWriter().println("<html><body>");
    response.getWriter().println("<h1>Form Values</h1>");
    response.getWriter().println("<p>Text Field: " + textFieldValue + "</p>");
    response.getWriter().println("<p>Hidden Field: " + hiddenFieldValue + "</p>");
    response.getWriter().println("<p>Check Box: " + checkBoxValue + "</p>");
    response.getWriter().println("<p>List Box: " + listBoxValue + "</p>");
    response.getWriter().println("<p>Radio Button: " + radioButtonValue + "</p>");
    response.getWriter().println("</body></html>");
  }
}