package com.sBootApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;
import com.sBootApp.UserRegistration;
//import org.springframework.data.repository.CrudRepository;

/*	public interface UserRepo extends CrudRepository<UserRegistration, Long>{
		List<UserRegistration> findByUName(String uName);
	}	*/
public interface UserRepo extends JpaRepository<UserRegistration, Long>{	
	@Query("from UserRegistration where lower(UName)=lower(:userName) order by uid desc")
	List<UserRegistration> selectRecordByUName(@Param("userName") String name);
}
