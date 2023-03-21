package com.EmployeeController;

import com.EmployeeService.EmpService;
import com.Model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    EmpService service;
    public EmployeeController(EmpService service){
        this.service =  service;
    }

    @PostMapping(value = "/addEmployee")
    public Employee addEmployee(@RequestBody Employee employee){
        return service.addEmployee(employee);
    }
    @RequestMapping(value="/deleteEmployeeById/{id}", method = RequestMethod.DELETE)
    public String deleteEmployeeById(@PathVariable("id") long id){
        service.deleteEmployeeById(id);
        return "Employee Deleted Successfully";
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
