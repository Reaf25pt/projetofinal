package service;

import jakarta.inject.Inject;
import jakarta.mail.MessagingException;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.text.ParseException;


@Path("/users")
public class UserService {


    //=============================================================  U1  EDITAR PERFIL (USER) TESTADO NO POSTAMN! ==================================================================================
    @GET
    @Path("/profile")
    @Produces(MediaType.APPLICATION_JSON)
    public Response editProfile() {

        Response response = Response.status(401).entity("Não tem permissão").build();

        return response;
    }
}














