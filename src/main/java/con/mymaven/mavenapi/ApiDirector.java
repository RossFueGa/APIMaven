package con.mymaven.mavenapi;

import con.maven.DAO.DaoDirectory;
import con.maven.mavenClass.Director;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

/**
 *
 * @author ross
 */
@Path("Director")
public class ApiDirector {
    @GET
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    public Response saludo(){
        return Response.accepted().entity(new Director("Rosario",700, "Fuentes")).build();
        
    }
    
    @POST
    @Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    public Response despedida(Director dir ){
        DaoDirectory dirDao = new DaoDirectory();
        dirDao.save(dir);
        return Response.accepted().entity(dir).build();
    
    }
    
    @PUT
    @Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    @Path("{id}")
    public Response put(@PathParam("id") int id,Director dir){
        return Response.accepted().entity(dir).build();
    }
    
    @DELETE
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    public Response delete(@QueryParam("id") int id){
        return Response.accepted().build();
    }
    
    
}
