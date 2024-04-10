package com.nayuko;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@ApplicationScoped
@Transactional
public class EmployeeService {

    @Inject
    EmployeeRepository EmployeeRepository;

    public List<Employee> getAllEmployees(){
        return EmployeeRepository.listAll();
    }

    public Optional<Employee> getEmployeeByName(String name) {
        return EmployeeRepository.find("name",name)
                .firstResultOptional();
    }

    public Optional<Employee> getEmployeeById(UUID id) {
        return Optional.ofNullable(EmployeeRepository.findById(id));
    }

    public Employee createEmployee(String name){
        Employee employee = new Employee(name);
        EmployeeRepository.persist(employee);
        return employee;
    }
}
