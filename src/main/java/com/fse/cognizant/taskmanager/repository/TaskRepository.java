package com.fse.cognizant.taskmanager.repository;

import java.util.List;

import com.fse.cognizant.taskmanager.dao.Task;
import org.springframework.data.repository.CrudRepository;


public interface TaskRepository extends CrudRepository<Task,Integer>{

	List<Task> findAllByProjectId(Integer id);
		
	List<Task> findAllByProjectIdAndStatus(Integer id, String status);
	
}
