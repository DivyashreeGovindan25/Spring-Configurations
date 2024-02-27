package com.Test2.Test2.Repository;

import com.Test2.Test2.Model.EmployeeName;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeNameRepository extends MongoRepository<EmployeeName,Integer> {
}
