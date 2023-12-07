package com.yaksha.training.events.entity;

public class Event {

	private Long id;

	private String name;

	private String description;

	private String place;

	private String eventDate;

	public Event() {
	}

	public Event(Long id, String name, String description, String place, String eventDate) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.place = place;
		this.eventDate = eventDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getEventDate() {
		return eventDate;
	}

	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}

	@Override
	public String toString() {
		return "Event{" + "id=" + id + ", name='" + name + '\'' + ", description='" + description + '\'' + ", place='"
				+ place + '\'' + ", eventDate='" + eventDate + '\'' + '}';
	}
}
