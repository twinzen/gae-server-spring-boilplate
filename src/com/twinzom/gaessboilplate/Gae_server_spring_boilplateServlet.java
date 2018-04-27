package com.twinzom.gaessboilplate;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Gae_server_spring_boilplateServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
	}
}
