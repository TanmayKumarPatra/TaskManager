package com.fse.cognizant.taskmanager.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Component
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer taskId;
	private Integer parentId;
	private Integer projectId;
	private String task;
	private Date startDate;
	private Date endDate;
	private Integer priority;
	private String status;
	private Integer userId;
}
