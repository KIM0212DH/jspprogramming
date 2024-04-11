package org.example.jspprogramming;

import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "/HWorld", value = "/HWorld")
public class HelloServlet extends HttpServlet {
    public HelloServlet(){
        super();
    }
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    }

    public void destroy() {
    }
}