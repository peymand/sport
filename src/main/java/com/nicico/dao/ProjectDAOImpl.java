package com.nicico.dao;

import com.nicico.models.Project;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/* com.nicico.dao
@Author:Peyman
Date: 3/8/2018
Time: 11:37 AM
Year: 2018
*/
@Repository
public class ProjectDAOImpl implements ProjectDAO {
    @Autowired
    SessionFactory sessionFactory;

    @Transactional
    public void save(Project project) {
        sessionFactory.openSession().save(project);
    }

    @Transactional
    public Project getProject(int i) {
        Project project =  sessionFactory.openSession().get(Project.class,i);
        return project;
    }
}
