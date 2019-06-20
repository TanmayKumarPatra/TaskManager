package com.fse.cognizant.taskmanager.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Component
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParentTask {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer parentId;
    private String parentTask;

}
