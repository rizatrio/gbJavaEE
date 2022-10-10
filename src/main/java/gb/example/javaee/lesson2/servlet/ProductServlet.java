package gb.example.javaee.lesson2.servlet;


import gb.example.javaee.lesson2.model.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet(name = "ProductServlet", urlPatterns = "/product_servlet")

public class ProductServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("products",createProducts());
        getServletContext().getRequestDispatcher("/products.jsp")
                .forward(req,resp);
    }

    private Product createProducts() {
        List<Product> products = List.of(
                new Product(1,"milk",70),
                new Product(2,"meat",50),
                new Product(3,"eggs",80),
                new Product(4,"cheese",150),
                new Product(5,"sugar",250),
                new Product(6,"oranges",150),
                new Product(7,"water",50),
                new Product(8,"bread",100),
                new Product(9,"chicken",300),
                new Product(10,"potatoes",200)
        );
        return Product.builder()
                .products(products)
                .build();
    }
}
