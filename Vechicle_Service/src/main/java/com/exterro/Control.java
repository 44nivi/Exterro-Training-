package com.exterro;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.hibernate.Session;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.exterro.model.LoginPage;

@Path("/go")
public class Control {
	// MySession my = new MySession();

	@Path("/register")
	@POST
	//@Produces(MediaType.APPLICATION_JSON)
	//@Consumes(MediaType.APPLICATION_JSON)
	 @Produces("text/html")

	public Response showdata(@FormParam("A") String data) {
		System.out.println("hi");
		JSONObject jobj = new JSONObject();
		String stat = null;
		try {
			System.out.println("in controller!!!");
			JSONParser js = new JSONParser();
			Object oo = js.parse(data);

			JSONArray ja = new JSONArray();
			ja.add(oo);

			for (int i = 0; i < ja.size(); i++) {

				JSONObject jo = (JSONObject) ja.get(i);
				String s1 = (String) jo.get("username");
				String s2 = (String) jo.get("password");

				/*
				 * if (username.equalsIgnoreCase("Nivi")) { return
				 * Response.status(200).entity("Welcome user" ).build(); } else { return
				 * Response.status(200).entity("Invalid User Name" ).build(); }
				 * 
				 */

				LoginPage ee = new LoginPage(s1, s2);
				Session session = (Session) MySession.getSessionFactory();
				session.beginTransaction();
				session.save(ee);
				session.getTransaction().commit();
				session.close();

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		stat = "success";
		jobj.put("status", "success");

		return Response.status(200).entity("user or password").build();

	}

	
}
