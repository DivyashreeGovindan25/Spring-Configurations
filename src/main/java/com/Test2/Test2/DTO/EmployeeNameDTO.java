package com.Test2.Test2.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeNameDTO {
    Integer id;
    String prefix;
    String firstName;
    String middleName;
    String lastName;
}
