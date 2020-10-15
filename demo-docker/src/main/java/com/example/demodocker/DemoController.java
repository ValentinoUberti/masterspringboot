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


        // Simulating a 10Mib memory consumption and a cpu workload
        Vector v = new Vector();
        
        for (int i=0; i <= 1024*1024; i++ )
          {
              byte b[]= new byte[1];
              v.add(b);
          }


        return customerList;
    }
}