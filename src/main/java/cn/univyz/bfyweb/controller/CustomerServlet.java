package cn.univyz.bfyweb.controller;

import cn.univyz.bfyweb.model.Customer;
import cn.univyz.bfyweb.service.CustomerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 进人客户列表界面
 */
@WebServlet("/Customer")
public class CustomerServlet extends HttpServlet{

    private CustomerService customerService;

    @Override
    public void init() throws ServletException{
        customerService=new CustomerService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Customer> customersList = customerService.getCustomerList();
        req.setAttribute("customerList",customersList);
        req.getRequestDispatcher("/WEB-INF/view/Customer.jsp").forward(req,resp);

    }


}
