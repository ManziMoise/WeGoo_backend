package com.example.WeGoo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.WeGoo.Domain.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer>{

}
