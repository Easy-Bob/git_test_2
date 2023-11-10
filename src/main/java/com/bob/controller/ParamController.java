package com.bob.controller;


import com.bob.pojo.Team;
import com.bob.vo.QueryVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Parameter controller
 */
@Controller
@RequestMapping("param")
public class ParamController {
    @RequestMapping("test09")
    public ModelAndView test09(QueryVO vo){
//        method1
        for (Team team : vo.getTeamList()) {
            System.out.println(team);
        }
        return new ModelAndView("OK");
    }

    @RequestMapping("test08")
    public ModelAndView test08(@RequestParam("teamName") List<String> nameList){
//        method1
        for (String s : nameList) {
            System.out.println(s);
        }
        return new ModelAndView("OK");
    }


    @RequestMapping("test07")
    public ModelAndView test07(String[] teamName,HttpServletRequest request){
//        method1
        for (String s : teamName) {
            System.out.println(s);
        }
//        method2
        String[] teams = request.getParameterValues("teamName");
        for (String team : teams) {
            System.out.println(team);
        }
        return new ModelAndView("OK");
    }


    @RequestMapping("test06")
    public ModelAndView test06(Team team){
        System.out.println("test06======");
        System.out.println(team);
        return new ModelAndView("OK");
    }
    @RequestMapping("test05/{id}/{name}/{loc}")
    public ModelAndView test05(@PathVariable("id") Integer teamId,
                               @PathVariable("name") String teamName,
                               @PathVariable("loc") String teamLocation){
        System.out.println("test05======");
        System.out.println(teamId);
        System.out.println(teamName);
        System.out.println(teamLocation);
        return new ModelAndView("OK");
    }

    @RequestMapping("test04")
    public ModelAndView test04(HttpServletRequest request){
        System.out.println("test04======");
        String teamId=  request.getParameter("teamId");
        String teamName= request.getParameter("teamName");
        String teamLocation= request.getParameter("teamLocation");
        System.out.println(teamId);
        System.out.println(teamName);
        System.out.println(teamLocation);
        return new ModelAndView("OK");
    }

    @RequestMapping("test03")
    public ModelAndView test03(@RequestParam(value = "Id",defaultValue = "100") Integer teamId,
                               @RequestParam("Name") String teamName,
                               @RequestParam("Location") String teamLocation){
        System.out.println("test03======");
        System.out.println(teamId);
        System.out.println(teamName);
        System.out.println(teamLocation);
        return new ModelAndView("OK");
    }

    @RequestMapping("test02")
    public ModelAndView test02(Team team){
        System.out.println("test02======");
        System.out.println(team);
        return new ModelAndView("OK");
    }

    @RequestMapping("test01")
    public ModelAndView test01(Integer teamId,String teamName,String teamLocation){
        System.out.println("test01======");
        System.out.println(teamId);
        System.out.println(teamName);
        System.out.println(teamLocation);
        return new ModelAndView("OK");
    }

    @RequestMapping("hello")
    public ModelAndView hello(){
        return new ModelAndView("param");
    }
}
