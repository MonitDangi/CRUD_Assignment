package com.EmployeeService;

import com.EmployeeRepository.EmployeeRepo;
import com.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpService {
    @Autowired(required = true)
    EmployeeRepo repo;
    public Employee addEmployee(Employee employee){
        return repo.save(employee);
    }
    public Employee getEmployeeById(long id){
        Optional<Employee> optionalEmployee =  repo.findById(id);
        return optionalEmployee.get();
    }
    public Employee deleteEmployeeById(long id){
        return repo.deleteByEmpId(id);
    }
    public String updateEmployeeById(String post, Long id){
        repo.updateEmployeeById(post, id);
        return "Employee updated Successfully";
    }
    public List<Employee> listAllEmployee(){
        return repo.findAll();
    }
}
