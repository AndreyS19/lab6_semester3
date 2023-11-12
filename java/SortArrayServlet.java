import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class SortArrayServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String input = request.getParameter("numbers");
        String[] numbers = input.split(",");
        int[] array = new int[numbers.length];
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();

            for (int i = 0; i < numbers.length; i++) {
                array[i] = Integer.parseInt(numbers[i]);
            }
            Arrays.sort(array);
            out.println("<!DOCTYPE html><html><head><meta charset=UTF-8><title>Sort Array App</title></head>");
            out.println("<BODY>");
            out.print("Сортированный массив: ");
            for (int num : array) {
                out.print(num + " ");
            }
            out.println("<br /><a href=http://localhost:8080/lab6_war_exploded/>Вернуться обратно</BODY>");
            out.flush();
            out.close();

    }
}
