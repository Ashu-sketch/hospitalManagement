package com.hospitalManagement.hospitalManagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospitalManagement.hospitalManagement.model.Bill;

@Repository
public interface BillRepo extends JpaRepository<Bill, Long>{

}
