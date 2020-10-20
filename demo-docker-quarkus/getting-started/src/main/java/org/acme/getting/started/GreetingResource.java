package org.acme.getting.started;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Vector;
import java.util.List;
import java.util.ArrayList;


@Path("/demo")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public List<Customer> findAll()
    {
        List<Customer> customerList = new ArrayList<Customer>();
        customerList.add(new Customer(1, "Demo"));
        customerList.add(new Customer(2, "Test"));


        // Simulating a 1Mib memory consumption and a cpu workload
        Vector v = new Vector();
        
        for (int i=0; i <= 1024*5; i++ )
        {
            byte b[]= new byte[1024];
            v.add(b);
        }
    
      for (int i=0; i <= 10000; i++ )
        {
                  Math.sqrt(Math.pow(i,2));
        }
      
        return customerList;
    }
}