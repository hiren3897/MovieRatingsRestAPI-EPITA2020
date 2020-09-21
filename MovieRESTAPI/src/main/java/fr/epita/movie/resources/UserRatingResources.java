package fr.epita.movie.resources;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.web.bind.annotation.RequestBody;

import fr.epita.movie.dataModel.userRatings;
import fr.epita.movie.dto.userRatingsDTO;
import fr.epita.movie.service.dao.userRatingsDAO;

@Path("/user")
public class UserRatingResources {
	

	
	@Inject
	userRatingsDAO userRatingsDAO;
	
	
	@POST
	@Path("/ratings")
	@Consumes(value = MediaType.APPLICATION_JSON)
	@Produces(value = MediaType.APPLICATION_JSON)
	public Response addUserRatings(@RequestBody userRatingsDTO userratingsdto) {
		
		userRatings user =  new userRatings();	
		user.setUserId(userratingsdto.getUserId());
		user.setCommentTitle(userratingsdto.getCommentTitle());;
		user.setCommentContent(userratingsdto.getCommentContent());;
		user.setRatings(userratingsdto.getRatings());
		
		userRatingsDAO.create(user);
		return Response.ok(user).build();
		
	}
	
	
	@GET
	@Path("/ratings/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public Response getRatingByID(@PathParam("id") long userId) {
		fr.epita.movie.dataModel.userRatings user = userRatingsDAO.getById(userId);
		
		return Response.ok(user).build();
	}
	
	
	

}
