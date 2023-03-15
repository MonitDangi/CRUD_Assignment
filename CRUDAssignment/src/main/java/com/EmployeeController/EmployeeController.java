package com.EmployeeController;

import com.EmployeeService.EmpService;
import com.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmpService service;

    @RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
    public Employee addEmployee(@RequestBody Employee employee){
        return service.addEmployee(employee);
    }
    @RequestMapping(value="/deleteEmployeeById/{id}", method = RequestMethod.DELETE)
    public Employee deleteEmployeeById(@PathVariable("id") long id){
        return service.deleteEmployeeById(id);
    }
    @RequestMapping(value = "/getEmployeeById/{id}", method = RequestMethod.GET)
    public Employee getEmployeeById(@PathVariable("id") long id){
        return service.getEmployeeById(id);
    }
    @RequestMapping(value = "/updateEmployeeById/{post}/{id}", method = RequestMethod.PUT)
    public String updateEmployeeById(@PathVariable("post") String post,@PathVariable("id") long id){
        return service.updateEmployeeById(post, id);
    }
    @RequestMapping(value = "/listAllEmployee", method = RequestMethod.GET)
    public List<Employee> listAllEmployee(){
        return service.listAllEmployee();
    }
}
