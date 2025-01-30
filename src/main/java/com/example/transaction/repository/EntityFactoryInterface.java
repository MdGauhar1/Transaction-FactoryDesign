package com.example.transaction.repository;

import com.example.transaction.entity.Address;
import com.example.transaction.entity.Employee;

public interface EntityFactoryInterface {

    Employee createEmployee(String name);

    Address createAddress(String address, Employee employee);
}
