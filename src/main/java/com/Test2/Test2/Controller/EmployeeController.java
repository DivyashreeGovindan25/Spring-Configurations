package com.Test2.Test2.Controller;

import com.Test2.Test2.DTO.EmployeeDataDTO;
import com.Test2.Test2.DTO.EmployeeNameDTO;
import com.Test2.Test2.Model.Employee;
import com.Test2.Test2.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.Test2.Test2.Util.SampleLogger.sampleLogger;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {
    @Autowired
    EmployeeService es;
    @PostMapping("/addEmployee")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
        sampleLogger.info("Adding employee to database");
        return new ResponseEntity<>(es.addEmployee(employee), HttpStatus.OK);
    }
    @GetMapping("/getEmployeeByID")
    public ResponseEntity<EmployeeDataDTO> getEmployeeByID(@RequestParam Integer id){
        sampleLogger.info("Getting employee details " + id);
        return new ResponseEntity<>(es.getEmployeeByID(id), HttpStatus.FOUND);
    }
    @PostMapping("/addEmployeeName")
    public ResponseEntity<String> addEmployeeName(@RequestBody EmployeeNameDTO empNameDTO){
        if(empNameDTO.getId() == null) {
            sampleLogger.info("Employee id is mandatory");
            return new ResponseEntity<>("Employee id is mandatory", HttpStatus.NOT_ACCEPTABLE);
        }
        else if(es.getEmployeeByID(empNameDTO.getId()) == null){
            sampleLogger.info("Employee id is not found");
            return new ResponseEntity<>("Employee id is not found", HttpStatus.NOT_FOUND);
        }
        else {
            sampleLogger.info("Employee name updated");
            es.addEmployeeName(empNameDTO);
            return new ResponseEntity<>("Employee name updated", HttpStatus.OK);
        }
    }
}
