package com.pedroalmir.peladona.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.*;

import com.google.gson.Gson;
import com.googlecode.objectify.Key;
import com.pedroalmir.peladona.model.Pelada;
import com.pedroalmir.peladona.repository.PeladaDAO;

@SuppressWarnings("serial")
public class AddPeladaServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String name = request.getParameter("date");
			String description = request.getParameter("description");
			
			String dataEHora = request.getParameter("date") + " " + request.getParameter("hour");
			
			Date data = new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(dataEHora);
			
			Double latitude = Double.valueOf(request.getParameter("latitude"));
			Double longitude = Double.valueOf(request.getParameter("longitude"));
			
			Integer min = Integer.valueOf(request.getParameter("min"));
			
			PeladaDAO dao = new PeladaDAO();
			Key<Pelada> key = dao.save(new Pelada(name, description, data, latitude, longitude, min));
			
			String json = new Gson().toJson(dao.findById(key.getId()));
			
			response.setContentType("text/plain");
			response.getWriter().println(json);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
}
