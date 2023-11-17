package com.ebazaar.eBazaarApp.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebazaar.eBazaarApp.entity.CustomerEntity;
import com.ebazaar.eBazaarApp.repo.CustomerRepo;


@Service
public class CustomerServices {
    
    @Autowired
    private CustomerRepo customerRepo;

    public CustomerEntity postCustomer(CustomerEntity customer){
        return customerRepo.save(customer);
    }

    public CustomerEntity getCustomerByID(int customer_id){
        return customerRepo.findById(customer_id).orElse(null);
    }

    public List<CustomerEntity> getCustomer(){
        return customerRepo.findAll();
    }
}
