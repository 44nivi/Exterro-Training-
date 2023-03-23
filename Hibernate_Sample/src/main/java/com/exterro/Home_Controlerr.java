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

@Path("/reg")

public class Home_Controlerr {
	
	@POST
	@Path("/hit")
	
	public Response sign(@FormParam("B")String val2) {
		System.out.println("Controller!!!");
		System.out.println("hey");
		JSONParser jparse = new JSONParser();
		JSONObject jobjects = new JSONObject();
		try {
			Object ob=jparse.parse(val2);
			JSONArray array = new JSONArray();
			array.add(ob);
			for (Object elements : array) {

				JSONObject obj2 = (JSONObject) elements;

				System.out.println("name from obj2" + obj2.get("Lname"));
				String name = (String) obj2.get("name");
				String age = (String) obj2.get("age");
				String email = (String) obj2.get("email");
				String phone = (String) obj2.get("phone");
				String date = (String) obj2.get("date");
				String pass = (String) obj2.get("password");
				String cpass = (String) obj2.get("confirmpassword");
			
				System.out.println(name);
				Session session = Session_Factory.getSessionFactory().openSession();

				Reg_Employee2 emp1 = new Reg_Employee2(name, age, email, phone, date, pass, cpass);

				//emp = (Reg_Employee) session2.get(Reg_Employee.class, 1);
				// System.out.println(session2.createSQLQuery("SELECT name,pass FROM
				// Reg_Employee WHERE name=raj"));
				
				String dbname = emp1.getName();
				String dbage = emp1.getAge();
				String dbemail = emp1.getEmail();
				String dbphone = emp1.getPhone();
				String dbdate = emp1.getDate();
				String dbpass = emp1.getPass();
				String dbcpass = emp1.getCpass();
				System.out.println(emp1.name);
				
				session.beginTransaction();
				session.save(emp1);
				session.getTransaction().commit();
				session.close();
				
			}
			
		}
		catch(Exception e) {
			
		}
		return Response.ok().entity(jobjects.toJSONString()).build();

		
		
	}


	/*
	 * @Produces(MediaType.APPLICATION_JSON)
	 * @Consumes(MediaType.APPLICATION_JSON)
	 */
	@POST
	@Path("/signup")
	public Response signnUp(@FormParam("val1") String val1) {
		System.out.println("hiiiiiiiiiii");
		JSONParser jparse = new JSONParser();
		JSONObject jobject = new JSONObject();

		try {

			Object obj = jparse.parse(val1);
			JSONArray array = new JSONArray();
			array.add(obj);

			for (Object element : array) {

				JSONObject obj2 = (JSONObject) element;

				System.out.println("name from obj2" + obj2.get("Lname"));
				String logname = (String) obj2.get("Lname");
				String Logpass = (String) obj2.get("Lpass");

				Session session2 = Session_Factory.getSessionFactory().openSession();

				Reg_Employee emp = new Reg_Employee(logname, Logpass);

				//emp = (Reg_Employee) session2.get(Reg_Employee.class, 1);
				// System.out.println(session2.createSQLQuery("SELECT name,pass FROM
				// Reg_Employee WHERE name=raj"));
				
				String dbname = emp.getName();
				String dbpass = emp.getPass();
				System.out.println(emp.getName());
				System.out.println(emp.getPass());
				
				if (logname.equals(dbname) && Logpass.equals(dbpass)) {
					System.out.println("valid user same as db");
					
				}
				session2.beginTransaction();
				session2.save(emp);
				session2.getTransaction().commit();
				session2.close();
				//if (logname.equals(dbname) && Logpass.equals(dbpass)) {
					System.out.println("valid user same as db");
					
				

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		return Response.status(200).entity("done").build();

	}
}
