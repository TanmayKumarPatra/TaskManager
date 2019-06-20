package com.fse.cognizant.taskmanager.controller;


import com.fse.cognizant.taskmanager.dao.Task;
import com.fse.cognizant.taskmanager.model.TaskObj;
import com.fse.cognizant.taskmanager.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("task")
public class TaskController {
	
	
	@Autowired
	private TaskService taskService;
	
	@PostMapping(value="/add")
	public @ResponseBody String addNewTask (@RequestBody TaskObj task) {

		return taskService.addNewTask(task);
	}

	@GetMapping(value="/all")
	public @ResponseBody List<TaskObj> getAllTasks() {
		return taskService.getAllTasks();
	}
	
	@PutMapping(value="/update")
	public @ResponseBody
	Task updateTask(@RequestBody TaskObj task){
		
		return taskService.updateTask(task);
	}
	
	

}
