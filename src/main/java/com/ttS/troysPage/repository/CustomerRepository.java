package com.ttS.troysPage.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.ttS.troysPage.domain.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long>{

    List<Customer> findByLastName(String lastName);
}
