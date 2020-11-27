package iuh.software.diskmanage.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import iuh.software.diskmanage.dao.CustomerDAO;
import iuh.software.diskmanage.entities.Customer;

/**
 * Servlet implementation class InsertCustomerController
 */
@WebServlet("/insertCustomer")
public class InsertCustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertCustomerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	CustomerDAO csDAO = new CustomerDAO();
		
		List<Customer> listCustomer = csDAO.getALLCustomer();
		
		request.setAttribute("listCustomer", listCustomer);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/AddCustomerForm.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nameCustomer = request.getParameter("customerName");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String address = request.getParameter("cusName");
		
		
		CustomerDAO customerDAO = new CustomerDAO();

		Customer customer = new Customer(nameCustomer, phone, email, address);
		customerDAO.save(customer);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/listCustomer");
		dispatcher.forward(request, response);
		try {
			request.getRequestDispatcher("/WEB-INF/views/ListCustomerView.jsp").forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}

}
