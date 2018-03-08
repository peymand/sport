package com.nicico.controllers;

import com.nicico.models.Project;
import com.nicico.services.ProjectService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jws.WebParam;

/* com.nicico.controllers
@Author:Peyman
Date: 3/7/2018
Time: 1:05 PM
Year: 2018
*/
@Controller
public class MainController {
    @Autowired
    ProjectService projectService ;

    final static Logger logger = Logger.getLogger(MainController.class);


    @RequestMapping("/")
    public String hello(Model model, @ModelAttribute("project") Project project) {
        if (project.getId() == 0) {
            project = projectService.getProject(1);
            logger.info("Model Attribute is null");
        }

        model.addAttribute("currentProject", project);
        return "home";
    }
}
