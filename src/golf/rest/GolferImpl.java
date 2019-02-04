package golf.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import golf.Golfer;
import golf.GolferHelper;

@Path("/golfer")
public class GolferImpl {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Object[] getGolfers() {
		GolferHelper golfer = new GolferHelper();
		Object[] golfers = golfer.getAllGolfers();
		return golfers;
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createGolfer(Golfer golfer) {
		golfer.insert();
		return Response.status(201).entity("Insert Saved").build();
  }
	
	 @PUT
   @Consumes(MediaType.APPLICATION_JSON)
	 public Response updateGolfer(Golfer golfer) {
	   golfer.update();
	   return Response.status(201).entity("Update Saved").build();
	 }
	 
	 @DELETE 
	 @Path("{id}")
	 @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
   public Response deleteGolfer(@PathParam("id") int id) {
     new Golfer().delete(id);
     return Response.status(201).entity("Record Deleted").build();
   }	 
	
}
