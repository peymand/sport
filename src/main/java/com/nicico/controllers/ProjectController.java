package com.nicico.controllers;

import com.nicico.models.Project;
import com.nicico.services.ProjectService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;

/* com.nicico.controllers
@Author:Peyman
Date: 3/8/2018
Time: 9:13 AM
Year: 2018
*/
@RequestMapping("/project")
@Controller
public class ProjectController {
    final static Logger logger = Logger.getLogger(MainController.class);

    @Autowired
    ProjectService projectService;


    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(Model model){
        model.addAttribute("types", new ArrayList<String>() {
            {
                add("");
                add("Single Year");
                add("Multi Year");
            }
        });

        model.addAttribute("project", new Project());
        return "project_add";
    }
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(@ModelAttribute("project") Project project ,  RedirectAttributes attributes){
        logger.debug("Project is going to save");
        projectService.save(project);
        attributes.addFlashAttribute("project",project);
        return "redirect:/";
    }
}
