package fr.vaelia.resources;

import javax.transaction.Transactional;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import fr.vaelia.model.AnswerMCQ;
import fr.vaelia.model.PropositionMCQ;


@Path("/answerMCQ")
public class AnswerMCQResources {
	
		@POST
		@Transactional
		@Produces(MediaType.APPLICATION_JSON)
		@Path("/{id}")
		public Response createAnswerMCQ(@PathParam("id") Long id,AnswerMCQ answerMCQ) {
			if (PropositionMCQ.findById(id) != null) {
				answerMCQ=new AnswerMCQ(PropositionMCQ.findById(id));
				answerMCQ.persist();
				return Response.ok(answerMCQ).status(200).build();
			}
			return Response.notModified("AnswerOpen not created").status(404).build();
			
		}
		
}
