package com.newlecture.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class indexController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("index controller");
		ModelAndView mv=new ModelAndView();
		mv.addObject("data","Hello Spring mv");//키값과 value값을 담는다
		mv.setViewName("index.jsp");//setView는 객체를 만들어서 설정할수잇다. setViewName 은 이름만설정
		
		return mv;
	}

}
