package com.bob.controller;

import com.bob.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("team")
public class TeamController {
    @Autowired
    private TeamService teamService;

    @RequestMapping(value = "add.do",method = RequestMethod.GET)
    public ModelAndView addTeam(){
        System.out.println("TeamController addTeam()...");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("add");//view parser
        return mv;
    }

    @RequestMapping(value = "update.do",method = RequestMethod.POST)
    public ModelAndView updateTeam(){
        System.out.println("TeamController updateTeam()...");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("update");//view parser
        return mv;
    }

    @RequestMapping("hello")
    public ModelAndView add(){
        System.out.println("TeamController add()...");
        teamService.add();
        ModelAndView mv = new ModelAndView();
        mv.addObject("teamName","Laker");
        //request.getRequestedDispatcher("index.jsp").forward(...)
        mv.setViewName("index");//view parser
        return mv;
    }
}
