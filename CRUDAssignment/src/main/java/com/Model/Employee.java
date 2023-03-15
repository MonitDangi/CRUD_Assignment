package com.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "EmployeeTable")
public class Employee {
    @Id
    @Column(name ="EmployeeId")
    private Integer empId;
    @Column(name ="EmployeeName")
    private String name;
    @Column(name ="EmployeePost")
    private String post;
    @Column(name ="EmployeeSalary")
    private Long salary;
    public Employee(){}

    public Employee(int empId, String name, String post, long salary) {
        this.empId = empId;
        this.name = name;
        this.post = post;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", post='" + post + '\'' +
                ", salary=" + salary +
                '}';
    }
}
