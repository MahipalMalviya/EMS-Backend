package com.emsbackend.mapper;

import com.emsbackend.dto.EmployeeDto;
import com.emsbackend.entity.Employee;
import org.springframework.boot.logging.LogLevel;

import java.util.logging.Level;
import java.util.logging.Logger;

public class EmployeeMapper {

    public static Employee mapToEmployee(EmployeeDto dto) {
        Employee employee = new Employee(
                dto.getId(),
                dto.getFirstName(),
                dto.getLastName(),
                dto.getEmail()
        );

        Logger.getLogger("EmployeeMapper").log(Level.INFO,employee.getFName() + " <=> " + employee.getLName());
        return employee;
    }

    public static EmployeeDto mapToEmployeeDto(Employee employee) {
        return new EmployeeDto(
                employee.getId(),
                employee.getFName(),
                employee.getLName(),
                employee.getEmail()
        );
    }
}
