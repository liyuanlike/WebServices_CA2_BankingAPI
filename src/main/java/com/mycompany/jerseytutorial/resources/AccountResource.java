/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jerseytutorial.resources;
import com.mycompany.jerseytutorial.model.Customer;
import com.mycompany.jerseytutorial.model.Account;
import com.mycompany.jerseytutorial.model.Transaction;
import com.mycompany.jerseytutorial.services.AccountService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.QueryParam;
/**
 *
 * @author shane
 */

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class AccountResource{

    AccountService accountService = new AccountService();
    
       @GET
       @Path("/{customerId}")
       public List<Account> getAccounts(@PathParam("customerId") int cId) {
       System.out.print("22222222222");
       return accountService.getAllAccounts(cId);
   }
    
}
