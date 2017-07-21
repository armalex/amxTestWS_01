package soa.jaxrslabs.helloensmarestwebserviceexercice1;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import com.fasterxml.jackson.core.JsonProcessingException;
//import com.google.gson.Gson;
import com.fasterxml.jackson.databind.ObjectMapper;

/*
 * http://localhost:9991/rest/helloensma
 */
@Path("helloensma")
public class HelloENSMA {
    public HelloENSMA() { }
    
    @GET
    @Produces("application/xml")
    public String getXml() {
    	System.out.println("helloensma");
        return "<bonjour>Bonjour ENSMA</bonjour>";
    }
    
//    @GET
//    @Path("{recherche}")
//    @Produces("application/xml")
//    public Response getXmlWithParams(
//            @PathParam("recherche") String id,
//            @DefaultValue("all") @HeaderParam("name") String name) {
//        
//    	
//    	System.out.println(id);
//      System.out.println(name);
//        
////        Response response = Response.ok("<bonjour>Bonjour ENSMA de la part de " + name + "</bonjour>")
////                .status(Status.OK).build();
//        
//        return Response
//        	      .status(Status.OK)
//        	      .entity("<bonjour>Bonjour ENSMA de la part de " + name + "</bonjour>")
//        	      .build();
//    }
    
    
    
    /*
     * http://localhost:9991/rest/helloensma/mois?name=janvier&indice=1
     */
    @GET
    @Path("{mois}")
    @Produces("application/json")
    public Response getXmlWithOtherParams(
            @PathParam("mois") String id,
            @DefaultValue("all") @HeaderParam("name") String name,  @HeaderParam("indice") int indice,
            @Context UriInfo info) throws JsonProcessingException {
        
    	String theName = info.getQueryParameters().getFirst("indice");
    	System.out.println("mois "+theName);
    	
    	Annee moisCourant = new Annee(); 
    	//Mois mois = moisCourant.getMoisCourant(Integer.parseInt(theName));
    	
    	String listeJour[] = moisCourant.getListeJour(Integer.parseInt(theName));
    	
    	
    	ObjectMapper jsonMapper = new ObjectMapper();
     	
    	 return Response.ok().entity(jsonMapper.writeValueAsString(listeJour))
        		.header("Access-Control-Allow-Origin", "*")
        		.build();
    }
    
    /*
     * http://localhost:9991/rest/helloensma/annee?name=janvier&indice=1
     */
  
    @POST
    @Path("{annee}")
    @Produces("application/json")
    public Response getXmlWithYearParams(
            @PathParam("annee") String id,
            @DefaultValue("all") @HeaderParam("annee") String annee,
            @Context UriInfo info) throws JsonProcessingException {
        
    	String theName = info.getQueryParameters().getFirst("indice");
    	System.out.println("..."+theName);
    	
    	Annee moisCourant = new Annee(); 
    	
		ObjectMapper jsonMapper = new ObjectMapper();

     	
        return Response.ok().entity(jsonMapper.writeValueAsString(moisCourant))
        		.header("Access-Control-Allow-Origin", "*")
        		.build();

    }

}

