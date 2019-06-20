package com.fse.cognizant.taskmanager.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskObj {

    private Integer taskId;
    private String taskName;
    private boolean parentTask;
    private String projectName;
    private Date startDate;
    private Date endDate;
    private String parentTaskName;
    private Integer parentTaskId;
    private Integer projectId;
    private String userName;
    private Integer userId;
    private Integer priority;
    private String status;
}
