package com.nayuko;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

import java.util.List;
import java.util.UUID;

@Path("/")
public class EmployeeResource {


    @Inject
    EmployeeService EmployeeService;

    @POST
    @Path("/{name}")
    public Employee addEmployee(@PathParam("name") String name) {
        return EmployeeService.createEmployee(name);
    }

    @GET
    @Path("/name/{name}")
    public Employee getEmployeeByName(@PathParam("name") String name) {
        return EmployeeService.getEmployeeByName(name).orElse(null);
    }

    @GET
    @Path("/id/{id}")
    public Employee getEmployeeById(@PathParam("id") UUID id) {
        return EmployeeService.getEmployeeById(id).orElse(null);
    }

    @GET
    @Path("/all")
    public List<Employee> getEmployeeById() {
        return EmployeeService.getAllEmployees();
    }
}
