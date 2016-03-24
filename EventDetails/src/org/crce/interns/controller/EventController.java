package org.crce.interns.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.crce.interns.beans.Event_detailsBean;
import org.crce.interns.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EventController {
	Integer months;
	@Autowired
	private EventService eventService;

	@RequestMapping("/")
	public ModelAndView welcome() {
		return new ModelAndView("index");
	}

	@RequestMapping("/InsertMonth")
	public ModelAndView createUserWelcome(@ModelAttribute("command") Event_detailsBean edBean) {
		return new ModelAndView("insertMonth");
	}

	@RequestMapping(value = "/SubmitMonth", method = RequestMethod.POST)
	public ModelAndView createUser(@RequestParam("month") Integer month) {
		System.out.println("Month sent from front end :" + month);
		months = month;
		return new ModelAndView("redirect:/ViewEvents");
	}

	@RequestMapping("/ViewEvents")
	public ModelAndView viewEvents() {
		Map<String, Object> modelMap = new HashMap<String, Object>();
		modelMap.put("events", eventService.viewEvents(months));
		System.out.println("In View Events: " + months);
		if (modelMap.isEmpty()) {
			System.out.println("Error no Model map, Model map is null");
		}
		return new ModelAndView("viewEvents", modelMap);
	}

}