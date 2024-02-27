package com.Test2.Test2.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDataDTO {
    Integer EMPLID;
    String pfx,firstName,middleName,LastName,deptNo;
    Integer sal;
}
