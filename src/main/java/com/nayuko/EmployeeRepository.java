package com.nayuko;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;


import java.util.UUID;

@ApplicationScoped
public class EmployeeRepository implements PanacheRepositoryBase<Employee, UUID> {
        //Empty on purpose, domain specific methods to be added here


}
