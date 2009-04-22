package org.garbagecollected.www;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class GarbageCollectedServlet extends HttpServlet {
  public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    resp.setContentType("text/plain");
    resp.getWriter().println("Nothing to see here yet.");
  }
}
