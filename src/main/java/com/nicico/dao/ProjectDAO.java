package com.nicico.dao;

import com.nicico.models.Project;
import org.springframework.stereotype.Repository;

/* com.nicico.dao
@Author:Peyman
Date: 3/8/2018
Time: 11:36 AM
Year: 2018
*/

public interface ProjectDAO {
    void save(Project project);

    Project getProject(int i);
}
