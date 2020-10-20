package com.example.demodocker;
import java.util.Vector;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController
{
    @RequestMapping("/")
    public List<Customer> findAll()
    {
        List<Customer> customerList = new ArrayList<Customer>();
        customerList.add(new Customer(1, "Demo"));
        customerList.add(new Customer(2, "Test"));

        // Simulate a Cpu workload and 5Mib memory consumption per HTTP request 
        Vector v = new Vector();
        
        for (int i=0; i <= 1024; i++ )
          {
              byte b[]= new byte[1024];
              v.add(b);
          }
        
        /*for (int i=0; i <= 10000; i++ )
          {
              
          }
        */

        return customerList;
    }
}