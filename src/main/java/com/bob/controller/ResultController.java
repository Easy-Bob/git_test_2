package com.bob.controller;

import com.bob.pojo.Team;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

@Controller
@RequestMapping("result")
public class ResultController {
    //4.return void
    @RequestMapping("test04-1")
    public void test41(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Using HttpServletRequest to directly forward");
        request.getRequestDispatcher("/jsp/OK.jsp").forward(request,response);
    }
    @RequestMapping("test04-2")
    public void test42(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Using HttpServletRequest to redirect");
        response.sendRedirect("/jsp/OK.jsp");
    }
    @RequestMapping("test04-3")
    public void test43(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        System.out.println("return void test--return a String");
        PrintWriter writer = response.getWriter();
        writer.write("return void test--return a String");
        writer.flush();
        writer.close();

    }
    @RequestMapping("test04-4")
    public void test44(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setStatus(302);//302 refers to redirect
        response.setHeader("Location","/jsp/OK.jsp");
    }

    //3.return Object when ajax from front end requests for a result
//        @ReponseBody is required to convert the result to json
    @ResponseBody
    @RequestMapping("test03-1")
    public Integer test031(){
        return 666;
    }
    @ResponseBody
    @RequestMapping("test03-2")
    public String test032(){
        return "test";//return data,distinct from the String
    }

    @ResponseBody
    @RequestMapping("test03-3")
    public Team test033(){
        Team team = new Team();
        team.setTeamName("湖人");
        team.setTeamLocation("Los");
        team.setTeamId(1001);
        return team;
    }
    @ResponseBody
    @RequestMapping("test03-4")
    public List<Team> test034(){
        ArrayList<Team> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Team team = new Team();
            team.setTeamName("湖人"+i);
            team.setTeamLocation("Los"+i);
            team.setTeamId(1001+i);
            list.add(team);
        }
        return list;
    }

    @ResponseBody
    @RequestMapping("test03-5")
    public Map<String,Team> test035(){
        HashMap<String, Team> map = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            Team team = new Team();
            team.setTeamName("湖人"+i);
            team.setTeamLocation("Los"+i);
            team.setTeamId(1001+i);
            team.setCreateDate(new Date());
            map.put(""+team.getTeamId(),team);
        }
        return map;
    }
    //2.return String
    @RequestMapping("test02")
    public String test02(HttpServletRequest request) {
        Team team = new Team();
        team.setTeamLocation("Miami");
        team.setTeamId(1221);
        team.setTeamName("热火");
        //bring data
        request.setAttribute("team", team);
        request.getSession().setAttribute("team", team);
        //url forward
        return "result";
    }
    //1.ModelAndView forward bringing data
    @RequestMapping("test01")
    public ModelAndView test01(){
        ModelAndView mv = new ModelAndView();
        //bring data
        mv.addObject("teamName","湖人");
        mv.setViewName("result");
        return mv;
    }

    @RequestMapping("hello")
    public String hello(){
        return "result";
    }

}
