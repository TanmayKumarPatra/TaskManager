package com.fse.cognizant.taskmanager.controller;

import com.fse.cognizant.taskmanager.dao.ParentTask;
import com.fse.cognizant.taskmanager.service.ParentTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("parenttask")
public class ParentTaskController {

	@Autowired
	private ParentTaskService parentTaskService;
	
	@GetMapping(value="/all")
	public @ResponseBody Iterable<ParentTask> getAllUsers() {
		return parentTaskService.getAllUsers();
	}
	
	@PostMapping(value="/add")
	public @ResponseBody ParentTask addNew (@RequestBody String task) {
		return parentTaskService.addNew(task);
	}

}
