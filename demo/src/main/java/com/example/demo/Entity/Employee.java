package com.example.demo.Entity;
import java.util.Objects;

public class Employee {
  private  long empId;
  private String Name;
  private int age;
  private  float salary;

    public Employee() {
    }

    public Employee(long empId, String Name, int age, float salary) {
        this.empId = empId;
        this.Name = Name;
        this.age = age;
        this.salary = salary;
    }

    public long getEmpId() {
        return this.empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getSalary() {
        return this.salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public Employee empId(long empId) {
        setEmpId(empId);
        return this;
    }

    public Employee Name(String Name) {
        setName(Name);
        return this;
    }

    public Employee age(int age) {
        setAge(age);
        return this;
    }

    public Employee salary(float salary) {
        setSalary(salary);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Employee)) {
            return false;
        }
        Employee employee = (Employee) o;
        return empId == employee.empId && Objects.equals(Name, employee.Name) && age == employee.age && salary == employee.salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, Name, age, salary);
    }

    @Override
    public String toString() {
        return "{" +
            " empId='" + getEmpId() + "'" +
            ", Name='" + getName() + "'" +
            ", age='" + getAge() + "'" +
            ", salary='" + getSalary() + "'" +
            "}";
    }


  


}
