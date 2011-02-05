package org.garbagecollected.www;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GarbageCollectedServlet implements Filter {
  public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

  }

  public void destroy() {

  }

  public void doFilter(ServletRequest req, ServletResponse resp, FilterChain arg2) throws IOException, ServletException {
    if (!(req instanceof HttpServletRequest)) {
      arg2.doFilter(req, resp);
      return;
    }
    HttpServletRequest request = (HttpServletRequest) req;
    if ("/".equals(request.getRequestURI()) || "/business_card_rt.jpg".equals(request.getRequestURI()) || request.getRequestURI().contains("voorwaarden.html")) {
      arg2.doFilter(req, resp);
      return;
    }
    resp.setContentType("text/plain");
    resp.getWriter().println("Nothing to see here yet.");
  }

  public void init(FilterConfig arg0) throws ServletException {

  }
}
