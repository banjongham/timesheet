package com.example.timesheet.repository;

import com.example.timesheet.entity.PmoMasterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PmoMasterRepository extends JpaRepository<PmoMasterEntity ,Long> {


    @Query(value = "SELECT * FROM PMO_API_MASTER" , nativeQuery = true)
    List<Object[]> getapplicationCode();

    List<PmoMasterEntity> findAll();

}
