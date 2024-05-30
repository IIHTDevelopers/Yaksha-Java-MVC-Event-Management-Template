package com.yaksha.training.events.controller;

import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yaksha.training.events.entity.Event;

import jakarta.validation.Valid;

@Controller
@RequestMapping(value = { "/event", "/" })
public class EventController {

	@GetMapping(value = { "/list", "/" })
	public String listEvents(@PageableDefault(size = 5) Pageable pageable, Model model) {
		// write your logic here
		return "";
	}

	@GetMapping("/addEventForm")
	public String showFormForAdd(Model model) {
		// write your logic here
		return "";
	}

	@PostMapping("/saveEvent")
	public String saveEvent(@Valid @ModelAttribute("event") Event event, BindingResult bindingResult) {
		// write your logic here
		return "";
	}

	@GetMapping("/updateEventForm")
	public String showFormForUpdate(@RequestParam("eventId") Long id, Model model) {
		// write your logic here
		return "";
	}

	@GetMapping("/delete")
	public String deleteEvent(@RequestParam("eventId") Long id) {
		// write your logic here
		return "";
	}

	@RequestMapping("/search")
	public String searchEvents(@RequestParam(value = "theSearchName", required = false) String theSearchName,
			@PageableDefault(size = 5) Pageable pageable, Model theModel) {
		// write your logic here
		return "";
	}

	@RequestMapping("/pastEvents")
	public String pastEventsEvents(@RequestParam(value = "theSearchName", required = false) String theSearchName,
			@PageableDefault(size = 5) Pageable pageable, Model theModel) {
		// write your logic here
		return "";
	}
}
