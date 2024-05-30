package com.yaksha.training.events.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.yaksha.training.events.entity.Event;

@Service
public class EventService {

	public Page<Event> getEvents(Pageable pageable) {
		// write your logic here
		return null;
	}

	public Event saveEvent(Event event) {
		// write your logic here
		return null;
	}

	public Event getEvent(Long id) {
		// write your logic here
		return null;
	}

	public boolean deleteEvent(Long id) {
		// write your logic here
		return false;
	}

	public Page<Event> searchEvents(String theSearchName, Pageable pageable) {
		// write your logic here
		return null;
	}

	public Page<Event> pastEvents(String theSearchName, Pageable pageable) {
		// write your logic here
		return null;
	}
}
