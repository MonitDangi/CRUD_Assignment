package com.EmployeeService;

import com.EmployeeRepository.EmployeeRepo;
import com.Model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpService {

   private final EmployeeRepo repo;

   EmpService(EmployeeRepo repo) {
       this.repo = repo;
   }
    public Employee addEmployee(Employee employee){
        return repo.save(employee);
    }
    public Employee getEmployeeById(long id){

        Optional<Employee> optionalEmployee =  repo.findById(id);
        return optionalEmployee.orElse(null);
    }
    public void deleteEmployeeById(long id){
        repo.deleteById(id);
    }
    public String updateEmployeeById(String post, Long id){
        repo.updateEmployeeById(post, id);
        return "Employee updated Successfully";
    }
    public List<Employee> listAllEmployee(){
        return repo.findAll();
    }
}
