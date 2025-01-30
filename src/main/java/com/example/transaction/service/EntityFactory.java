package com.example.transaction.service;


import com.example.transaction.entity.Address;
import com.example.transaction.entity.Employee;
import com.example.transaction.repository.EntityFactoryInterface;
import org.springframework.stereotype.Component;

@Component
public class EntityFactory implements EntityFactoryInterface {

    @Override
    public Employee createEmployee(String name){
        Employee employee = new Employee();
        employee.setName(name);
        return employee;
    }

    @Override
    public Address createAddress(String address, Employee employee){
        Address addr = new Address();
        addr.setAddress(address);
        addr.setEmployee(employee);
        return addr;
    }
}
