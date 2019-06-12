package com.fse.cognizant.taskmanager.controller;

import com.fse.cognizant.taskmanager.dao.ParentTask;
import com.fse.cognizant.taskmanager.service.ParentTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@CrossOrigin
@Controller
@RequestMapping(path="/parenttask")
public class ParentTaskController {

	@Autowired
	private ParentTaskService parentTaskService;
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<ParentTask> getAllUsers() {
		return parentTaskService.getAllUsers();
	}
	
	@PostMapping(path="/add")
	public @ResponseBody ParentTask addNew (@RequestBody String task) {
		return parentTaskService.addNew(task);
	}

}
