package com.nicico.services;

import com.nicico.dao.ProjectDAO;
import com.nicico.models.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/* com.nicico.services
@Author:Peyman
Date: 3/8/2018
Time: 11:35 AM
Year: 2018
*/
@Service
public class ProjectService {
    @Autowired
    ProjectDAO projectDAO;
    public void save(Project project){
        projectDAO.save(project);
    }

    public Project getProject(int i) {
        return projectDAO.getProject(i);
    }
}
