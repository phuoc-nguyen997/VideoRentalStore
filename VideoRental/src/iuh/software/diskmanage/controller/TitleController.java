package iuh.software.diskmanage.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import iuh.software.diskmanage.dao.DVDTypesDAO;
import iuh.software.diskmanage.dao.TitleDAO;
import iuh.software.diskmanage.entities.DVDType;
import iuh.software.diskmanage.entities.Title;

/**
 * Servlet implementation class TitleController
 */
@WebServlet("/listTitle")
public class TitleController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TitleController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		DVDTypesDAO dvdTypesDAO = new DVDTypesDAO();
		TitleDAO titleDAO = new TitleDAO();
		
		
		List<DVDType> listType = dvdTypesDAO.getALLTypes();
		

		for (DVDType dvdType : listType) {
			List<Title> dsTitle = titleDAO.getTitleByIdType(dvdType.getIdType());
			dvdType.setDsTitle(dsTitle);
		}
		request.setAttribute("listType", listType);
		
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/ListTitleView.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
