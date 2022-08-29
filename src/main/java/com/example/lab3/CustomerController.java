package com.example.lab3;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@RestController
public class CustomerController {
    private List<Customer> customer = new ArrayList<>();
//    private List<Customer> customer = new ArrayList<Customer>
//            (Arrays.asList( new Customer("1010", "John", "Male", 25),
//            new Customer("1018", "Peter", "Male", 24),
//            new Customer("1019", "Sara", "Female", 23),
//            new Customer("1110", "Rose", "Female", 23),
//            new Customer("1001", "Emma", "Female", 30)));
    public CustomerController() {
        customer.add(new Customer("1010", "John", "Male", 25));
        customer.add(new Customer("1018", "Peter", "Male", 24));
        customer.add(new Customer("1019", "Sara", "Female", 23));
        customer.add(new Customer("1110", "Rose", "Female", 23));
        customer.add(new Customer("1001", "Emma", "Female", 30));
    }
    @RequestMapping(value = "/customers", method = RequestMethod.GET)
    public List<Customer> getCustomer(){
        return customer;
    };
    @RequestMapping(value = "/customerbyid/{id}", method = RequestMethod.GET)
    public Customer getCustomerByID(@PathVariable("id") String ID){
        Customer foundCustomer = null;
        for(int i = 0; i < customer.size(); i++) {
            if(customer.get(i).getID().equals(ID)){
                foundCustomer = customer.get(i);
                break;
            }
        }
        return foundCustomer;
    }
    @RequestMapping(value = "/customerbyname/{n}", method = RequestMethod.GET)
    public Customer getCusomterByName(@PathVariable("n") String n){
        Customer foundCustomer = null;
        for(int i = 0; i < customer.size(); i++) {
            if(customer.get(i).getName().equals(n)){
                foundCustomer = customer.get(i);
                break;
            }
        }
        return foundCustomer;
    }
    @RequestMapping(value = "/customerDelByid/{id}", method = RequestMethod.GET)
    public boolean delCustomerByID(@PathVariable("id") String ID){
        boolean check = false;
        for(int i = 0; i < customer.size(); i++) {
            if(customer.get(i).getID().equals(ID)){
                customer.remove(i);
                check = true;
                break;
            }
        }
        return check;
    }
    @RequestMapping(value = "/customerDelByname/{n}", method = RequestMethod.GET)
    public boolean delCustomerByName(@PathVariable("n") String n){
        boolean check = false;
        for(int i = 0; i < customer.size(); i++) {
            if(customer.get(i).getName().equals(n)){
                customer.remove(i);
                check = true;
                break;
            }
        }
        return check;
    }
    @RequestMapping(value="/addCustomer", method = RequestMethod.GET)
    public boolean addCustomer(@RequestParam("id") String ID,@RequestParam("name") String n
            ,@RequestParam("sex") String s,@RequestParam("age") int a){
        customer.add(new Customer(ID, n, s, a));
        return true;
    }
    @RequestMapping(value="/addCustomer2", method = RequestMethod.POST)
    public boolean addCustomer2(@RequestParam("id") String ID,@RequestParam("name") String n
            ,@RequestParam("sex") String s,@RequestParam("age") int a){
        customer.add(new Customer(ID, n, s, a));
        return true;
    }
}
