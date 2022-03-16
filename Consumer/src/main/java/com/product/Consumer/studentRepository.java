package com.product.Consumer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository
public interface studentRepository extends JpaRepository<Student, Long> {
	
	  @Modifying
	  
	  @Transactional
	  
	  @Query( value="update students set average=?1 where roll_no=?2   ", nativeQuery
	  =true) int updateStudentAverageByRoll_No(Double average,int roll_no);
	 
}
