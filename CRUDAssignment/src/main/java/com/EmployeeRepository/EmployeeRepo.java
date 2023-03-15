package com.EmployeeRepository;

import com.Model.Employee;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    @Modifying(clearAutomatically = true)
    @Transactional
    @Query(value = "update Employee e set e.post = ?1 where e.empId = ?2")
    public void updateEmployeeById(String post, long id);
    public Employee deleteByEmpId(long id);
}
