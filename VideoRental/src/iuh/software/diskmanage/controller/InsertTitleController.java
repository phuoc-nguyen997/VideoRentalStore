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
 * Servlet implementation class InsertTitleController
 */
@WebServlet("/insertTitle")
public class InsertTitleController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertTitleController() {
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
		
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/AddTitleForm.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nameTitle = request.getParameter("titleName");
		String imageURL = request.getParameter("imgUrl");
		String description = request.getParameter("description");
		
		int idType = Integer.parseInt(request.getParameter("DVDType"));
		
		
		
		DVDTypesDAO dvdTypesDAO = new DVDTypesDAO();
		
		DVDType dvdType = dvdTypesDAO.findByIdType(idType);
		
		
		TitleDAO titleDAO = new TitleDAO();

		Title title = new Title(nameTitle, imageURL, description);
		title.setType(dvdType);
		
		titleDAO.save(title);
		
		request.setAttribute("title", title);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/listTitle");
		dispatcher.forward(request, response);
		try {
			request.getRequestDispatcher("/WEB-INF/views/ListTitleView.jsp").forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	}

