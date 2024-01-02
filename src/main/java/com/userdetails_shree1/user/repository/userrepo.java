package com.userdetails_shree1.user.repository;

import com.userdetails_shree1.user.Entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface userrepo extends JpaRepository<userentity,Integer>{
	

}

