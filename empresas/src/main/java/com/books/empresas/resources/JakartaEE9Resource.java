package com.books.empresas.resources;

import com.books.control.ControlEmpresas;
import com.books.model.ModelEmpresa;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import java.util.List;

/**
 *
 * @author 
 */
@Path("jakartaee9")
public class JakartaEE9Resource {
    
    @GET
    public Response ping(){
        return Response
                .ok("ping Jakarta EE")
                .build();
    }
    
  
}


