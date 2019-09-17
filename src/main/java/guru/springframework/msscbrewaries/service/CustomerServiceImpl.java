package guru.springframework.msscbrewaries.service;


import java.util.UUID;

import org.springframework.stereotype.Service;

import guru.springframework.msscbrewaries.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by jt on 2019-04-21.
 */
@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
	
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Joe Buck")
                .build();
    }

    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        //todo impl
        log.debug("Updating....");
    }

    public void deleteById(UUID customerId) {
        log.debug("Deleting.... ");
    }
}
