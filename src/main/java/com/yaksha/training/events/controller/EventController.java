package com.yaksha.training.events.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yaksha.training.events.entity.Event;

@Controller
@RequestMapping(value = { "/event", "/" })
public class EventController {

	@GetMapping(value = { "/list", "/" })
	public String listEvents(Model model) {
		return "";
	}

	@GetMapping("/addEventForm")
	public String showFormForAdd(Model model) {
		return "";
	}

	@PostMapping("/saveEvent")
	public String saveEvent(@Valid @ModelAttribute("event") Event event, BindingResult bindingResult) {
		return "";
	}

	@GetMapping("/updateEventForm")
	public String showFormForUpdate(@RequestParam("eventId") Long id, Model model) {
		return "";
	}

	@GetMapping("/delete")
	public String deleteEvent(@RequestParam("eventId") Long id) {
		return "";
	}

	@PostMapping("/search")
	public String searchEvents(@RequestParam("theSearchName") String theSearchName, Model theModel) {
		return "";
	}
}
