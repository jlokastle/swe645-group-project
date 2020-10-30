package swe645;

import javax.ws.rs.*;

@Path("survey")
public class StudentSurvey {

	@GET
	public String get() {
		return "Hello World";
	}
}
