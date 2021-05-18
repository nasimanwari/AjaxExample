package showcities;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class ShowCities
 */
@WebServlet("/showCities")
public class ShowCities extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowCities() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    private List<City> findCities(String cityType) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setHeader("Cache-Control",  "no-cache");
		String cityType = request.getParameter("cityType");
		List<City> cities = findCities(cityType);
		request.setAttribute("cities", cities);
		String format = request.getParameter("format");
		String outputPage;
		if("xml".equals(format)) {
			response.setContentType("text/xml");
			outputPage = "/WEB-INF/results/cities-xml.jsp";
		}else if ("json".equals(format)) {
		      response.setContentType("application/json");
		      outputPage = "/WEB-INF/results/cities-json.jsp";
		}else{
		      response.setContentType("text/plain");
		      outputPage = "/WEB-INF/results/cities-string.jsp";
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(outputPage);
		dispatcher.include(request, response);
	}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
