package com.app.smpt.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.app.smpt.controller.forms.PortfolioForm;

public class PortfolioController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	/*@RequestMapping(method = RequestMethod.GET)
	public ModelAndView showForm()
	{
		return new ModelAndView("portfolio", "loginForm", new PortfolioForm());
	}*/
}
