package com.Test2.Test2.Service;

import com.Test2.Test2.DTO.EmployeeDataDTO;
import com.Test2.Test2.DTO.EmployeeNameDTO;
import com.Test2.Test2.Model.Employee;
import com.Test2.Test2.Model.EmployeeName;
import com.Test2.Test2.Repository.EmployeeNameRepository;
import com.Test2.Test2.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.Test2.Test2.Util.SampleLogger.sampleLogger;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository ep;

    @Autowired
    EmployeeNameRepository enp;
    public Employee addEmployee(Employee employee){
        sampleLogger.info("Saving employee into job DB");
        ep.save(employee);
        return employee;
    }
    public EmployeeDataDTO getEmployeeByID(Integer id){
        Employee jobData =  ep.findById(id).orElse(null);
        EmployeeName personalData =  enp.findById(id).orElse(null);
        if(personalData == null)
            return new EmployeeDataDTO(jobData.getId(),null,null,null,null,jobData.getDeptNo(),jobData.getSalary());
        else return new EmployeeDataDTO(jobData.getId(),personalData.getPrefix(),personalData.getFirstName(),personalData.getMiddleName(),personalData.getLastName(),jobData.getDeptNo(),jobData.getSalary());
    }
    public void addEmployeeName(EmployeeNameDTO empNameDTO){
        EmployeeName employeeName = new EmployeeName(empNameDTO.getId(),empNameDTO.getPrefix(),empNameDTO.getFirstName(),empNameDTO.getMiddleName(),empNameDTO.getLastName());
//        employeeName.setId(empNameDTO.getId());
//        employeeName.setPrefix(empNameDTO.getPrefix());
//        employeeName.setFirstName(empNameDTO.getFirstName());
//        employeeName.setMiddleName(empNameDTO.getMiddleName());
//        employeeName.setLastName(empNameDTO.getLastName());
        sampleLogger.info("Saving employee into personal DB");
        enp.save(employeeName);
    }
}

