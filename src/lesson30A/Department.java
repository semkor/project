package lesson30A;

import lesson30A.ENUM.DepartmentType;
import java.util.*;

public class Department {
    private DepartmentType type;
    private Collection<Employee> employees;

    public Department(DepartmentType type, Collection<Employee> employees) {
        this.type = type;
        this.employees = employees;
    }

    public DepartmentType getType() {
        return type;
    }

    public Collection<Employee> getEmployees() {
        return employees;
    }

    @Override
    public String toString() {
        return "Department{" +
                "type=" + type +
                ", employees=" + employees +
                '}';
    }
}
