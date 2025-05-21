//6c. Build a servlet program to check the given number is prime number or not using HTML with step by step procedure.
/*  PrimeServlet.java  */
package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PrimeServlet")
public class PrimeServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2)
            if (n % i == 0) return false;
        return true;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String numStr = req.getParameter("num");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        try {
            int n = Integer.parseInt(numStr);
            out.printf("<h2>%d is %s a prime number</h2>",
                       n, isPrime(n) ? "" : "NOT");
        } catch (NumberFormatException e) {
            out.print("<h3>Invalid input.</h3>");
        }
    }
}
