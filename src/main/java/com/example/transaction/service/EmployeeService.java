package com.example.transaction.service;


import com.example.transaction.entity.Address;
import com.example.transaction.entity.Employee;
import com.example.transaction.repository.EmployeeRepository;
import com.example.transaction.repository.EntityFactoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private AddressService addressService;

    @Autowired
    private EntityFactoryInterface entityFactory;

    @Transactional
    public Employee addEmployee(String name) throws Exception {
       Employee employee = entityFactory.createEmployee(name);
       Employee employeeSavedToDb = this.employeeRepository.save(employee);

       Address address = entityFactory.createAddress("delhi",employee);
       this.addressService.addAddress(address);
       return employeeSavedToDb;
    }
}
