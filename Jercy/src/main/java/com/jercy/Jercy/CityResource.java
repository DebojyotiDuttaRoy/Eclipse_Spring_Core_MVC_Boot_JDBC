package com.jercy.Jercy;

//import java.util.Arrays;
import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("cities")
public class CityResource {
/*	@GET
  	@Produces(MediaType.APPLICATION_JSON)
	public City getCity() {
		City city = new City(101,"Bangalore");
				return city;
	}
	public List<City> getCity() {
	City city1 = new City(101,"Bangalore");
	City city2 = new City(102,"Noida");
			return Arrays.asList(city1,city2);
	}	*/
   CityDao dao=new CityDao();
	@GET
	@Path("getCities")
	@Produces(MediaType.APPLICATION_XML)
	public List<City> getCity() {
		return dao.getAllCity();
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<City> getCities() {
		return dao.getAllCity();
	}
	@GET
	@Path("/{id}")
	//@Path("getCities/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public City cityById(@PathParam("id") int id) {
		return dao.getCityById(id);
	}
	@DELETE
	@Path("/{id}")
/*	@Path("getCities/{id}")
	@Path("removeCity/{id}")	*/
	@Produces(MediaType.APPLICATION_JSON)
	public List<City> removeCity(@PathParam("id") int id) {
		return dao.removeCity(id);
	}
	@POST
	@Path("addCities")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<City> addCity(City city) {
	/*	dao.createCity(city);
		return dao.getAllCity();	*/
		return dao.createCity(city);
	}	
	@PUT
	@Path("updateCity/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<City> updateCity(@PathParam("id") int id, City city) {
		return dao.updateCity(id, city.getCityName());
	}
}

