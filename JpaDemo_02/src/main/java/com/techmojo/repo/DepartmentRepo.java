package com.techmojo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techmojo.entity.Department;
@Repository
public interface DepartmentRepo extends JpaRepository<Department, Integer> {

}
