package com.example.UnitTesting.Repository;

import com.example.UnitTesting.Models.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepo extends JpaRepository<Admin, Integer> {

    @Query("SELECT CASE WHEN COUNT(s) > 0 THEN TRUE ELSE FALSE END FROM Admin s WHERE s.adminId = ?1")
    Boolean isAdminExitsById(Integer id);
}
