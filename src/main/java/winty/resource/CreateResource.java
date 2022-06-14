package winty.resource;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.jboss.logging.Logger;

import winty.model.Request;
import winty.model.Response;
import winty.repository.Repository;


@Path("/create")
public class CreateResource {
    
    private static final Logger LOG = Logger.getLogger(CreateResource.class);
    
    @Inject Repository repository;
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create( Request request ) {
        LOG.info(request);
        
        repository.set(request.getId());
        
        return new Response();
    }
}
