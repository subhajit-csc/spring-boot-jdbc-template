package com.example.demo.dto;

import java.util.Objects;

public class Emp {


    private String empId;
    private String empName;
    private String job;
    private Integer salary;
    private Integer deptNo;

    public Emp(String empId, String empName, String job, Integer salary, Integer deptNo) {
        this.empId = empId;
        this.empName = empName;
        this.job = job;
        this.salary = salary;
        this.deptNo = deptNo;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(Integer deptNo) {
        this.deptNo = deptNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return Objects.equals(empId, emp.empId) && Objects.equals(empName, emp.empName) && Objects.equals(job, emp.job) && Objects.equals(salary, emp.salary) && Objects.equals(deptNo, emp.deptNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, empName, job, salary, deptNo);
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empId='" + empId + '\'' +
                ", empName='" + empName + '\'' +
                ", job='" + job + '\'' +
                ", salary=" + salary +
                ", deptNo=" + deptNo +
                '}';
    }
}
