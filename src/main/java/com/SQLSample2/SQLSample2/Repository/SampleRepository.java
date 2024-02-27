package com.SQLSample2.SQLSample2.Repository;

import com.SQLSample2.SQLSample2.Models.Samples;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SampleRepository extends JpaRepository<Samples,Integer> {
}
